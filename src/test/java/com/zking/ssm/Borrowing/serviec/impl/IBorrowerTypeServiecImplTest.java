package com.zking.ssm.Borrowing.serviec.impl;

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
    private IBorrowerTypeServiecImpl borrowerTypeServiec;

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
        borrowerType.setbTypeName("生活");
        borrowerTypeServiec.insert(borrowerType);

    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}