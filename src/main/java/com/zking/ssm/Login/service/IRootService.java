package com.zking.ssm.Login.service;

import com.zking.ssm.base.model.Root;

import java.util.List;

public interface IRootService {
    String doLogin(Root root);//用户登录

    int updatePassword(Root root);//所有人都可以修改自己的密码

    int doResetPassword(Root root);//管理员可以重置所有人的密码，密码默认值为888888

    Root loadByRName(Root root);//根据用户名查询用户

    int insert(Root record);





}