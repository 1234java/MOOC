package com.zking.ssm.base.model;

import lombok.ToString;
import org.springframework.stereotype.Component;
import java.io.Serializable;

@Component
@ToString
public class User implements Serializable{
    private String pUserid;

    private String pUsername;

    private String pPassword;

    private String pInvite;

    private Integer pStatus;

    private Integer pVip;

    private Double pCapital;

    private Double pUsable;

    private Double pCredit;



    public User(String pUserid, String pUsername, String pPassword, String pInvite, Integer pStatus, Integer pVip, Double pCapital, Double pUsable, Double pCredit) {
        this.pUserid = pUserid;
        this.pUsername = pUsername;
        this.pPassword = pPassword;
        this.pInvite = pInvite;
        this.pStatus = pStatus;
        this.pVip = pVip;
        this.pCapital = pCapital;
        this.pUsable = pUsable;
        this.pCredit = pCredit;
    }

    public User() {
        super();
    }

    public String getpUserid() {
        return pUserid;
    }

    public void setpUserid(String pUserid) {
        this.pUserid = pUserid;
    }

    public String getpUsername() {
        return pUsername;
    }

    public void setpUsername(String pUsername) {
        this.pUsername = pUsername;
    }

    public String getpPassword() {
        return pPassword;
    }

    public void setpPassword(String pPassword) {
        this.pPassword = pPassword;
    }

    public String getpInvite() {
        return pInvite;
    }

    public void setpInvite(String pInvite) {
        this.pInvite = pInvite;
    }

    public Integer getpStatus() {
        return pStatus;
    }

    public void setpStatus(Integer pStatus) {
        this.pStatus = pStatus;
    }

    public Integer getpVip() {
        return pVip;
    }

    public void setpVip(Integer pVip) {
        this.pVip = pVip;
    }

    public Double getpCapital() {
        return pCapital;
    }

    public void setpCapital(Double pCapital) {
        this.pCapital = pCapital;
    }

    public Double getpUsable() {
        return pUsable;
    }

    public void setpUsable(Double pUsable) {
        this.pUsable = pUsable;
    }

    public Double getpCredit() {
        return pCredit;
    }

    public void setpCredit(Double pCredit) {
        this.pCredit = pCredit;
    }
}