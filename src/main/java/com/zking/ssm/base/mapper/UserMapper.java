package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer pUserid);

    //增加
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer pUserid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //查询
    List<User> list(User user);
}