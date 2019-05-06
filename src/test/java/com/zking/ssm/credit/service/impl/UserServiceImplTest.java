package com.zking.ssm.credit.service.impl;

import com.zking.ssm.Borrowing.serviec.impl.BaseTestCase;
import com.zking.ssm.base.model.User;
import com.zking.ssm.credit.service.IUserService;
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
        user = new User();
    }

    @Test
    public void deleteByPrimaryKey() {
        user.setpUserid("2");
        userService.deleteByPrimaryKey(user.getpUserid());
    }

    @Test
    public void insert() {
        user.setpUserid("2");
        user.setpUsername("刘海吊");
        user.setpPassword("666666");
        user.setpInvite("老米头");
        user.setpStatus(1);
        user.setpVip(6);
        user.setpCapital(10000d);
        user.setpUsable(5000d);
        user.setpCredit(100d);
        userService.insert(user);
    }

    @Test
    public void selectByPrimaryKey() {
        user.setpUserid("1");
        User user = userService.selectByPrimaryKey(this.user.getpUserid());
        System.out.println(user);
    }

    @Test
    public void updateByPrimaryKey() {
        user.setpUserid("1");
        user.setpCredit(90d);
        userService.updateByPrimaryKey(user);
    }

    @Test
    public void updatePstatus() {
        user.setpUserid("1");
        user.setpStatus(0);
        userService.updatePstatus(user);
    }

    @Test
    public void listUser() {
        user.setpUsername("刘");
        List<User> u = userService.listUser(user);
        for (User user1 : u) {
            System.out.println(user1);
        }

    }
}