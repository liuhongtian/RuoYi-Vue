package com.ruoyi.flowable.domain.dto;

import java.io.Serializable;

/**
 * @author Tony
 * @date 2021/3/31 23:20
 */
public class FlowFromFieldDTO implements Serializable {

    private Object fields;

    public Object getFields() {
        return fields;
    }

    public void setFields(Object fields) {
        this.fields = fields;
    }
}
