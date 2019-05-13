package com.zking.ssm.Login.service.impl;

import com.zking.ssm.base.utils.PageBean;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
@Rollback(value = false)//true回滚事务，false提交事务
@Transactional(transactionManager = "transactionManager")
public class BaseTestCase {


    protected PageBean pageBean;

    public BaseTestCase() {
    }

    @Before
    public void before() throws Exception {
        pageBean = new PageBean();
    }

    @After
    public void tearDown() throws Exception {
    }
}