package com.ruoyi.flowable.domain.dto;

import com.ruoyi.common.core.domain.entity.SysRole;
import com.ruoyi.common.core.domain.entity.SysUser;

import java.io.Serializable;
import java.util.List;

/**
 * 动态人员、组
 * @author Tony
 * @date 2021/4/17 22:59
 */
public class FlowNextDto implements Serializable {

    /**
     * 审批人类型
     */
    private String type;

    /**
     * 是否需要动态指定任务审批人
     */
    private String dataType;

    /**
     * 流程变量
     */
    private String vars;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;       
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getVars() {
        return vars;
    }

    public void setVars(String vars) {
        this.vars = vars;
    }
}
