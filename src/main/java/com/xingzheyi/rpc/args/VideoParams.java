package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * 防控视频分辨率
 *
 * @Date 2020/10/21 14:52
 * @Created by xxp@xingzheyi.com
 * @Project petition-analysis
 * @Version 1.0
 */
public class VideoParams extends BaseEntity {
    private int width;
    private int height;
    @JsonProperty("bite_rate")
    private String biteRate;

    public VideoParams(){

    }

    public VideoParams(int width, int height, String biteRate) {
        this.width = width;
        this.height = height;
        this.biteRate = biteRate;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getBiteRate() {
        return biteRate;
    }

    public void setBiteRate(String biteRate) {
        this.biteRate = biteRate;
    }
}
