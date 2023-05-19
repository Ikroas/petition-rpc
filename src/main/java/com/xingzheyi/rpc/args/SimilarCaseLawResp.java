package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xingzheyi.petition.commons.base.BaseEntity;

import java.util.List;

/**
 * 矛盾诉求查询相关法律和类似案例ES查询接口
 * @Date 2021/11/1 18:58
 * @Created by lfd@shichazhe.com
 * @Project petition-commons
 * @Version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SimilarCaseLawResp extends BaseEntity {
    private int status;

    private String message;

    private List<SimilarCaseLawData> data;

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

    public List<SimilarCaseLawData> getData() {
        return data;
    }

    public void setData(List<SimilarCaseLawData> data) {
        this.data = data;
    }
}
