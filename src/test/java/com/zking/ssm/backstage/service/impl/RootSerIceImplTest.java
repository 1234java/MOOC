package com.zking.ssm.backstage.service.impl;

import com.zking.ssm.Borrowing.serviec.impl.BaseTestCase;
import com.zking.ssm.backstage.service.IRoottService;
import com.zking.ssm.base.model.Root;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RootSerIceImplTest extends BaseTestCase {
    @Autowired
    private IRoottService iRoottService;

    private Root root;
    @Override
    public void before() {
        super.before();
        root =new Root();
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
        pageBean.setRows(1);
        List<Root> list = iRoottService.list(root, pageBean);
        for (Root root1 : list) {
            System.out.println(root1);

        }
    }
}