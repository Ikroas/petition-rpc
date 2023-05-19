package com.xingzheyi.rpc.args;

import com.xingzheyi.petition.commons.base.BaseEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @Date 2020/9/8 10:28
 * @Created by longhu@xingzheyi.com
 * @Project smart-petition
 * @Version 1.0
 */
public class RMIPreventEvent extends BaseEntity {
    /**
     * 事件日期
     */
    private LocalDate date;
    /**
     * 事件开始时间
     */
    private LocalDateTime beginTime;
    /**
     * 事件结束时间
     */
    private LocalDateTime endTime;
    /**
     * 目标ID
     */
    private Integer targetId;
    /**
     * 目标名字
     */
    private String targetName;
    /**
     * 预警类型 0无需预警 1省级走访预警 2市级走访预警 3 本级走访预警 4离境风险预警 5行为异常预警
     */
    private int type;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
