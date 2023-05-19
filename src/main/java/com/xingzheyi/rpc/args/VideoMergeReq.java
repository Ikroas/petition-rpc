package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingzheyi.petition.commons.base.BaseEntity;

import java.time.LocalDate;

/**
 * @Date 2021/6/29 11:19
 * @Created by longhu@xingzheyi.com
 * @Project petition-commons
 * @Version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VideoMergeReq extends BaseEntity {
    @JsonProperty("event_id")
    private int eventId;
    @JsonProperty("event_date")
    private LocalDate eventDate;
    @JsonProperty("params")
    private VideoParams params;
    @JsonProperty("event_video")
    private VideoData eventVideo;

    public VideoMergeReq(int eventId, LocalDate eventDate, VideoParams params, VideoData eventVideo) {
        this.eventId = eventId;
        this.eventDate = eventDate;
        this.params = params;
        this.eventVideo = eventVideo;
    }

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

    public VideoParams getParams() {
        return params;
    }

    public void setParams(VideoParams params) {
        this.params = params;
    }

    public VideoData getEventVideo() {
        return eventVideo;
    }

    public void setEventVideo(VideoData eventVideo) {
        this.eventVideo = eventVideo;
    }
}
