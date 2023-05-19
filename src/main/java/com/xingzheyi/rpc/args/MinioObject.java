package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * @Date 2020/11/4 10:18
 * @Created by longhu@xingzheyi.com
 * @Project petition-analysis
 * @Version 1.0
 */
public class MinioObject extends BaseEntity {
    @JsonProperty("bucket_name")
    private String bucketName;
    @JsonProperty("object_name")
    private String objectName;

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
