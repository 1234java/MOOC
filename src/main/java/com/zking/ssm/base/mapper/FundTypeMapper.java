package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.FundType;

public interface FundTypeMapper {
    int insert(FundType record);

    int insertSelective(FundType record);
}