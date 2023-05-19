package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * ES检索分词响应实体
 *
 * @Date 2021/8/31 14:26
 * @Created by xxp@xingzheyi.com
 * @Project petition-web
 * @Version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchResp extends BaseEntity {
    private int status;

    private String message;

    private String data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
