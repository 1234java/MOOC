package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.Fund;

public interface FundMapper {
    int deleteByPrimaryKey(Integer fId);

    int insert(Fund record);

    int insertSelective(Fund record);

    Fund selectByPrimaryKey(Integer fId);

    int updateByPrimaryKeySelective(Fund record);

    int updateByPrimaryKey(Fund record);
}