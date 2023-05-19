package com.xingzheyi.rpc.service;

import com.xingzheyi.petition.commons.base.R;
import com.xingzheyi.petition.commons.proto.AbstractCommandMessage;
import com.xingzheyi.rpc.RpcService;

/**
 * @Date 2021/5/26 16:40
 * @Created by longhu@xingzheyi.com
 * @Project petition-commons
 * @Version 1.0
 */
@RpcService(name = "petition-ctrl")
public interface CtrlService {

    /**
     * 同步发送平台指令
     *
     * @param cmd 指令内容
     * @return 发送结果
     */
    R sendCmdSync(AbstractCommandMessage cmd);

    /**
     * 异步发送平台指令
     *
     * @param cmd 指令内容
     */
    void sendCmdAsync(AbstractCommandMessage cmd);
}
