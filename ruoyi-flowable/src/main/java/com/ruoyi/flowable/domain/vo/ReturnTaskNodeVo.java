package com.ruoyi.flowable.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Map;

/**
 * <p>可退回节点<p>
 *
 * @author tony
 * @date 2022-04-23 11:01:52
 */
@ApiModel("可退回节点")
public class ReturnTaskNodeVo {

    @ApiModelProperty("任务Id")
    private String id;

    @ApiModelProperty("用户Id")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
