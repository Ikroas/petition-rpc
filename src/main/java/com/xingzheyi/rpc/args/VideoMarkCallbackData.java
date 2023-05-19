package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingzheyi.petition.commons.base.BaseEntity;

import java.time.LocalDate;

/**
 * @Date 2020/11/4 10:15
 * @Created by longhu@xingzheyi.com
 * @Project petition-analysis
 * @Version 1.0
 */
public class VideoMarkCallbackData extends BaseEntity {
    /**
     * 防控事件ID
     */
    @JsonProperty("event_id")
    private int eventId;
    /**
     * 事件日期
     */
    @JsonProperty("event_date")
    private LocalDate eventDate;
    /**
     * 返回轨迹方向，0靠近（默认值），1远离
     */
    @JsonProperty("direction")
    private int direction;
    /**
     * 处理后的视频存储路径
     */
    @JsonProperty("trajectory_video")
    private MinioObject trajectoryVideo;

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public MinioObject getTrajectoryVideo() {
        return trajectoryVideo;
    }

    public void setTrajectoryVideo(MinioObject trajectoryVideo) {
        this.trajectoryVideo = trajectoryVideo;
    }
}
