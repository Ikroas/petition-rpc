package com.xingzheyi.rpc.service;

import com.xingzheyi.rpc.RpcService;

/**
 * @Date 2021/5/25 11:08
 * @Created by longhu@xingzheyi.com
 * @Project petition-commons
 * @Version 1.0
 */
@RpcService(name = "petition-sync")
public interface SyncService {

    /**
     * 实时区域人数接口
     *
     * @param devMac  终端mac地址
     * @param channel 通道
     * @param time    时间
     * @param inside  人数
     */
    void receiveAreaFlow(String devMac, int channel, long time, int inside);
}
