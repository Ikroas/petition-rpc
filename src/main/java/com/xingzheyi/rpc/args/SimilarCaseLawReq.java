package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * 矛盾诉求查询相关法律和类似案例ES查询分词接口
 * @Date 2021/11/1 18:58
 * @Created by lfd@shichazhe.com
 * @Project petition-commons
 * @Version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SimilarCaseLawReq extends BaseEntity {
    /**
     *  信访内容
     */
    private String content;
    /**
     * 信访主题
     */
    private String subject;
    /**
     * 信访分类
     */
    private String category;
    /**
     * 所属区域
     */
    private String district;

    @JsonProperty("index_name")
    private String indexName;

    public SimilarCaseLawReq(){}

    public SimilarCaseLawReq(String content, String subject, String category, String district, String indexName) {
        this.content = content;
        this.subject = subject;
        this.category = category;
        this.district = district;
        this.indexName = indexName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }
}
