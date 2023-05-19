package com.xingzheyi.rpc;


import java.io.Serializable;
import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @Date 2021/12/22 8:56
 * @Created by longhu@xingzheyi.com
 * @Project petition-ctrl
 * @Version 1.0
 */
public class Call implements Serializable {
    private String serviceName;
    private String className;
    private String methodName;
    private Class<?>[] paramTypes;
    private Object[] params;
    private Class<?> returnType;
    private Object result;
    private Exception exception;

    @Override
    public String toString() {
        return new StringJoiner(", ", Call.class.getSimpleName() + "[", "]")
                .add("serviceName='" + serviceName + "'")
                .add("className='" + className + "'")
                .add("methodName='" + methodName + "'")
                .add("paramTypes=" + Arrays.toString(paramTypes))
                .add("params=" + Arrays.toString(params))
                .add("returnType=" + returnType)
                .toString();
    }

    public Call() {
    }

    public Call(String serviceName, String className, String methodName, Class<?>[] paramTypes, Object[] params, Class<?> returnType) {
        this.serviceName = serviceName;
        this.className = className;
        this.methodName = methodName;
        this.paramTypes = paramTypes;
        this.params = params;
        this.returnType = returnType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getClassName() {
        return className;
    }

    public String getMethodName() {
        return methodName;
    }

    public Class<?>[] getParamTypes() {
        return paramTypes;
    }

    public Object[] getParams() {
        return params;
    }

    public Class<?> getReturnType() {
        return returnType;
    }

    public Object getResult() {
        return result;
    }

    public Exception getException() {
        return exception;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }
}
