package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * AI自动分配窗口结果实体
 *
 * @Date 2021/7/29 14:05
 * @Created by doujinpeng
 * @Project petition-web
 * @Version 1.0
 */
public class DispatchWindowResp extends BaseEntity {
    /**
     * 是否有匹配(0未匹配，1匹配)
     */
    private int isMatch;
    /**
     * 牵头单位
     */
    @JsonProperty("lead_org_name")
    private String leadOrgName;
    /**
     * 事项ID
     */
    @JsonProperty("matterID")
    private int matterId;
    /**
     * 快捷导访ID
     */
    @JsonProperty("quick_id")
    private int quickId;

    public DispatchWindowResp() {
    }

    public DispatchWindowResp(int isMatch, String leadOrgName, int matterId, int quickId) {
        this.isMatch = isMatch;
        this.leadOrgName = leadOrgName;
        this.matterId = matterId;
        this.quickId = quickId;
    }

    public int getIsMatch() {
        return isMatch;
    }

    public void setIsMatch(int isMatch) {
        this.isMatch = isMatch;
    }

    public String getLeadOrgName() {
        return leadOrgName;
    }

    public void setLeadOrgName(String leadOrgName) {
        this.leadOrgName = leadOrgName;
    }

    public int getMatterId() {
        return matterId;
    }

    public void setMatterId(int matterId) {
        this.matterId = matterId;
    }

    public int getQuickId() {
        return quickId;
    }

    public void setQuickId(int quickId) {
        this.quickId = quickId;
    }
}
