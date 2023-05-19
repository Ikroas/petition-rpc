package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.xingzheyi.petition.commons.base.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Date 2021/8/25 17:37
 * @Created by longhu@xingzheyi.com
 * @Project petition-commons
 * @Version 1.0
 */
public class RmiReceptionEvent extends BaseEntity {
    /**
     * 事件ID
     */
    private int eventId;
    /**
     * 姓名
     */
    private String name;
    /**
     * 访客类别 1 A类重访人员 2普通重访人员 3工作人员 4未知人员
     */
    private int type;
    /**
     * 访客类别描述
     */
    private String typeStr;
    /**
     * 图像识别目标ID
     */
    private int detectTargetId;
    /**
     * 身份证号
     */
    private String idNumber;
    /**
     * 进入时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime time;
    /**
     * 照片信息
     */
    private List<RmiReceptionEventImg> images;
    /**
     * 矛调中心ID
     */
    private int conflictMediateCenterId;
    /**
     * 情绪识别结果（0表示无 1愤怒2悲伤3其他）
     */
    private int eventEmotion;
    /**
     * 情绪识别结果描述
     */
    private String eventEmotionStr;
    /**
     * 是否老户
     */
    private int isRepeat;

    public RmiReceptionEvent() {
    }

    public RmiReceptionEvent(int eventId, String name, int type, String typeStr, int detectTargetId,
                             String idNumber, LocalDateTime time, List<RmiReceptionEventImg> images, int conflictMediateCenterId,
                             int eventEmotion, String eventEmotionStr, int isRepeat) {
        this.eventId = eventId;
        this.name = name;
        this.type = type;
        this.typeStr = typeStr;
        this.detectTargetId = detectTargetId;
        this.idNumber = idNumber;
        this.time = time;
        this.images = images;
        this.conflictMediateCenterId = conflictMediateCenterId;
        this.eventEmotion = eventEmotion;
        this.eventEmotionStr = eventEmotionStr;
        this.isRepeat = isRepeat;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTypeStr() {
        return typeStr;
    }

    public void setTypeStr(String typeStr) {
        this.typeStr = typeStr;
    }

    public int getDetectTargetId() {
        return detectTargetId;
    }

    public void setDetectTargetId(int detectTargetId) {
        this.detectTargetId = detectTargetId;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public List<RmiReceptionEventImg> getImages() {
        return images;
    }

    public void setImages(List<RmiReceptionEventImg> images) {
        this.images = images;
    }

    public int getConflictMediateCenterId() {
        return conflictMediateCenterId;
    }

    public void setConflictMediateCenterId(int conflictMediateCenterId) {
        this.conflictMediateCenterId = conflictMediateCenterId;
    }

    public int getEventEmotion() {
        return eventEmotion;
    }

    public void setEventEmotion(int eventEmotion) {
        this.eventEmotion = eventEmotion;
    }

    public String getEventEmotionStr() {
        return eventEmotionStr;
    }

    public void setEventEmotionStr(String eventEmotionStr) {
        this.eventEmotionStr = eventEmotionStr;
    }

    public int getIsRepeat() {
        return isRepeat;
    }

    public void setIsRepeat(int isRepeat) {
        this.isRepeat = isRepeat;
    }
}
