package com.zking.ssm.backstage.service.impl;

import com.zking.ssm.Borrowing.serviec.impl.BaseTestCase;
import com.zking.ssm.backstage.service.InvestmentTypeSerive;
import com.zking.ssm.base.model.InvestmentType;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class NvestmentTypeSeriveImplTest extends BaseTestCase {

    @Autowired
    private InvestmentTypeSerive investmentTypeSerive;
    private InvestmentType investmentType;

    @Override
    public void before() {
        super.before();
        investmentType =new InvestmentType();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        investmentType.setiTypename("中");
        int insert = investmentTypeSerive.insert(investmentType);
        System.out.println(insert);
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
        public void updateByPrimaryKeySelective() {
    }
}