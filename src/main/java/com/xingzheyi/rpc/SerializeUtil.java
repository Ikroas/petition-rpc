package com.xingzheyi.rpc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.*;

/**
 * @Date 2021/12/22 16:08
 * @Created by longhu@xingzheyi.com
 * @Project petition-rpc
 * @Version 1.0
 */
public class SerializeUtil {
    private static final ObjectMapper mapper = new ObjectMapper();

    static {
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    }

    /**
     * 将JSON字符串解析成java对象
     *
     * @param jsonStr   JSON字符串
     * @param valueType java对象Class
     * @return java对象
     */
    public static <T> T parseJSON(String jsonStr, Class<T> valueType) throws IOException {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper.readValue(jsonStr, valueType);
    }

    /**
     * 将java对象转成JSON字符串
     *
     * @param object java对象
     * @return JSON字符串
     */
    public static String toJSONString(Object object) throws JsonProcessingException {
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        return mapper.writeValueAsString(object);
    }

    public static byte[] toBytes(Object object) throws IOException {
        try (ByteArrayOutputStream out = new ByteArrayOutputStream(); ObjectOutputStream objOut = new ObjectOutputStream(out)) {
            objOut.writeObject(object);
            objOut.flush();
            return out.toByteArray();
        }
    }

    public static Object parseObject(InputStream in) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objIn = new ObjectInputStream(in)) {
            return objIn.readObject();
        }
    }
}
