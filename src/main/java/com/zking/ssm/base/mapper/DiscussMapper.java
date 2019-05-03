package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.Discuss;

public interface DiscussMapper {
    int deleteByPrimaryKey(Integer dId);

    int insert(Discuss record);

    int insertSelective(Discuss record);

    Discuss selectByPrimaryKey(Integer dId);

    int updateByPrimaryKeySelective(Discuss record);

    int updateByPrimaryKey(Discuss record);
}