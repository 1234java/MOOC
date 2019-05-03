package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.InvestmentType;

public interface InvestmentTypeMapper {
    int insert(InvestmentType record);

    int insertSelective(InvestmentType record);
}