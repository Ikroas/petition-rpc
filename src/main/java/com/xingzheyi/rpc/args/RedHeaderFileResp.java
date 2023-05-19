package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * 红头文件校验结果实体
 *
 * @Date 2021/7/29 13:58
 * @Created by doujinpeng
 * @Project petition-web
 * @Version 1.0
 */
public class RedHeaderFileResp extends BaseEntity {
    /**
     * 结果 0成功，否则，失败
     */
    private int ret;
    /**
     * 错误信息
     */
    private String message;
    /**
     * 是否红头文件（0-否，1-是）
     */
    @JsonProperty("is_redhead")
    private int isRedhead;

    public RedHeaderFileResp() {
    }

    public RedHeaderFileResp(int ret, String message, int isRedhead) {
        this.ret = ret;
        this.message = message;
        this.isRedhead = isRedhead;
    }

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getIsRedhead() {
        return isRedhead;
    }

    public void setIsRedhead(int isRedhead) {
        this.isRedhead = isRedhead;
    }
}
