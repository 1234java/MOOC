package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.Fund;

public interface FundMapper {
    int insert(Fund record);

    int insertSelective(Fund record);
}