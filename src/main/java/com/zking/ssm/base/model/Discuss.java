package com.zking.ssm.base.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Data
@ToString
public class Discuss {
    private Integer dId;

    private String dPId;

    private Date dTime;

    private String dContent;

    public Discuss(Integer dId, String dPId, Date dTime, String dContent) {
        this.dId = dId;
        this.dPId = dPId;
        this.dTime = dTime;
        this.dContent = dContent;
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