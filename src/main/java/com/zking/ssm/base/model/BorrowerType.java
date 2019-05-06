package com.zking.ssm.base.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
@Data
@ToString
public class BorrowerType implements Serializable {
    private Integer bTypeId;

    private String bTypeName;

    public BorrowerType(Integer bTypeId, String bTypeName) {
        this.bTypeId = bTypeId;
        this.bTypeName = bTypeName;
    }

    private List<Borrower> borrowerList;

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