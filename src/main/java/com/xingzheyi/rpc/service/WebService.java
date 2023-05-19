package com.xingzheyi.rpc.service;


import com.xingzheyi.rpc.RpcService;
import com.xingzheyi.rpc.args.LiuYanDataInfo;
import com.xingzheyi.rpc.args.MessagePush;
import com.xingzheyi.rpc.args.RMIPreventEvent;
import com.xingzheyi.rpc.args.RmiReceptionEvent;

import java.util.List;

/**
 * @Date 2021/5/24 10:44
 * @Created by longhu@xingzheyi.com
 * @Project petition-commons
 * @Version 1.0
 */
@RpcService(name = "petition-web")
public interface WebService {

    /**
     * 推送防控事件
     *
     * @param req 请求报文
     */
    void pushEvent(RMIPreventEvent req);

    /**
     * 消息推送及保存
     *
     * @param message
     */
    void pushAndStoreMessage(MessagePush message);


    void pushLiuYanDataMessage(List<LiuYanDataInfo> list);

    /**
     * 推送来访事件
     *
     * @param event 请求报文
     */
    void pushReceptionEvent(RmiReceptionEvent event);

}
