package com.ruoyi.flowable.domain.dto;

import java.io.Serializable;

/**
 * @author Tony
 * @date 2021/3/28 15:50
 */
public class FlowCommentDto implements Serializable {

    /**
     * 意见类别 0 正常意见  1 退回意见 2 驳回意见
     */
    private String type;

    /**
     * 意见内容
     */
    private String comment;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public FlowCommentDto() {
    }

    public FlowCommentDto(String type, String comment) {
        this.type = type;
        this.comment = comment;
    }
}
