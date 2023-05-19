package com.xingzheyi.rpc;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

import static com.xingzheyi.rpc.CallUtil.*;

/**
 * @Date 2021/12/22 8:54
 * @Created by longhu@xingzheyi.com
 * @Project petition-ctrl
 * @Version 1.0
 */
@RestController
public class RpcController implements ApplicationContextAware {

    private Logger log = LoggerFactory.getLogger(getClass());
    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @PostMapping("/rpc/invoke")
    public void invoke(HttpServletRequest request, HttpServletResponse response) {
        String serviceName = request.getHeader(SERVICE_NAME);
        String accessToken = request.getHeader(ACCESS_TOKEN);
        String token = DigestUtils.sha256Hex(serviceName + SECRET_KEY);
        Call call = null;
        Exception e = null;
        if (!token.equals(accessToken)) {
            log.error("access denied serviceName:{}", serviceName);
            e = new RuntimeException("access denied");
        } else {
            try {
                call = (Call) SerializeUtil.parseObject(request.getInputStream());
                String className = call.getClassName();
                String methodName = call.getMethodName();
                Object[] params = call.getParams();
                Class<?>[] paramTypes = call.getParamTypes();
                Class<?> classType = Class.forName(className);
                Object service = context.getBean(classType);
                Method method = classType.getMethod(methodName, paramTypes);
                Object result = method.invoke(service, params);
                call.setResult(result);
            } catch (Exception ex) {
                log.error("rpc invoke error, requestUrl:{}, call:{}, ex:{}", request.getRequestURL(), call, ex.getMessage(), ex);
                e = ex;
            }
        }
        if (call == null) {
            call = new Call();
        }
        call.setException(e);
        try {
            byte[] bytes = SerializeUtil.toBytes(call);
            response.getOutputStream().write(bytes);
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
    }
}
