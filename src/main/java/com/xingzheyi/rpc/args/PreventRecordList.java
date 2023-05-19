package com.xingzheyi.rpc.args;

import java.io.Serializable;
import java.util.List;

/**
 * @Date 2021/6/23 14:20
 * @Created by longhu@xingzheyi.com
 * @Project petition-commons
 * @Version 1.0
 */
public class PreventRecordList implements Serializable {
    /**
     * 录像文件列表目录
     */
    private List<PreventRecordDir> dirs;

    public List<PreventRecordDir> getDirs() {
        return dirs;
    }

    public void setDirs(List<PreventRecordDir> dirs) {
        this.dirs = dirs;
    }
}

