package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * 红头文件校验请求实体
 *
 * @Date 2021/7/29 13:53
 * @Created by doujinpeng
 * @Project petition-web
 * @Version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RedHeaderFileReq extends BaseEntity {
    /**
     * 文件名称
     */
    @JsonProperty("file_name")
    private String filename;
    /**
     * 在minio中对应的存储桶的名称
     */
    @JsonProperty("bucket_name")
    private String bucketName;
    /**
     * 存储在minio中的对象名称
     */
    @JsonProperty("object_name")
    private String objectName;

    public RedHeaderFileReq() {
    }

    public RedHeaderFileReq(String filename, String bucketName, String objectName) {
        this.filename = filename;
        this.bucketName = bucketName;
        this.objectName = objectName;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
}
