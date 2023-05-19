package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * 信件办理信息
 *
 * @Date 2021/7/29 14:51
 * @Created by doujinpeng
 * @Project petition-web
 * @Version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HandleCaseInfo extends BaseEntity {
    private String code;
    /**
     * 信访人身份证号
     */
    @JsonProperty("id_number")
    private String idNumber;
    /**
     * 主题
     */
    private String subject;
    /**
     * 地点
     */
    private String place;
    /**
     * 内容分类
     */
    private String category;
    /**
     * 内容
     */
    private String content;

    public HandleCaseInfo() {
    }

    public HandleCaseInfo(String code, String idNumber, String subject, String place, String category, String content) {
        this.code = code;
        this.idNumber = idNumber;
        this.subject = subject;
        this.place = place;
        this.category = category;
        this.content = content;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
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
}
