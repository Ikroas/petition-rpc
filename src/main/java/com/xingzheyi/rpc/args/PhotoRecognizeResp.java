package com.xingzheyi.rpc.args;

import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * @Date 2022/1/14 14:24
 * @Created by longhu@xingzheyi.com
 * @Project petition-rpc
 * @Version 1.0
 */
public class PhotoRecognizeResp extends BaseEntity {
    /**
     * 是否识别成功
     */
    private boolean match;
    /**
     * 防控底库ID
     */
    private int preventBasementId;
    /**
     * 画框后的照片ID
     */
    private int recognizedImgId;

    public PhotoRecognizeResp() {
    }

    public PhotoRecognizeResp(boolean match) {
        this.match = match;
    }

    public PhotoRecognizeResp(boolean match, int preventBasementId, int recognizedImgId) {
        this.match = match;
        this.preventBasementId = preventBasementId;
        this.recognizedImgId = recognizedImgId;
    }

    public boolean isMatch() {
        return match;
    }

    public void setMatch(boolean match) {
        this.match = match;
    }

    public int getPreventBasementId() {
        return preventBasementId;
    }

    public void setPreventBasementId(int preventBasementId) {
        this.preventBasementId = preventBasementId;
    }

    public int getRecognizedImgId() {
        return recognizedImgId;
    }

    public void setRecognizedImgId(int recognizedImgId) {
        this.recognizedImgId = recognizedImgId;
    }
}
