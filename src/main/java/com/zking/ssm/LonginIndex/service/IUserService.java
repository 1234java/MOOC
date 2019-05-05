package com.zking.ssm.LonginIndex.service;

import com.zking.ssm.base.model.User;

import java.util.List;

public interface IUserService {

    //增加
    void add(User user);

    //查询
    List<User> list(User user);

}
