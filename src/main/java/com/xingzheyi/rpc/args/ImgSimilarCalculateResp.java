package com.xingzheyi.rpc.args;

/**
 * @Date 2020/11/4 11:28
 * @Created by longhu@xingzheyi.com
 * @Project petition-analysis
 * @Version 1.0
 */
public class ImgSimilarCalculateResp extends AlgorithmResultBase {
    /**
     * 图片相似度
     */
    private double data;

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }
}
