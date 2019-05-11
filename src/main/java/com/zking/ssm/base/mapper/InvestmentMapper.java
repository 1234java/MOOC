package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.InstitutionalType;
import com.zking.ssm.base.model.Investment;

import java.util.List;

public interface InvestmentMapper {
    int deleteByPrimaryKey(Integer iId);

    int insert(Investment record);

    int insertSelective(Investment record);

    Investment selectByPrimaryKey(Integer iId);

    int updateByPrimaryKeySelective(Investment record);

    int updateByPrimaryKey(Investment record);

}