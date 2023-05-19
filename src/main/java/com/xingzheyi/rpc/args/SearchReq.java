package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * ES检索分词请求实体
 *
 * @Date 2021/8/31 14:26
 * @Created by xxp@xingzheyi.com
 * @Project petition-web
 * @Version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchReq extends BaseEntity {
    /**
     * 内容
     */
    private String sentence;

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public SearchReq() {
    }

    public SearchReq(String sentence) {
        this.sentence = sentence;
    }
}
