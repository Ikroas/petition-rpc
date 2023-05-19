package com.xingzheyi.rpc.args;

import java.io.Serializable;
import java.util.List;

/**
 * @Date 2021/6/23 14:23
 * @Created by longhu@xingzheyi.com
 * @Project petition-commons
 * @Version 1.0
 */
public class PreventRecordDir implements Serializable {
    /**
     * 日期 2021_6_8
     */
    private String date;
    /**
     * 通道ID
     */
    private int ch;
    /**
     * 文件列表
     */
    private List<PreventRecordFile> files;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public List<PreventRecordFile> getFiles() {
        return files;
    }

    public void setFiles(List<PreventRecordFile> files) {
        this.files = files;
    }
}
