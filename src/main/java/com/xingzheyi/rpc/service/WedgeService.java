package com.xingzheyi.rpc.service;


import com.xingzheyi.rpc.RpcService;
import com.xingzheyi.rpc.args.*;

import java.util.List;

/**
 * @Date 2021/5/27 19:09
 * @Created by longhu@xingzheyi.com
 * @Project petition-commons
 * @Version 1.0
 */
@RpcService(name = "petition-wedge")
public interface WedgeService {
    /**
     * 防控事件图片匹配度计算
     */
    ImgSimilarCalculateResp similarCalculate(ImgSimilarCalculateReq req);

    /**
     * 防控事件视频轨迹标注接口
     */
    VideoMarkResp trajectoryMark(VideoMarkReq req);

    /**
     * 防控事件视频轨迹标注接口
     */
    VideoMarkResp preventVideoMerge(VideoMergeReq req);

    /**
     * 校验文件是否为红头文件
     */
    RedHeaderFileResp redHeaderFileExamine(RedHeaderFileReq req);

    /**
     * AI自动分配窗口
     */
    DispatchWindowResp autoDispatchWindow(InterviewInfo req);

    /**
     * AI调处
     */
    RecommendResp mediateRecommend(InterviewInfo req);

    /**
     * AI内容分类
     */
    Category categoryRecommend(Content req);

    /**
     * AI判重
     */
    List<SimilarRecord> repeatJudge(RepeatJudgeReq req);

    /**
     * AI智能受理
     */
    AutoAcceptType acceptTypeRecommend(AcceptInfo req);

    /**
     * AI处理策略
     */
    HandleStrategy handleStrategyRecommend(HandleCaseInfo req);

    /**
     * ES检索分词
     */
    SearchResp searchLAC(SearchReq req);

    /**
     * 矛盾诉求查询相关法律和类似案例接口
     */
    SimilarCaseLawResp similarCaseLawLAC(SimilarCaseLawReq req);
}
