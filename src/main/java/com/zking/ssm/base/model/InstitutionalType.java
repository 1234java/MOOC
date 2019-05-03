package com.zking.ssm.base.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Data
@ToString
public class InstitutionalType {
    private Integer iTypeid;

    private String iTypename;

    public InstitutionalType(Integer iTypeid, String iTypename) {
        this.iTypeid = iTypeid;
        this.iTypename = iTypename;
    }

    public InstitutionalType() {
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