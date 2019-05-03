package com.zking.ssm.base.model;

public class FundType {
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