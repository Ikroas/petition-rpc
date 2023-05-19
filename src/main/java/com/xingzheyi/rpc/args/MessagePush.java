package com.xingzheyi.rpc.args;

import com.xingzheyi.petition.commons.base.BaseEntity;

import java.util.Set;

/**
 * @Date 2020/10/15 10:28
 * @Created by chl@xingzheyi.com
 * @Project smart-petition
 * @Version 1.0
 */
public class MessagePush extends BaseEntity {
    /**
     * 模板
     */
    private String template;
    /**
     * 页面URl
     */
    private String pageUrl;
    /**
     * 用户ID
     */
    private Set<Integer> userIds;
    /**
     * 模板参数
     */
    private Object[] params;

    public MessagePush() {
    }

    public MessagePush(String template, String pageUrl, Set<Integer> userIds, Object[] params) {
        this.template = template;
        this.pageUrl = pageUrl;
        this.userIds = userIds;
        this.params = params;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public Set<Integer> getUserIds() {
        return userIds;
    }

    public void setUserIds(Set<Integer> userIds) {
        this.userIds = userIds;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }
}
