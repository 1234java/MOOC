package com.zking.ssm.base.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Data
@ToString
public class Vip implements Serializable{
    private Integer vId;

    private Integer vVip;

    private Double vMoney;

    private Double vRelease;

    private Double vEnterpriseMoney;

    private Double vEnterpriseRelease;

    public Vip(Integer vId, Integer vVip, Double vMoney, Double vRelease, Double vEnterpriseMoney, Double vEnterpriseRelease) {
        this.vId = vId;
        this.vVip = vVip;
        this.vMoney = vMoney;
        this.vRelease = vRelease;
        this.vEnterpriseMoney = vEnterpriseMoney;
        this.vEnterpriseRelease = vEnterpriseRelease;
    }

    public Vip() {
        super();
    }

    public Integer getvId() {
        return vId;
    }

    public void setvId(Integer vId) {
        this.vId = vId;
    }

    public Integer getvVip() {
        return vVip;
    }

    public void setvVip(Integer vVip) {
        this.vVip = vVip;
    }

    public Double getvMoney() {
        return vMoney;
    }

    public void setvMoney(Double vMoney) {
        this.vMoney = vMoney;
    }

    public Double getvRelease() {
        return vRelease;
    }

    public void setvRelease(Double vRelease) {
        this.vRelease = vRelease;
    }

    public Double getvEnterpriseMoney() {
        return vEnterpriseMoney;
    }

    public void setvEnterpriseMoney(Double vEnterpriseMoney) {
        this.vEnterpriseMoney = vEnterpriseMoney;
    }

    public Double getvEnterpriseRelease() {
        return vEnterpriseRelease;
    }

    public void setvEnterpriseRelease(Double vEnterpriseRelease) {
        this.vEnterpriseRelease = vEnterpriseRelease;
    }
}