package com.zking.ssm.hipoteca.service.impl;

import com.zking.ssm.Borrowing.serviec.impl.BaseTestCase;
import com.zking.ssm.base.model.Borrower;
import com.zking.ssm.base.model.BorrowerType;
import com.zking.ssm.base.utils.PageBean;
import com.zking.ssm.hipoteca.service.BorrowerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author mi
 * @create 2019-05-03 20:15
 */

public class IBorrowerServiceImplTest extends BaseTestCase {

    @Autowired
    private BorrowerService borrowerService;

    private Borrower borrower;

    @Override
    public void before() {
        super.before();
        borrower = new Borrower();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
         borrower.setbName("米老板");
         borrower.setbUsername("米老头");
         borrowerService.insert(borrower);
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimary() {
        PageBean pageBean = new PageBean();
//        pageBean.setRows(1);
//        pageBean.setPage(3);
        List<Borrower> listb = borrowerService.listb(pageBean);
        for (Borrower b : listb) {
            System.out.println(b);
            System.out.println(b.getBorrowerTyper().getbTypeName());

        }


    }

    @Test
    public void selectByPrimaryInt() {
        List<Integer> list = borrowerService.selectByPrimaryInt();
        for (Integer l : list) {
            System.out.println(l);
        }
    }

    @Test
    public void selectByPrimaryKey () {
            borrower.setbId(69);
        Borrower b = borrowerService.selectByPrimaryKey(borrower);
        System.out.println(b);
    }


    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}
