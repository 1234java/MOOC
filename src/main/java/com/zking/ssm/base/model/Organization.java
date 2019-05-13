package com.zking.ssm.base.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;
@Component
@ToString
@Data
public class Organization implements Serializable {
    private List<InstitutionalType> institutionalTypeList;

    public List<InstitutionalType> getInstitutionalTypeList() {
        return institutionalTypeList;
    }

    public void setInstitutionalTypeList(List<InstitutionalType> institutionalTypeList) {
        this.institutionalTypeList = institutionalTypeList;
    }

    private Integer oOid;

    @NotBlank(message = "机构用户名不能为空")
    private String oOrganization;

    @NotBlank(message = "密码不能为空")
    private String oPassword;

    @NotBlank(message = "类别不能为空")
    private Integer oInstitutionalType;
    @NotBlank(message = "地址不能为空")
    private String oAddress;

    @NotBlank(message = "联系人姓名不能为空")
    private String oLinkman;

    @NotBlank(message = "性别不能为空")
    private String oSex;

    @NotBlank(message = "电话不能为空")
    private String oPhone;

    @NotBlank(message = "固定电话不能为空")
    private String oFixedNumber;

    @NotBlank(message = "邮箱不能为空")
    private String oEmail;

    @NotBlank(message = "介绍人不能为空")
    private String oInvite;

    private Integer oStatus;

    private Integer oVip;

    private Double oCapital;

    private Double oCredit;




    public Organization(Integer oOid, String oOrganization, String oPassword, Integer oInstitutionalType, String oAddress, String oLinkman, String oSex, String oPhone, String oFixedNumber, String oEmail, String oInvite, Integer oStatus, Integer oVip, Double oCapital, Double oCredit) {
        this.oOid = oOid;
        this.oOrganization = oOrganization;
        this.oPassword = oPassword;
        this.oInstitutionalType = oInstitutionalType;
        this.oAddress = oAddress;
        this.oLinkman = oLinkman;
        this.oSex = oSex;
        this.oPhone = oPhone;
        this.oFixedNumber = oFixedNumber;
        this.oEmail = oEmail;
        this.oInvite = oInvite;
        this.oStatus = oStatus;
        this.oVip = oVip;
        this.oCapital = oCapital;
        this.oCredit = oCredit;
    }

    public Organization() {
        super();
    }

    public Integer getoOid() {
        return oOid;
    }

    public void setoOid(Integer oOid) {
        this.oOid = oOid;
    }

    public String getoOrganization() {
        return oOrganization;
    }

    public void setoOrganization(String oOrganization) {
        this.oOrganization = oOrganization;
    }

    public String getoPassword() {
        return oPassword;
    }

    public void setoPassword(String oPassword) {
        this.oPassword = oPassword;
    }

    public Integer getoInstitutionalType() {
        return oInstitutionalType;
    }

    public void setoInstitutionalType(Integer oInstitutionalType) {
        this.oInstitutionalType = oInstitutionalType;
    }

    public String getoAddress() {
        return oAddress;
    }

    public void setoAddress(String oAddress) {
        this.oAddress = oAddress;
    }

    public String getoLinkman() {
        return oLinkman;
    }

    public void setoLinkman(String oLinkman) {
        this.oLinkman = oLinkman;
    }

    public String getoSex() {
        return oSex;
    }

    public void setoSex(String oSex) {
        this.oSex = oSex;
    }

    public String getoPhone() {
        return oPhone;
    }

    public void setoPhone(String oPhone) {
        this.oPhone = oPhone;
    }

    public String getoFixedNumber() {
        return oFixedNumber;
    }

    public void setoFixedNumber(String oFixedNumber) {
        this.oFixedNumber = oFixedNumber;
    }

    public String getoEmail() {
        return oEmail;
    }

    public void setoEmail(String oEmail) {
        this.oEmail = oEmail;
    }

    public String getoInvite() {
        return oInvite;
    }

    public void setoInvite(String oInvite) {
        this.oInvite = oInvite;
    }

    public Integer getoStatus() {
        return oStatus;
    }

    public void setoStatus(Integer oStatus) {
        this.oStatus = oStatus;
    }

    public Integer getoVip() {
        return oVip;
    }

    public void setoVip(Integer oVip) {
        this.oVip = oVip;
    }

    public Double getoCapital() {
        return oCapital;
    }

    public void setoCapital(Double oCapital) {
        this.oCapital = oCapital;
    }

    public Double getoCredit() {
        return oCredit;
    }

    public void setoCredit(Double oCredit) {
        this.oCredit = oCredit;
    }
}