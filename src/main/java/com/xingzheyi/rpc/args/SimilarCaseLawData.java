package com.xingzheyi.rpc.args;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.xingzheyi.petition.commons.base.BaseEntity;

/**
 * 矛盾诉求查询相关法律和类似案例ES查询接口
 * @Date 2021/11/1 18:58
 * @Created by lfd@shichazhe.com
 * @Project petition-commons
 * @Version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SimilarCaseLawData extends BaseEntity {
    @JsonAlias("doc_id")
    private String documentId;
    private String title;

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
            this.title = title;
        }
}
