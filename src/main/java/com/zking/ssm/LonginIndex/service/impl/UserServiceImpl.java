package com.zking.ssm.LonginIndex.service.impl;

import com.zking.ssm.base.mapper.UserMapper;
import com.zking.ssm.base.model.User;
import com.zking.ssm.credit.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;



    @Override
    public int deleteByPrimaryKey(String pUserid) {
        return 0;
    }

    @Override
    public void insert(User record) {
        userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(String pUserid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }

    @Override
    public int updatePstatus(User record) {
        return 0;
    }

    @Override
    public List<User> listUser(User user) {
        return userMapper.listUser(user);
    }
}
