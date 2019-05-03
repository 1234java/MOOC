package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.Investment;

public interface InvestmentMapper {
    int deleteByPrimaryKey(Integer iId);

    int insert(Investment record);

    int insertSelective(Investment record);

    Investment selectByPrimaryKey(Integer iId);

    int updateByPrimaryKeySelective(Investment record);

    int updateByPrimaryKey(Investment record);
}