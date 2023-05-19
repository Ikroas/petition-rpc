package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * AI内容分配请求实体
 *
 * @Date 2021/7/29 14:26
 * @Created by doujinpeng
 * @Project petition-web
 * @Version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Category extends BaseEntity {
    /**
     * 内容分类
     */
    private String category;

    public Category() {
    }

    public Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
