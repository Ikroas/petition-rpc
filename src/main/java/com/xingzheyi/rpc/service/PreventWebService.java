package com.xingzheyi.rpc.service;

import com.xingzheyi.petition.commons.base.PageUrlParams;
import com.xingzheyi.petition.commons.base.WxPageUrlParams;
import com.xingzheyi.rpc.RpcService;
import com.xingzheyi.rpc.args.MessagePush;
import com.xingzheyi.rpc.args.RMIPreventEvent;
import com.xingzheyi.rpc.args.UpsideRiskWarningPush;

import java.util.List;

/**
 * @Date 2021/5/24 10:44
 * @Created by longhu@xingzheyi.com
 * @Project petition-commons
 * @Version 1.0
 */
@RpcService(name = "prevent-web")
public interface PreventWebService {

    /**
     * 推送防控事件
     *
     * @param req 请求报文
     */
    void pushEvent(RMIPreventEvent req);

    /**
     * 发送消息通知给用户(小程序和web端都通知)
     *
     * @param key             消息通知模板Key
     * @param notifyParams    消息通知模板参数
     * @param userId          通知用户ID
     * @param optFlag         消息通知操作类型
     * @param pageUrlParams   web端消息详情跳转url参数
     * @param wxPageUrlParams 小程序端消息详情跳转url参数
     */
    void dispatchNotify(String key, Object[] notifyParams, int userId, int optFlag, PageUrlParams pageUrlParams, WxPageUrlParams wxPageUrlParams);

    /**
     * 发送消息通知给用户(只通知web端)
     *
     * @param key           消息通知模板Key
     * @param notifyParams  消息通知模板参数
     * @param userId        通知用户ID
     * @param optFlag       消息通知操作类型
     * @param pageUrlParams web端消息详情跳转url参数
     */
    void dispatchNotify(String key, Object[] notifyParams, int userId, int optFlag, PageUrlParams pageUrlParams);

    /**
     * 发送消息通知给用户(只通知小程序端)
     *
     * @param key             消息通知模板Key
     * @param notifyParams    消息通知模板参数
     * @param userId          通知用户ID
     * @param optFlag         消息通知操作类型
     * @param wxPageUrlParams 小程序端消息详情跳转url参数
     */
    void dispatchNotify(String key, Object[] notifyParams, int userId, int optFlag, WxPageUrlParams wxPageUrlParams);

    /**
     * 推送系统消息通知给web端
     *
     * @param targetUserId 推送用户ID
     */
    void sendUnreadMessageNotify(int targetUserId);

    /**
     * 推送消息通知给web端指定用户
     *
     * @param message      消息
     * @param targetUserId 推送用户ID
     */
    void sendWebSocketMessageTarget(Object message, int targetUserId);

    /**
     * 推送上行风险预警
     *
     * @param list 上行风险数据
     */
    void pushUpsideRiskWarning(List<UpsideRiskWarningPush> list);

    /**
     * 消息推送及保存
     *
     * @param message 消息
     */
    void pushAndStoreMessage(MessagePush message);
}
