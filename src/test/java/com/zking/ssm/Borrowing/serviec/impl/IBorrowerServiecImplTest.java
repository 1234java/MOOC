package com.zking.ssm.Borrowing.serviec.impl;

import com.zking.ssm.Borrowing.serviec.IBorrowerServiec;
import com.zking.ssm.base.model.Borrower;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author mi
 * @create 2019-05-03 20:15
 */
public class IBorrowerServiecImplTest extends BaseTestCase{

    @Autowired
    private IBorrowerServiec borrowerServiec;
    private Borrower borrower;

    @Override
    public void before() {
        super.before();
        borrower=new Borrower();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {

    }

    @Test
    public void selectByPrimaryKey() {
        borrower.setbId(1);
        Borrower b = borrowerServiec.selectByPrimaryKey(borrower.getbId());
        System.out.println(b);
    }

    @Test
    public void updateByPrimaryKey() {
    }
}