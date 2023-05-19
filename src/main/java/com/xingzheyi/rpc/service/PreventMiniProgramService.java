package com.xingzheyi.rpc.service;

import com.xingzheyi.petition.commons.base.PageUrlParams;
import com.xingzheyi.petition.commons.base.WxPageUrlParams;
import com.xingzheyi.rpc.RpcService;

import java.time.LocalDate;

/**
 * @Date 2021/12/14 14:47
 * @Created by lfd@shichazhe.com
 * @Project petition-commons
 * @Version 1.0
 */
@RpcService(name = "prevent-mini-program")
public interface PreventMiniProgramService {

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
     * 发送微信服务通知给小程序
     *
     * @param templateKey   服务通知内容模板key
     * @param contentParam  服务通知内容模板参数
     * @param userId        用户ID
     * @param pageUrlParams 页面跳转参数
     */
    void sendWxFormatMessage(String templateKey, Object[] contentParam, int userId, WxPageUrlParams pageUrlParams);

    /**
     * 推送系统消息通知给小程序端
     *
     * @param targetUserId 推送用户ID
     */
    void sendUnreadMessageNotify(int targetUserId);

    /**
     * 推送消息通知给小程序端指定用户
     *
     * @param message      消息
     * @param targetUserId 推送用户ID
     */
    void sendWebSocketMessageTarget(Object message, int targetUserId);

    /**
     * 推送最新的防控事件信息
     *
     * @param visitorId
     * @param date
     * @param eventId
     */
    void sendNewPreventEvent(int visitorId, LocalDate date, int eventId);

    /**
     * 推送防控预测等级调整
     * @param visitorId 重点人员id
     * @param visitorName 重点人员姓名
     * @param aiAdjustLabel 调整标签 0 不变 1 升 2降
     * @param predictRiskLevel 预测调整等级 1 A类 2 B类 3 C类
     */
    void sendLevelPredict(int visitorId,String visitorName,int aiAdjustLabel,String predictRiskLevel);
}
