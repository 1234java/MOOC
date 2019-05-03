package com.zking.ssm.base.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Data
@ToString
public class InvestmentType {
    private Integer iTypeid;

    private String iTypename;

    public InvestmentType(Integer iTypeid, String iTypename) {
        this.iTypeid = iTypeid;
        this.iTypename = iTypename;
    }

    public InvestmentType() {
        super();
    }

    public Integer getiTypeid() {
        return iTypeid;
    }

    public void setiTypeid(Integer iTypeid) {
        this.iTypeid = iTypeid;
    }

    public String getiTypename() {
        return iTypename;
    }

    public void setiTypename(String iTypename) {
        this.iTypename = iTypename;
    }
}