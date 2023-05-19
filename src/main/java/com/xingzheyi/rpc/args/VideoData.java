package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingzheyi.petition.commons.base.BaseEntity;

import java.util.List;

/**
 * @Date 2020/11/4 11:26
 * @Created by longhu@xingzheyi.com
 * @Project petition-analysis
 * @Version 1.0
 */
public class VideoData extends BaseEntity {
    /**
     * 事件原始视频所属的桶的名称
     */
    @JsonProperty("bucket_name")
    private String bucketName;
    /**
     * 视频处理后存放的桶的名称
     */
    @JsonProperty("trajectory_bucket_name")
    private String trajectoryBucketName;
    /**
     * 防控事件的视频列表
     */
    @JsonProperty("video_list")
    private List<String> videoList;

    public VideoData(){

    }

    public VideoData(String bucketName, String trajectoryBucketName, List<String> videoList) {
        this.bucketName = bucketName;
        this.trajectoryBucketName = trajectoryBucketName;
        this.videoList = videoList;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getTrajectoryBucketName() {
        return trajectoryBucketName;
    }

    public void setTrajectoryBucketName(String trajectoryBucketName) {
        this.trajectoryBucketName = trajectoryBucketName;
    }

    public List<String> getVideoList() {
        return videoList;
    }

    public void setVideoList(List<String> videoList) {
        this.videoList = videoList;
    }
}
