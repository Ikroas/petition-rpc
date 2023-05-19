package com.xingzheyi.rpc.args;

import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * @Date 2021/8/25 17:39
 * @Created by longhu@xingzheyi.com
 * @Project petition-commons
 * @Version 1.0
 */
public class RmiReceptionEventImg extends BaseEntity {
    /**
     * 照片ID
     */
    private int imgId;

    public RmiReceptionEventImg() {
    }

    public RmiReceptionEventImg(int imgId) {
        this.imgId = imgId;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
