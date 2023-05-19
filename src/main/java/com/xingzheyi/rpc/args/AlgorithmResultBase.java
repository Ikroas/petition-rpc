package com.xingzheyi.rpc.args;

import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * 算法服务响应基类
 *
 * @Date 2020/9/9 19:16
 * @Created by chl@xingzheyi.com
 * @Project petition-analysis
 * @Version 1.0
 */
public class AlgorithmResultBase extends BaseEntity {
    /**
     * 返回错误码  0成功 其他失败
     */
    private int status;
    /**
     * 返回结果备注
     */
    private String msg;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
