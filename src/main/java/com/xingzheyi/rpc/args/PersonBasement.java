package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingzheyi.petition.commons.base.BaseEntity;

import java.util.List;

/**
 * @Date 2020/11/4 11:23
 * @Created by longhu@xingzheyi.com
 * @Project petition-analysis
 * @Version 1.0
 */
public class PersonBasement extends BaseEntity {
    @JsonProperty("bucket_name")
    private String bucketName;
    @JsonProperty("img_list")
    private List<String> imgList;

    public PersonBasement(){

    }

    public PersonBasement(String bucketName, List<String> imgList) {
        this.bucketName = bucketName;
        this.imgList = imgList;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public List<String> getImgList() {
        return imgList;
    }

    public void setImgList(List<String> imgList) {
        this.imgList = imgList;
    }
}
