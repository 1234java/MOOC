package com.zking.ssm.base.model;

import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Root {

    public static final String DEFAULT_PASSWORD = "888888";

    private Integer rId;

    private String rName;

    private String rPassword;

    private Integer rStatus;

    private String salt;
private  String credentials;

    public Root(Integer rId, String rName, String rPassword, Integer rStatus, String salt,String credentials) {
        this.rId = rId;
        this.rName = rName;
        this.rPassword = rPassword;
        this.rStatus = rStatus;
        this.salt = salt;
        this.credentials=credentials;
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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }
}