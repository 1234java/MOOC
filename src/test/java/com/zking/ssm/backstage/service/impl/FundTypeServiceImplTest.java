package com.zking.ssm.backstage.service.impl;

import com.zking.ssm.Borrowing.serviec.impl.BaseTestCase;
import com.zking.ssm.backstage.service.IFundTypeService;
import com.zking.ssm.base.model.FundType;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class FundTypeServiceImplTest extends BaseTestCase {

    @Autowired
    private IFundTypeService typeService;
    private FundType fundType;

    @Override
    public void before() {
        super.before();
        fundType=new FundType();

    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        fundType.setfTName("fffff");
        typeService.insert(fundType);
        System.out.println("------");


    }

    @Test
    public void selectByPrimaryKey() {
    }
}