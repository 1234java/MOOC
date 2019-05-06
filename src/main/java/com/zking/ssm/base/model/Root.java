package com.zking.ssm.base.model;

public class Root {
    private Integer rId;

    private String rName;

    private String rPassword;

    private Integer rStatus;

    private String salt;

    public Root(Integer rId, String rName, String rPassword, Integer rStatus, String salt) {
        this.rId = rId;
        this.rName = rName;
        this.rPassword = rPassword;
        this.rStatus = rStatus;
        this.salt = salt;
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
}