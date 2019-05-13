package com.zking.ssm.credit.service.impl;

import com.zking.ssm.Borrowing.serviec.impl.BaseTestCase;
import com.zking.ssm.base.model.Borrower;
import com.zking.ssm.credit.service.IBorrowerService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class BorrowerServiceImplTest extends BaseTestCase {

    @Autowired
    private IBorrowerService borrowerService;
    private Borrower borrower;

    @Override
    public void before() {
        super.before();
        borrower =new Borrower();
    }

    @Test
    public void deleteByPrimaryKey() {
        borrower.setbId(1);
        borrowerService.deleteByPrimaryKey(borrower.getbId());
    }

    @Test
    public void insert() {
        borrower.setbName("社会");
        borrower.setbUsername("老米头");
        borrower.setbRate(14);
        borrower.setbMoney(9888.0);
        borrower.setbPhone("13333333333");
        borrower.setbHouse(3);
        borrower.setbTotalValue(98888833.0);
        borrower.setbUse("jajshnj");
        borrower.setbDescribe("1wwqasa");
        borrower.setbCondition(2);
        borrower.setbBorrowerType(2);
        borrower.setbBidcount(14);
        borrower.setbStatus(0);
        borrowerService.insert(borrower);
    }

    @Test
    public void selectByPrimaryKey() {
        borrower.setbId(1);
        Borrower b = borrowerService.selectByPrimaryKey(borrower);
        System.out.println(b);
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void listBorrower() {
        List<Borrower> borrowers = borrowerService.listBorrower(borrower);
        for (Borrower b : borrowers) {
            System.out.println(b);
        }
    }
}