package com.zking.ssm.credit.service.impl;

import com.zking.ssm.Borrowing.serviec.impl.BaseTestCase;
import com.zking.ssm.base.model.Vip;
import com.zking.ssm.credit.service.IVipService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class VipServiceImplTest extends BaseTestCase {

    @Autowired
    private IVipService vipService;
    private Vip vip;

    @Override
    public void before() {
        super.before();
        vip = new Vip();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        vip.setvVip(1);
        vip.setvMoney(100000d);
        vip.setvRelease(50000d);
        vip.setvEnterpriseMoney(500000d);
        vip.setvEnterpriseRelease(250000d);
        vipService.insert(vip);
    }

    @Test
    public void selectByPrimaryKey() {
        vip.setvId(1);
        Vip v = vipService.selectByPrimaryKey(this.vip.getvId());
        System.out.println(v);

    }

    @Test
    public void updateByPrimaryKey() {
        vip.setvId(1);
        vip.setvVip(2);
        vip.setvMoney(200000d);
        vip.setvRelease(100000d);
        vip.setvEnterpriseMoney(1000000d);
        vip.setvEnterpriseRelease(500000d);
        vipService.updateByPrimaryKey(vip);
    }

    @Test
    public void listVip() {
        List<Vip> v = vipService.listVip(vip);
        for (Vip v1 : v) {
            System.out.println(v1);
        }
    }
}