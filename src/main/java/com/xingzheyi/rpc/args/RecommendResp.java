package com.xingzheyi.rpc.args;

import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * AI调处结果实体
 *
 * @Date 2021/7/29 14:19
 * @Created by doujinpeng
 * @Project petition-web
 * @Version 1.0
 */
public class RecommendResp extends BaseEntity {
    /**
     * 事项类别
     */
    private String category;
    /**
     * 事项清单
     */
    private String matter;
    /**
     * 调处思路
     */
    private String smartRecommend;

    public RecommendResp() {
    }

    public RecommendResp(String category, String matter, String smartRecommend) {
        this.category = category;
        this.matter = matter;
        this.smartRecommend = smartRecommend;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    public String getSmartRecommend() {
        return smartRecommend;
    }

    public void setSmartRecommend(String smartRecommend) {
        this.smartRecommend = smartRecommend;
    }
}
