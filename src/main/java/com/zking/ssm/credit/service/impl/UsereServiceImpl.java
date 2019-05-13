package com.zking.ssm.credit.service.impl;

import com.zking.ssm.base.mapper.UserMapper;
import com.zking.ssm.base.model.User;
import com.zking.ssm.credit.service.IUeserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UsereServiceImpl implements IUeserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public int deleteByPrimaryKey(String pUserid) {

        return userMapper.deleteByPrimaryKey(pUserid);
    }

    @Override
    public void insert(User record) {
        userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {

        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(String pUserid) {

        return userMapper.selectByPrimaryKey(pUserid);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {

        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updatePstatus(User record) {
        return userMapper.updatePstatus(record);

    }

    @Override
    public List<User> listUser(User user) {

        return userMapper.listUser(user);
    }
}
