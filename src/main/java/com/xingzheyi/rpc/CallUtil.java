package com.xingzheyi.rpc;

import okhttp3.*;
import org.apache.commons.codec.digest.DigestUtils;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

/**
 * @Date 2021/12/22 16:15
 * @Created by longhu@xingzheyi.com
 * @Project petition-rpc
 * @Version 1.0
 */
class CallUtil {
    static final String SECRET_KEY = "a66fe691b6aa64cf6b18ad6dc7e9928f95098f67";
    static final String SERVICE_NAME = "Service-Name";
    static final String ACCESS_TOKEN = "Access-Token";

    private static final MediaType OCTET_STREAM = MediaType.parse("application/octet-stream; charset=utf-8");

    private static final OkHttpClient client = buildOkHttpClient();

    static Object call(Call call, String url) throws Exception {
        RequestBody requestBody = RequestBody.create(OCTET_STREAM, SerializeUtil.toBytes(call));
        String token = DigestUtils.sha256Hex(call.getServiceName() + SECRET_KEY);
        Request request = new Request.Builder().url(url)
                .header(SERVICE_NAME, call.getServiceName())
                .header(ACCESS_TOKEN, token)
                .post(requestBody)
                .build();
        try (Response response = client.newCall(request).execute()) {
            ResponseBody body = response.body();
            if (body != null) {
                Call remoteCall = (Call) SerializeUtil.parseObject(body.byteStream());
                if (remoteCall.getException() != null) {
                    throw remoteCall.getException();
                }
                return remoteCall.getResult();
            }
            throw new NullPointerException("call remote method error response body is null, call:" + call + ", url:" + url);
        }
    }

    private static X509TrustManager x509TrustManager() {
        return new X509TrustManager() {
            @Override
            public void checkClientTrusted(X509Certificate[] x509Certificates, String s) {
            }

            @Override
            public void checkServerTrusted(X509Certificate[] x509Certificates, String s) {
            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        };
    }

    private static SSLSocketFactory sslSocketFactory() throws Exception {
        //信任任何链接
        SSLContext sslContext = SSLContext.getInstance("SSL");
        sslContext.init(null, new TrustManager[]{x509TrustManager()}, new SecureRandom());
        return sslContext.getSocketFactory();
    }

    private static ConnectionPool pool() {
        return new ConnectionPool(200, 5, TimeUnit.MINUTES);
    }

    private static OkHttpClient buildOkHttpClient() {
        OkHttpClient.Builder builder;
        try {
            builder = new OkHttpClient.Builder()
                    .sslSocketFactory(sslSocketFactory(), x509TrustManager())
                    .hostnameVerifier((s, sslSession) -> true)
                    .retryOnConnectionFailure(true)
                    .connectionPool(pool())
                    .connectTimeout(60, TimeUnit.SECONDS)
                    .readTimeout(60, TimeUnit.SECONDS);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return builder.build();
    }


}
