package com.zking.ssm.base.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Data
@ToString
public class Discuss implements Serializable{
    private Integer dId;

    private String dPId;

    private Date dTime;

    private String dContent;

    private  User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Discuss(Integer dId, String dPId, Date dTime, String dContent,User user) {
        this.dId = dId;
        this.dPId = dPId;
        this.dTime = dTime;
        this.dContent = dContent;
        this.user=user;
    }

    public Discuss() {
        super();
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdPId() {
        return dPId;
    }

    public void setdPId(String dPId) {
        this.dPId = dPId;
    }

    public Date getdTime() {
        return dTime;
    }

    public void setdTime(Date dTime) {
        this.dTime = dTime;
    }

    public String getdContent() {
        return dContent;
    }

    public void setdContent(String dContent) {
        this.dContent = dContent;
    }
}