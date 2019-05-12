package com.zking.ssm.LonginIndex.service.impl;

import com.zking.ssm.LonginIndex.service.IUserService;
import com.zking.ssm.base.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

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
        user.setpUserid(UUID.randomUUID().toString().replaceAll("-",""));
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
        user.setpUsername("a");
        List<User> list=userService.list(user);
        for (User u:list) {
            System.out.println(u);
        }
    }

    @Test
    public void updateByPrimaryKey() {
        user.setpUserid("2");
        user.setpInvite("iii");
        userService.updateByPrimaryKey(user);

    }





    @Test
    public void deleteByPrimaryKey() {
        user.setpUserid("2");
        userService.deleteByPrimaryKey(user.getpUserid());
    }


    @Test
    public void selectByPrimaryKey() {
        user.setpUserid("1");
        User user = userService.selectByPrimaryKey(this.user.getpUserid());
        System.out.println(user);
    }



}