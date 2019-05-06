package com.zking.ssm.credit.service.impl;

import com.zking.ssm.base.mapper.UserMapper;
import com.zking.ssm.base.model.User;
import com.zking.ssm.credit.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UseServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(String pUserid) {
        return userMapper.deleteByPrimaryKey(pUserid);
    }

    @Override
    public int insert(User record) {

        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {

        return 0;
    }

    @Override
    public User selectByPrimaryKey(String pUserid) {

        return userMapper.selectByPrimaryKey(pUserid);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {

        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<User> listUser(User user) {

        return userMapper.listUser(user);
    }
}
