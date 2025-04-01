package com.ruoyi.flowable.domain.dto;

import java.io.Serializable;

/**
 * @author Tony
 * @date 2021/4/21 20:55
 */
public class FlowViewerDto implements Serializable {

    /**
     * 流程key
     */
    private String key;

    /**
     * 是否完成(已经审批)
     */
    private boolean completed;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }       

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}