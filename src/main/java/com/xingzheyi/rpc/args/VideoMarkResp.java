package com.xingzheyi.rpc.args;

/**
 * @Date 2020/11/4 11:28
 * @Created by longhu@xingzheyi.com
 * @Project petition-analysis
 * @Version 1.0
 */
public class VideoMarkResp extends AlgorithmResultBase {
    /**
     * 算法服务正在处理的事件ID
     */
    private VideoMarkCallbackData data;

    public VideoMarkCallbackData getData() {
        return data;
    }

    public void setData(VideoMarkCallbackData data) {
        this.data = data;
    }
}
