package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * 接谈信息实体
 *
 * @Date 2021/7/29 14:05
 * @Created by doujinpeng
 * @Project petition-web
 * @Version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InterviewInfo extends BaseEntity {
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
     * 主要诉求
     */
    private String content;

    public InterviewInfo() {
    }

    public InterviewInfo(String subject, String place, String category, String content) {
        this.subject = subject;
        this.place = place;
        this.category = category;
        this.content = content;
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
}
