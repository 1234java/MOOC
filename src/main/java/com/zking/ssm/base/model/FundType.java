package com.zking.ssm.base.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Data
@ToString
public class FundType implements Serializable{
    private Integer fTId;

    private String fTName;

    public FundType(Integer fTId, String fTName) {
        this.fTId = fTId;
        this.fTName = fTName;
    }

    public FundType() {
        super();
    }

    public Integer getfTId() {
        return fTId;
    }

    public void setfTId(Integer fTId) {
        this.fTId = fTId;
    }

    public String getfTName() {
        return fTName;
    }

    public void setfTName(String fTName) {
        this.fTName = fTName;
    }
}