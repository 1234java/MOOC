package com.zking.ssm.backstage.service.impl;

import com.zking.ssm.Borrowing.serviec.impl.BaseTestCase;
import com.zking.ssm.backstage.service.IBorrowerTypeSerice;
import com.zking.ssm.base.model.BorrowerType;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class BorrowerTypeSericeImplTest extends BaseTestCase {
    @Autowired
    private IBorrowerTypeSerice typeSerice;
    private BorrowerType borrowerType;

    @Override
    public void before() {
        super.before();
        borrowerType =new BorrowerType();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        borrowerType.setbTypeName("sdds");
        typeSerice.insert(borrowerType);

    }

    @Test
    public void selectByPrimaryKey() {
        borrowerType.setbTypeId(1);
        BorrowerType borrowerType = typeSerice.selectByPrimaryKey(this.borrowerType);
        System.out.println(borrowerType);
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}