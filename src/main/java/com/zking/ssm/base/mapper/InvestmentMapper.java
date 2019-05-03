package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.Investment;

public interface InvestmentMapper {
    int insert(Investment record);

    int insertSelective(Investment record);
}