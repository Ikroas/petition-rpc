package com.xingzheyi.rpc.service;

import com.xingzheyi.petition.commons.base.R;
import com.xingzheyi.petition.commons.proto.CommandRecord;
import com.xingzheyi.rpc.RpcService;
import com.xingzheyi.rpc.args.PhotoRecognizeResp;
import com.xingzheyi.rpc.args.PreventRecordList;
import com.xingzheyi.rpc.args.VideoMarkCallback;

import java.io.IOException;

/**
 * @Date 2021/5/28 14:59
 * @Created by chl@xingzheyi.com
 * @Project petition-commons
 * @Version 1.0
 */
@RpcService(name = "petition-monitor")
public interface MonitorService {

    /**
     * 将照片转换成24位深度的PNG格式
     *
     * @param imgData 照片原始数据
     * @return 转换后的数据
     */
    byte[] convertImgToPng(byte[] imgData);

    /**
     * 将PNG图片中人脸进行对齐
     *
     * @param pngBuffer png图片原始buffer
     * @return 对齐后的buffer
     */
    byte[] alignPngFace(byte[] pngBuffer);

    /**
     * 提取防控人脸底库特征
     *
     * @param pngBytes 底库PNG照片数据
     * @return 特征值
     */
    byte[] extractPreventFaceFeature(byte[] pngBytes);

    /**
     * 提取防控行人底库特征
     *
     * @param pngBytes 底库PNG照片数据
     * @return 特征值
     */
    byte[] extractPreventPedestrianFeature(byte[] pngBytes);

    /**
     * 重新加载防控底库
     */
    void reloadPreventBasement();

    /**
     * 获取录像回传视频列表
     *
     * @param commandRecord 录像视频列表指令
     */
    PreventRecordList getPreventRecordList(CommandRecord commandRecord);

    /**
     * 发送录像上传指令
     *
     * @param commandRecord 录像上传指令
     */
    void uploadPreventRecord(CommandRecord commandRecord);

    /**
     * 获取录像ts文件流
     *
     * @param path 文件路径
     * @return InputStream
     */
    byte[] getRecordTsInputStream(String path) throws IOException;

    /**
     * 视频标注回调接口
     *
     * @param callback 请求报文
     * @return 操作结果
     */
    R videoTrajectoryMarkCallback(VideoMarkCallback callback);

    /**
     * 拍照识别接口
     *
     * @param userId 用户ID
     * @param imgId  拍照的照片ID
     */
    PhotoRecognizeResp photoRecognize(int userId, int imgId);
}
