package com.zking.ssm.Borrowing.serviec.impl;

import com.zking.ssm.Borrowing.serviec.IBorrowerTypeServiec;
import com.zking.ssm.base.model.BorrowerType;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author mi
 * @create 2019-05-03 20:25
 */
public class IBorrowerTypeServiecImplTest extends BaseTestCase {

    @Autowired
    private IBorrowerTypeServiec borrowerTypeServiec;

    private BorrowerType borrowerType;

    @Override
    public void before() {
        super.before();
        borrowerType=new BorrowerType();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        borrowerType.setbTypeName("科学");
        borrowerTypeServiec.insert(borrowerType);

    }

    @Test
    public void selectByPrimaryKey() {
        borrowerType.setbTypeId(1);
        BorrowerType b = borrowerTypeServiec.selectByPrimaryKey(this.borrowerType.getbTypeId());
        System.out.println(b);
    }

    @Test
    public void updateByPrimaryKey() {
    }
}