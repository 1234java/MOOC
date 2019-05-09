package com.zking.ssm.backstage.service.impl;

import com.zking.ssm.Borrowing.serviec.impl.BaseTestCase;
import com.zking.ssm.backstage.service.IDiscussService;
import com.zking.ssm.base.model.Discuss;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class DiscussServiceImplTest extends BaseTestCase {

    @Autowired
    private IDiscussService iDiscussService;
     private Discuss discuss;

    @Override
    public void before() {
        super.before();
        discuss =new Discuss();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void list() {
        List<Discuss> list = iDiscussService.list(null, pageBean);
        for (Discuss discuss1 : list) {
            System.out.println(discuss1);
        }
    }
}