package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}