package com.zking.ssm.base.model;

import java.util.Date;

public class Borrower {
    private Integer bId;

    private String bName;

    private String bUsername;

    private Double bMoney;

    private Integer bRate;

    private Date bMoneyDeadline;

    private String bPhone;

    private Integer bHouse;

    private Double bTotalValue;

    private String bUse;

    private String bDescribe;

    private Integer bCondition;

    private Integer bBorrowerType;

    private Integer bBidcount;

    private Integer bStatus;

    public Borrower(Integer bId, String bName, String bUsername, Double bMoney, Integer bRate, Date bMoneyDeadline, String bPhone, Integer bHouse, Double bTotalValue, String bUse, String bDescribe, Integer bCondition, Integer bBorrowerType, Integer bBidcount, Integer bStatus) {
        this.bId = bId;
        this.bName = bName;
        this.bUsername = bUsername;
        this.bMoney = bMoney;
        this.bRate = bRate;
        this.bMoneyDeadline = bMoneyDeadline;
        this.bPhone = bPhone;
        this.bHouse = bHouse;
        this.bTotalValue = bTotalValue;
        this.bUse = bUse;
        this.bDescribe = bDescribe;
        this.bCondition = bCondition;
        this.bBorrowerType = bBorrowerType;
        this.bBidcount = bBidcount;
        this.bStatus = bStatus;
    }

    public Borrower() {
        super();
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbUsername() {
        return bUsername;
    }

    public void setbUsername(String bUsername) {
        this.bUsername = bUsername;
    }

    public Double getbMoney() {
        return bMoney;
    }

    public void setbMoney(Double bMoney) {
        this.bMoney = bMoney;
    }

    public Integer getbRate() {
        return bRate;
    }

    public void setbRate(Integer bRate) {
        this.bRate = bRate;
    }

    public Date getbMoneyDeadline() {
        return bMoneyDeadline;
    }

    public void setbMoneyDeadline(Date bMoneyDeadline) {
        this.bMoneyDeadline = bMoneyDeadline;
    }

    public String getbPhone() {
        return bPhone;
    }

    public void setbPhone(String bPhone) {
        this.bPhone = bPhone;
    }

    public Integer getbHouse() {
        return bHouse;
    }

    public void setbHouse(Integer bHouse) {
        this.bHouse = bHouse;
    }

    public Double getbTotalValue() {
        return bTotalValue;
    }

    public void setbTotalValue(Double bTotalValue) {
        this.bTotalValue = bTotalValue;
    }

    public String getbUse() {
        return bUse;
    }

    public void setbUse(String bUse) {
        this.bUse = bUse;
    }

    public String getbDescribe() {
        return bDescribe;
    }

    public void setbDescribe(String bDescribe) {
        this.bDescribe = bDescribe;
    }

    public Integer getbCondition() {
        return bCondition;
    }

    public void setbCondition(Integer bCondition) {
        this.bCondition = bCondition;
    }

    public Integer getbBorrowerType() {
        return bBorrowerType;
    }

    public void setbBorrowerType(Integer bBorrowerType) {
        this.bBorrowerType = bBorrowerType;
    }

    public Integer getbBidcount() {
        return bBidcount;
    }

    public void setbBidcount(Integer bBidcount) {
        this.bBidcount = bBidcount;
    }

    public Integer getbStatus() {
        return bStatus;
    }

    public void setbStatus(Integer bStatus) {
        this.bStatus = bStatus;
    }
}