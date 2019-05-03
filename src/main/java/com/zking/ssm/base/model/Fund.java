package com.zking.ssm.base.model;

public class Fund {
    private Integer fId;

    private String fPOId;

    private Integer fType;

    private Integer fStatus;

    private Double fMoney;

    public Fund(Integer fId, String fPOId, Integer fType, Integer fStatus, Double fMoney) {
        this.fId = fId;
        this.fPOId = fPOId;
        this.fType = fType;
        this.fStatus = fStatus;
        this.fMoney = fMoney;
    }

    public Fund() {
        super();
    }

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public String getfPOId() {
        return fPOId;
    }

    public void setfPOId(String fPOId) {
        this.fPOId = fPOId;
    }

    public Integer getfType() {
        return fType;
    }

    public void setfType(Integer fType) {
        this.fType = fType;
    }

    public Integer getfStatus() {
        return fStatus;
    }

    public void setfStatus(Integer fStatus) {
        this.fStatus = fStatus;
    }

    public Double getfMoney() {
        return fMoney;
    }

    public void setfMoney(Double fMoney) {
        this.fMoney = fMoney;
    }
}