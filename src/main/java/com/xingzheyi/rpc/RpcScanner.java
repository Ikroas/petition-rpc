package com.xingzheyi.rpc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;
import org.springframework.util.SystemPropertyUtils;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Date 2021/12/21 18:05
 * @Created by longhu@xingzheyi.com
 * @Project petition-web
 * @Version 1.0
 */
@Component
public class RpcScanner implements BeanDefinitionRegistryPostProcessor, ResourceLoaderAware, ApplicationContextAware {
    private static final String DEFAULT_RESOURCE_PATTERN = "/**/*.class";
    private MetadataReaderFactory metadataReaderFactory;
    private ResourcePatternResolver resourcePatternResolver;
    private ApplicationContext applicationContext;

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        // 开始扫描包，获取字节码
        Set<Class<?>> beanClazzSet = scannerPackages();
        for (Class<?> beanClazz : beanClazzSet) {
            // 判断是否是需要被代理的接口
            if (isNotNeedProxy(beanClazz)) {
                continue;
            }
            // BeanDefinition构建器
            BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(beanClazz);
            GenericBeanDefinition definition = (GenericBeanDefinition) builder.getRawBeanDefinition();
            //在这里，我们可以给该对象的属性注入对应的实例。
            definition.getConstructorArgumentValues().addIndexedArgumentValue(0, beanClazz);
            definition.getConstructorArgumentValues().addIndexedArgumentValue(1, applicationContext);
            // 定义Bean工程(最终会用上面add的构造函数参数值作为参数调用RepositoryFactory的构造方法)
            definition.setBeanClass(RpcProxyFactoryBean.class);
            //这里采用的是byType方式注入，类似的还有byName等
            definition.setAutowireMode(GenericBeanDefinition.AUTOWIRE_BY_TYPE);
            // 首字母小写注入容器
            String beanName = getBeanName(beanClazz);
            beanDefinitionRegistry.registerBeanDefinition(beanName, definition);
        }
    }

    private String getBeanName(Class beanClazz) {
        String simpleName = beanClazz.getSimpleName();
        return simpleName.substring(0, 1).toLowerCase() + simpleName.substring(1);
    }

    /**
     * description: 是否是需要被代理的接口
     * version: 1.0
     * date: 2021/3/7 17:35
     * author: Silwings
     *
     * @param beanClazz 类对象
     * @return boolean 如果不是需要被代理的接口返回true
     */
    private boolean isNotNeedProxy(Class beanClazz) {
        String[] beanNamesForType = applicationContext.getBeanNamesForType(beanClazz);
        // 如果不是接口,或者其实现的接口小于等于0,或者其实现的第一个接口不是Repository,或者没有添加@NeedProxy注解,则说明不是需要被代理的接口
        return !beanClazz.isInterface() || beanNamesForType.length > 0 || null == AnnotatedElementUtils.findMergedAnnotation(beanClazz, RpcService.class);
    }

    private Set<Class<?>> scannerPackages() {
        Set<Class<?>> set = new LinkedHashSet<>();
        // 此处固定写法即可,含义就是包及子包下的所有类
        String packageSearchPath = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX
                .concat(ClassUtils.convertClassNameToResourcePath(SystemPropertyUtils.resolvePlaceholders("com.xingzheyi.rpc"))
                        .concat(DEFAULT_RESOURCE_PATTERN));
        try {
            Resource[] resources = this.resourcePatternResolver.getResources(packageSearchPath);
            for (Resource resource : resources) {
                if (resource.isReadable()) {
                    MetadataReader metadataReader = this.metadataReaderFactory.getMetadataReader(resource);
                    String className = metadataReader.getClassMetadata().getClassName();
                    Class<?> clazz;
                    try {
                        clazz = Class.forName(className);
                        set.add(clazz);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return set;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        // 该方法空实现即可,用不到
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourcePatternResolver = ResourcePatternUtils.getResourcePatternResolver(resourceLoader);
        this.metadataReaderFactory = new CachingMetadataReaderFactory(resourceLoader);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
