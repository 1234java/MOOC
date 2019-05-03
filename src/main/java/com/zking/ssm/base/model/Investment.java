package com.zking.ssm.base.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Data
@ToString
public class Investment {
    private Integer iId;

    private String iOPUserid;

    private Integer bId;

    private Integer bTypeId;

    private Date iDate;

    private Double iMoney;

    private Integer iStatus;

    public Investment(Integer iId, String iOPUserid, Integer bId, Integer bTypeId, Date iDate, Double iMoney, Integer iStatus) {
        this.iId = iId;
        this.iOPUserid = iOPUserid;
        this.bId = bId;
        this.bTypeId = bTypeId;
        this.iDate = iDate;
        this.iMoney = iMoney;
        this.iStatus = iStatus;
    }

    public Investment() {
        super();
    }

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public String getiOPUserid() {
        return iOPUserid;
    }

    public void setiOPUserid(String iOPUserid) {
        this.iOPUserid = iOPUserid;
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public Integer getbTypeId() {
        return bTypeId;
    }

    public void setbTypeId(Integer bTypeId) {
        this.bTypeId = bTypeId;
    }

    public Date getiDate() {
        return iDate;
    }

    public void setiDate(Date iDate) {
        this.iDate = iDate;
    }

    public Double getiMoney() {
        return iMoney;
    }

    public void setiMoney(Double iMoney) {
        this.iMoney = iMoney;
    }

    public Integer getiStatus() {
        return iStatus;
    }

    public void setiStatus(Integer iStatus) {
        this.iStatus = iStatus;
    }
}