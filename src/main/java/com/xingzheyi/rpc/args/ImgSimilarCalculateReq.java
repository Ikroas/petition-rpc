package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * @Date 2020/11/4 14:37
 * @Created by longhu@xingzheyi.com
 * @Project petition-analysis
 * @Version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImgSimilarCalculateReq extends BaseEntity {
    @JsonProperty("basement")
    private PersonBasement basement;
    @JsonProperty("event_img")
    private ImgData eventImg;

    public ImgSimilarCalculateReq(){

    }

    public ImgSimilarCalculateReq(PersonBasement basement, ImgData eventImg) {
        this.basement = basement;
        this.eventImg = eventImg;
    }

    public PersonBasement getBasement() {
        return basement;
    }

    public void setBasement(PersonBasement basement) {
        this.basement = basement;
    }

    public ImgData getEventImg() {
        return eventImg;
    }

    public void setEventImg(ImgData eventImg) {
        this.eventImg = eventImg;
    }
}
