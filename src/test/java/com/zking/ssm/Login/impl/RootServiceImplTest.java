package com.zking.ssm.Login.impl;

import com.zking.ssm.Login.service.IRootService;
import com.zking.ssm.base.model.Root;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RootServiceImplTest extends BaseTestCase {
    @Autowired
    private IRootService rootService;
    private Root root;

    @Override
    public void before() {
        super.before();
        root = new Root();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        root.setrName("add");
        root.setrPassword("123");
        root.setrStatus(0);
        rootService.insert(root);
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
        root.setrId(2);
        root.setrName("ppp");
        root.setrPassword("111");
        root.setrStatus(0);
        rootService.updateByPrimaryKey(root);
    }

    @Test
    public void list() {
        List<Root> rootList = rootService.list(root);
        for (Root r : rootList) {
            System.out.println(r);
        }
    }
}