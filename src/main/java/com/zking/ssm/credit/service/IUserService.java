package com.zking.ssm.credit.service;

import com.zking.ssm.base.model.User;

import java.util.List;

public interface IUserService {
    int deleteByPrimaryKey(String pUserid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String pUserid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> listUser(User user);
}
