package com.xingzheyi.rpc.service;

import com.xingzheyi.rpc.RpcService;

import java.util.List;

/**
 * @Date 2021/12/14 14:47
 * @Created by lfd@shichazhe.com
 * @Project petition-commons
 * @Version 1.0
 */
@RpcService(name = "petition-mini-program")
public interface MiniProgramService {
    /**
     * 信任RMI，调用微信小程序服务解密密文
     * @param encryptContent
     * @return decryptContent
     */
    String decryptByMiniProgram(String encryptContent);
    /**
     *  给网格员下发任务，微信服务通知
     * @param sysUserIdList
     * @param userAssignmentId 网格员任务id
     */
    void sendCreateAssignmentMsg(List<Integer> sysUserIdList, Integer userAssignmentId);

    /**
     *  给网格员下发任务逾期提醒，微信服务通知
     * @param sysUserIdList
     * @param userAssignmentId 网格员任务id
     */
    void sendAssignmentExpireMsg(List<Integer> sysUserIdList, Integer userAssignmentId);

    /**
     *  给网格员下发多人视频，微信服务通知
     * @param sysUserIdList
     * @param creatorName
     * @param multiVideoRecordId
     */
    void sendCreateMultiVideoMsg(List<Integer> sysUserIdList, String creatorName, Integer multiVideoRecordId);

    /**
     *  给网格员下发信息，微信服务通知
     * @param sysUserIdList
     */
    void sendCommonMsg(List<Integer> sysUserIdList, String creatorName, String content, Integer sysNotifyId);

    /**
     *  给群众下发诉求办理完成，微信服务通知
     * @param receptionRecordId
     */
    void sendAppealCompleteMsg(Integer receptionRecordId, String code, String status, String orgName, String time, List<Integer> petitionVisitorIds);


    /**
     * 向小程序推有新消息提醒
     * @param sysUserId
     * @param petitionVisitorId
     */
    void sendNewMsgNotify(Integer sysUserId, Integer petitionVisitorId);
}
