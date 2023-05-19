package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * 相似的调处、接待记录实体
 *
 * @Date 2021/7/29 14:37
 * @Created by doujinpeng
 * @Project petition-web
 * @Version 1.0
 */
public class SimilarRecord extends BaseEntity {
    /**
     * 诉求综合表ID
     */
    @JsonProperty(value = "appeal_id")
    private int appealId;
    /**
     * 相似度
     */
    private double similarity;
    /**
     * 全国初件标志
     */
    @JsonProperty(value = "repeat_flag")
    private int repeatFlag;

    public SimilarRecord() {
    }

    public SimilarRecord(int appealId, double similarity, int repeatFlag) {
        this.similarity = similarity;
        this.repeatFlag = repeatFlag;
    }

    public int getAppealId() {
        return appealId;
    }

    public void setAppealId(int appealId) {
        this.appealId = appealId;
    }

    public double getSimilarity() {
        return similarity;
    }

    public void setSimilarity(double similarity) {
        this.similarity = similarity;
    }

    public int getRepeatFlag() {
        return repeatFlag;
    }

    public void setRepeatFlag(int repeatFlag) {
        this.repeatFlag = repeatFlag;
    }
}
