package com.xingzheyi.rpc.args;

import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * 上行风险推送请求
 *
 * @Date 2022/2/18 10:56
 * @Created by lfd@shichazhe.com
 * @Project petition-rpc
 * @Version 1.0
 */
public class UpsideRiskWarningPush  extends BaseEntity {
    /**
     * 风险值
     */
    private double prob;
    /**
     * 信访人id
     */
    private int visitorId;

    public UpsideRiskWarningPush() {
    }

    public UpsideRiskWarningPush(int visitorId, double prob) {
        this.prob = prob;
        this.visitorId = visitorId;
    }

    public double getProb() {
        return prob;
    }

    public void setProb(double prob) {
        this.prob = prob;
    }

    public int getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(int visitorId) {
        this.visitorId = visitorId;
    }
}
