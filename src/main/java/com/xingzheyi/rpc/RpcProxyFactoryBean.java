package com.xingzheyi.rpc;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.spring.util.NacosUtils;
import com.xingzheyi.petition.commons.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.util.Assert;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @Date 2021/12/21 16:00
 * @Created by longhu@xingzheyi.com
 * @Project petition-web
 * @Version 1.0
 */
public class RpcProxyFactoryBean implements FactoryBean<Object>, InitializingBean, InvocationHandler {

    private static final Logger log = LoggerFactory.getLogger(RpcProxyFactoryBean.class);

    private Object serviceProxy;
    private Class<?> serviceInterface;
    private String serviceName;
    private ApplicationContext applicationContext;
    private String url;

    public RpcProxyFactoryBean(Class<?> serviceInterface, ApplicationContext applicationContext) {
        this.serviceInterface = serviceInterface;
        this.applicationContext = applicationContext;
        Assert.notNull(serviceInterface, "Property 'serviceInterface' is required");
        if (!serviceInterface.isAnnotationPresent(RpcService.class)) {
            throw new IllegalStateException("serviceInterface:" + serviceInterface.getName() + " is required RpcService annotation");
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.serviceProxy = Proxy.newProxyInstance(serviceInterface.getClassLoader(), new Class[]{serviceInterface}, this);
        this.serviceName = serviceInterface.getAnnotation(RpcService.class).name();
        String serverAddr = applicationContext.getEnvironment().getProperty("nacos.config.server-addr");
        if (StringUtil.isNotBlank(serverAddr)) {
            Properties properties = new Properties();
            properties.put("serverAddr", serverAddr);
            ConfigService configService = NacosFactory.createConfigService(properties);
            String serviceCommonConfig = configService.getConfig("service", "common", 5000);
            LinkedHashMap map = SerializeUtil.parseJSON(serviceCommonConfig, LinkedHashMap.class);
            if (map.containsKey("service_conf")) {
                Map serviceConf = (Map) map.get("service_conf");
                if (serviceConf.containsKey(serviceName)) {
                    String host = (String) ((Map) serviceConf.get(serviceName)).get("host");
                    String config = configService.getConfig(serviceName, serviceName, 5000);
                    Properties prop = NacosUtils.toProperties(config, ConfigType.PROPERTIES.getType());
                    String serverPort = prop.getProperty("server.port");
                    if (serverPort != null && !serverPort.isEmpty()) {
                        this.url = String.format("http://%s:%s/rpc/invoke", host, serverPort);
                    }
                }
            }
        }
    }

    @Override
    public Object getObject() {
        if (this.url != null && !this.url.isEmpty()) {
            return this.serviceProxy;
        }
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return serviceInterface;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        Call call = new Call(serviceName, serviceInterface.getName(), method.getName(), method.getParameterTypes(), args, method.getReturnType());
        try {
            return CallUtil.call(call, url);
        } catch (Exception e) {
            log.error("rpc invoke failed, call:{}, url:{}, error:{}", call, url, e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }

}
