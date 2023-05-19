package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * 处理策略
 *
 * @Date 2021/7/29 14:52
 * @Created by doujinpeng
 * @Project petition-web
 * @Version 1.0
 */
public class HandleStrategy extends BaseEntity {
    /**
     * 处理意见
     */
    private String handle;
    /**
     * 心理
     */
    private String psychology;
    /**
     * 案例
     */
    @JsonProperty("case")
    private String caseStr;
    /**
     * 法律
     */
    private String law;

    public HandleStrategy() {
    }

    public HandleStrategy(String handle, String psychology, String caseStr, String law) {
        this.handle = handle;
        this.psychology = psychology;
        this.caseStr = caseStr;
        this.law = law;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getPsychology() {
        return psychology;
    }

    public void setPsychology(String psychology) {
        this.psychology = psychology;
    }

    public String getCaseStr() {
        return caseStr;
    }

    public void setCaseStr(String caseStr) {
        this.caseStr = caseStr;
    }

    public String getLaw() {
        return law;
    }

    public void setLaw(String law) {
        this.law = law;
    }
}
