package com.xingzheyi.rpc.service;

import com.xingzheyi.rpc.RpcService;

import java.time.LocalDate;

/**
 * @Date 2021/5/28 14:58
 * @Created by longhu@xingzheyi.com
 * @Project petition-commons
 * @Version 1.0
 */
@RpcService(name = "petition-reception")
public interface ReceptionService {

    /**
     * 将照片转换成24位深度的PNG格式
     *
     * @param imgData 照片原始数据
     * @return 转换后的数据
     */
    byte[] convertImgToPng(byte[] imgData);

    /**
     * 新增智能接待底库信息
     *
     * @param type      1 信访人 2工作人员
     * @param targetId  目标ID
     * @param pngBuffer 图片buffer
     * @param imgType   底库照片类型 1普通底库照片 2身份证照片
     * @return 是否添加成功
     */
    boolean insertReceptionBasement(int type, int targetId, int imgType, byte[] pngBuffer);

    /**
     * 添加来访事件照片到接待底库
     *
     * @param type     1 信访人 2工作人员
     * @param targetId 目标ID
     * @param eventId  来访事件ID
     */
    void addReceptionBasementByEvent(int type, int targetId, int eventId);

    /**
     * 添加身份证照片到接待底库
     *
     * @param type     1 信访人 2工作人员
     * @param targetId 目标ID
     * @param idImgId  身份证照片ID
     */
    void addReceptionBasementByIdImg(int type, int targetId, int idImgId);

    /**
     * 添加照片到接待底库
     *
     * @param type       1 信访人 2工作人员
     * @param targetId   目标ID
     * @param bucketName 桶名称
     * @param objectName 对象名称
     */
    void addReceptionBasementByBucket(String bucketName, String objectName, int imgId, int targetId, int type, int imgType, int storeMode);

    /**
     * 新增智能接待底库信息
     *
     * @param type     1 信访人 2工作人员
     * @param targetId 目标ID
     * @param imgId    图片ID
     */
    void deleteReceptionBasement(int type, int targetId, int imgId);

    /**
     * 接待高清图像事件入库任务
     *
     * @param targetDate 目标日期
     * @param startDate  开始日期
     * @param endDate    结束日期
     */
    void ReceptionHQStore(LocalDate targetDate, LocalDate startDate, LocalDate endDate);
}
