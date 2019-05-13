package com.zking.ssm.base.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.List;

@Component
@Data
@ToString
public class Attestation  implements Serializable {
    private Integer aId;

    private String pId;

    private String aName;

    private String aSfz;

    private String aReverse;

    private String aFront;

    private String aMessage;

    private String aState;
    private   User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
   private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Attestation(Integer aId, String pId, String aName, String aSfz, String aReverse, String aFront, String aMessage, String aState, User user) {
        this.aId = aId;
        this.pId = pId;
        this.aName = aName;
        this.aSfz = aSfz;
        this.aReverse = aReverse;
        this.aFront = aFront;
        this.aMessage = aMessage;
        this.aState = aState;
        this.user=user;
    }

    public Attestation() {
        super();
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaSfz() {
        return aSfz;
    }

    public void setaSfz(String aSfz) {
        this.aSfz = aSfz;
    }

    public String getaReverse() {
        return aReverse;
    }

    public void setaReverse(String aReverse) {
        this.aReverse = aReverse;
    }

    public String getaFront() {
        return aFront;
    }

    public void setaFront(String aFront) {
        this.aFront = aFront;
    }

    public String getaMessage() {
        return aMessage;
    }

    public void setaMessage(String aMessage) {
        this.aMessage = aMessage;
    }

    public String getaState() {
        return aState;
    }

    public void setaState(String aState) {
        this.aState = aState;
    }
}