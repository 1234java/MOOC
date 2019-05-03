package com.zking.ssm.base.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Data
@ToString
public class BorrowerType {
    private Integer bTypeId;

    private String bTypeName;

    public BorrowerType(Integer bTypeId, String bTypeName) {
        this.bTypeId = bTypeId;
        this.bTypeName = bTypeName;
    }

    public BorrowerType() {
        super();
    }

    public Integer getbTypeId() {
        return bTypeId;
    }

    public void setbTypeId(Integer bTypeId) {
        this.bTypeId = bTypeId;
    }

    public String getbTypeName() {
        return bTypeName;
    }

    public void setbTypeName(String bTypeName) {
        this.bTypeName = bTypeName;
    }
}