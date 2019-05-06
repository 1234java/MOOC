package com.zking.ssm.LonginIndex.service.impl;

import com.zking.ssm.LonginIndex.service.IUserService;
import com.zking.ssm.base.mapper.UserMapper;
import com.zking.ssm.base.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    @Override
    public List<User> list(User user) {

        return userMapper.list(user);
    }
}
