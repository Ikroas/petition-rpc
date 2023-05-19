package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingzheyi.petition.commons.base.BaseEntity;

import java.time.LocalDate;

/**
 * 视频标注请求实体
 *
 * @Date 2020/9/8 19:21
 * @Created by chl@xingzheyi.com
 * @Project petition-analysis
 * @Version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VideoMarkReq extends BaseEntity {
    /**
     * 人脸匹配标识1，行人匹配标识2
     */
    @JsonProperty("flag")
    private Integer flag;
    @JsonProperty("event_id")
    private int eventId;
    @JsonProperty("event_date")
    private LocalDate eventDate;
    @JsonProperty("person_name")
    private String personName;
    @JsonProperty("params")
    private VideoParams params;
    @JsonProperty("basement")
    private PersonBasement basement;
    @JsonProperty("event_video")
    private VideoData eventVideo;
    @JsonProperty("event_img")
    private ImgData eventImg;

    public VideoMarkReq(){

    }

    public VideoMarkReq(Integer flag, int eventId, LocalDate eventDate, String personName, VideoParams params,
                        PersonBasement basement, VideoData eventVideo, ImgData eventImg) {
        this.flag = flag;
        this.eventId = eventId;
        this.eventDate = eventDate;
        this.personName = personName;
        this.params = params;
        this.basement = basement;
        this.eventVideo = eventVideo;
        this.eventImg = eventImg;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
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

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public VideoParams getParams() {
        return params;
    }

    public void setParams(VideoParams params) {
        this.params = params;
    }

    public PersonBasement getBasement() {
        return basement;
    }

    public void setBasement(PersonBasement basement) {
        this.basement = basement;
    }

    public VideoData getEventVideo() {
        return eventVideo;
    }

    public void setEventVideo(VideoData eventVideo) {
        this.eventVideo = eventVideo;
    }

    public ImgData getEventImg() {
        return eventImg;
    }

    public void setEventImg(ImgData eventImg) {
        this.eventImg = eventImg;
    }
}
