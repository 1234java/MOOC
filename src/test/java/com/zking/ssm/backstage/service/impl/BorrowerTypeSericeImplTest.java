package com.zking.ssm.backstage.service.impl;

import com.zking.ssm.Borrowing.serviec.impl.BaseTestCase;
import com.zking.ssm.backstage.service.IBorrowerTypeService;
import com.zking.ssm.base.model.BorrowerType;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BorrowerTypeSericeImplTest extends BaseTestCase {
    @Autowired
    private IBorrowerTypeService typeSerice;

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

    @Test
    public void list() {
        borrowerType.setbTypeName("d");

        pageBean.setRows(2);
        List<BorrowerType> list = typeSerice.list(borrowerType, pageBean);
        for (BorrowerType type : list) {
            System.out.println(type);
        }


    }
}