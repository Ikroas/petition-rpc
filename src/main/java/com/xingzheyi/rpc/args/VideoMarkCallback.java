package com.xingzheyi.rpc.args;

import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * 视频标注请求实体
 *
 * @Date 2020/9/8 19:21
 * @Created by chl@xingzheyi.com
 * @Project petition-analysis
 * @Version 1.0
 */
public class VideoMarkCallback extends BaseEntity {
    /**
     * 返回错误码  0成功 1失败
     */
    private int status;
    /**
     * 返回结果备注
     */
    private String msg;
    /**
     * 标注后视频信息
     */
    private VideoMarkCallbackData data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public VideoMarkCallbackData getData() {
        return data;
    }

    public void setData(VideoMarkCallbackData data) {
        this.data = data;
    }
}
