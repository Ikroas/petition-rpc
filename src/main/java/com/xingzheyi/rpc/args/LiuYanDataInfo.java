package com.xingzheyi.rpc.args;

import com.xingzheyi.petition.commons.base.BaseEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 留言板信息实体
 *
 * @Date 2021/4/26 9:03
 * @Created by xxp@xingzheyi.com
 * @Project petition-analysis
 * @Version 1.0
 */
public class LiuYanDataInfo extends BaseEntity {
    private int id;
    /** 留言ID */
    private int tid;
    /** 日期 */
    private LocalDate date;
    /** 用户名称 */
    private String nickName;
    /** 用户名称 */
    private String userName;
    /** 电话 */
    private String telephone;
    /** 信访人ID */
    private Integer visitorId;
    /** 主题 */
    private String subject;
    /** 投诉内容 */
    private String content;
    /** 用户IP */
    private String ip;
    /** 留言状态 */
    private String stateInfo;
    /** 回复状态 */
    private String traceInfo;
    /** 流程状态 */
    private String processInfo;
    /** 意见领导 */
    private String forumName;
    /** 分类 */
    private String classify;
    /** 领域 */
    private String field;
    /** 来源 */
    private String sourceName;
    /** 来源地 */
    private String from;
    /** 备注 */
    private String remarks;
    /** 留言时间 */
    private LocalDateTime messageTime;
    /** 发生地 */
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Integer visitorId) {
        this.visitorId = visitorId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public String getTraceInfo() {
        return traceInfo;
    }

    public void setTraceInfo(String traceInfo) {
        this.traceInfo = traceInfo;
    }

    public String getProcessInfo() {
        return processInfo;
    }

    public void setProcessInfo(String processInfo) {
        this.processInfo = processInfo;
    }

    public String getForumName() {
        return forumName;
    }

    public void setForumName(String forumName) {
        this.forumName = forumName;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public LocalDateTime getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(LocalDateTime messageTime) {
        this.messageTime = messageTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
