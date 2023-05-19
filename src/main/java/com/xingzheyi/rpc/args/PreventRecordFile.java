package com.xingzheyi.rpc.args;

import java.io.Serializable;

/**
 * @Date 2021/6/23 14:24
 * @Created by longhu@xingzheyi.com
 * @Project petition-commons
 * @Version 1.0
 */
public class PreventRecordFile implements Serializable {
    /**
     * 文件名 2021_6_8-11_10_33-0.mp4
     */
    private String name;
    /**
     * 文件大小
     */
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
