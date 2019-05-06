package com.zking.ssm.base.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Data
@ToString
public class LogonLog implements Serializable{
    private Integer lId;

    private String lPOId;

    private Date lDate;

    public LogonLog(Integer lId, String lPOId, Date lDate) {
        this.lId = lId;
        this.lPOId = lPOId;
        this.lDate = lDate;
    }

    public LogonLog() {
        super();
    }

    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
    }

    public String getlPOId() {
        return lPOId;
    }

    public void setlPOId(String lPOId) {
        this.lPOId = lPOId;
    }

    public Date getlDate() {
        return lDate;
    }

    public void setlDate(Date lDate) {
        this.lDate = lDate;
    }
}