package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingzheyi.petition.commons.base.BaseEntity;

import java.util.List;

/**
 * AI智能受理请求实体
 *
 * @Date 2021/7/29 14:43
 * @Created by doujinpeng
 * @Project petition-web
 * @Version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AcceptInfo extends BaseEntity {
    /**
     * 信访人ID
     */
    @JsonProperty("visitor_ids")
    private List<String> visitorIds;
    /**
     * 内容/概要
     */
    @JsonProperty("content")
    private String content;
    /**
     * 处理单位
     */
    @JsonProperty("handle_org")
    private String handleOrg;
    /**
     * 信件编号
     */
    @JsonProperty("letter_code")
    private String letterCode;

    public AcceptInfo() {
    }

    public AcceptInfo(List<String> visitorIds, String content, String handleOrg, String letterCode) {
        this.visitorIds = visitorIds;
        this.content = content;
        this.handleOrg = handleOrg;
        this.letterCode = letterCode;
    }

    public List<String> getVisitorIds() {
        return visitorIds;
    }

    public void setVisitorIds(List<String> visitorIds) {
        this.visitorIds = visitorIds;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHandleOrg() {
        return handleOrg;
    }

    public void setHandleOrg(String handleOrg) {
        this.handleOrg = handleOrg;
    }

    public String getLetterCode() {
        return letterCode;
    }

    public void setLetterCode(String letterCode) {
        this.letterCode = letterCode;
    }
}
