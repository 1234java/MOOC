package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(String pUserid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String pUserid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}