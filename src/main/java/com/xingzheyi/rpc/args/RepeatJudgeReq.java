package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * @Date 2021/7/29 14:33
 * @Created by doujinpeng
 * @Project petition-web
 * @Version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RepeatJudgeReq extends BaseEntity {
    /**
     * 投诉主题
     */
    private String subject;
    /**
     * 问题属地
     */
    private String place;
    /**
     * 问题分类
     */
    private String category;
    /**
     * 来访内容
     */
    private String content;
    /**
     * 身份证号
     */
    @JsonProperty(value = "id_number")
    private String idNumber;

    public RepeatJudgeReq() {
    }

    public RepeatJudgeReq(String subject, String place, String category, String content, String idNumber) {
        this.subject = subject;
        this.place = place;
        this.category = category;
        this.content = content;
        this.idNumber = idNumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
