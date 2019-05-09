package com.zking.ssm.Login.service.impl;

import com.zking.ssm.Login.service.IRootService;
import com.zking.ssm.Login.shiro.PasswordHelper;
import com.zking.ssm.base.model.Root;
import com.zking.ssm.base.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class RootServiceImplTest extends BaseTestCase{

    @Autowired
    private IRootService rootService;

    private Root root;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        root = new Root();
    }


    @Test
    public void doLogin() throws Exception{
        root.setrName("uuu");
        root.setrPassword("1234");
        String s = rootService.doLogin(root);

        System.out.println(s);
    }




    @Test
    public void updatePassword() throws Exception{
        root.setrId(4);
        root.setrName("uu");
        root.setrPassword("666");
        int i = rootService.updatePassword(root);
        System.out.println(i);
    }

    @Test
    public void doResetPassword() throws Exception{
        root.setrName("admin");
        root.setrPassword("888888");

        int i = rootService.doResetPassword(root);
        System.out.println(i);
    }

    @Test
    public void loadByRName() throws Exception{
        root.setrName("uu");
        Root root = rootService.loadByRName(this.root);
        System.out.println(root);
    }

    @Test
    public void insert() throws Exception{
      root.setrName("uuu");
      root.setrPassword("123");
      root.setrStatus(1);
        String salt = PasswordHelper.createSalt();
      root.setSalt(salt);
      String credentials = PasswordHelper.createCredentials(root.getrPassword(), root.getSalt());
      root.setCredentials(credentials);
      rootService.insert(root);

        System.out.println();

    }


}