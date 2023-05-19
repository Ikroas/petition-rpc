package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * AI内容分配请求实体
 *
 * @Date 2021/7/29 14:26
 * @Created by doujinpeng
 * @Project petition-web
 * @Version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Content extends BaseEntity {
    /**
     * 内容
     */
    private String content;

    public Content() {
    }

    public Content(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
