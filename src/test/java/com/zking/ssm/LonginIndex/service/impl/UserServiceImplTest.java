package com.zking.ssm.LonginIndex.service.impl;

import com.zking.ssm.LonginIndex.service.IUserService;
import com.zking.ssm.base.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class UserServiceImplTest extends BaseTestCase {

    @Autowired
    private IUserService userService;
    private User user;

    @Override
    public void before() {
        super.before();
      user=new User();
    }

    @Test
    public void add() {
        user.setpUsername("华为");
        user.setpPassword("123");
        user.setpInvite("马云");
        user.setpStatus(0);
        user.setpVip(0);
        user.setpCapital(100000.0);
        user.setpUsable(100000.0);
        user.setpCredit(100.0);
        userService.add(user);
    }

    @Test
    public void list() {
        List<User> list=userService.list(user);
        for (User u:list) {
            System.out.println(u);
        }
    }
}