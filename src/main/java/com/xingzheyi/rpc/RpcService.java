package com.xingzheyi.rpc;

import org.springframework.web.bind.annotation.Mapping;

import java.lang.annotation.*;

/**
 * @Date 2021/12/21 18:12
 * @Created by longhu@xingzheyi.com
 * @Project petition-web
 * @Version 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface RpcService {

    String name() default "";
}
