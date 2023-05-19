package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * AI智能受理类型
 *
 * @Date 2021/7/29 14:46
 * @Created by doujinpeng
 * @Project petition-web
 * @Version 1.0
 */
public class AutoAcceptType extends BaseEntity {
    /**
     * 智能受理类型
     */
    @JsonProperty("smart_accept_type")
    private Integer smartAcceptType;

    public AutoAcceptType() {
    }

    public AutoAcceptType(Integer smartAcceptType) {
        this.smartAcceptType = smartAcceptType;
    }

    public Integer getSmartAcceptType() {
        return smartAcceptType;
    }

    public void setSmartAcceptType(Integer smartAcceptType) {
        this.smartAcceptType = smartAcceptType;
    }
}
