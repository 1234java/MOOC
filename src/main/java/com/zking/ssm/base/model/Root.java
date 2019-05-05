package com.zking.ssm.base.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Controller;

@Data
@ToString
@Controller
public class Root {
    private Integer rId;

    private String rName;

    private String rPassword;

    private Integer rStatus;

    public Root(Integer rId, String rName, String rPassword, Integer rStatus) {
        this.rId = rId;
        this.rName = rName;
        this.rPassword = rPassword;
        this.rStatus = rStatus;
    }

    public Root() {
        super();
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getrPassword() {
        return rPassword;
    }

    public void setrPassword(String rPassword) {
        this.rPassword = rPassword;
    }

    public Integer getrStatus() {
        return rStatus;
    }

    public void setrStatus(Integer rStatus) {
        this.rStatus = rStatus;
    }
}