package com.zking.ssm.backstage.service;

import com.zking.ssm.base.model.InvestmentType;
import org.springframework.stereotype.Repository;

public interface InvestmentTypeSerive {
    int deleteByPrimaryKey(InvestmentType investmentType);

    int insert(InvestmentType investmentType);

    int insertSelective(InvestmentType investmentType);

    InvestmentType selectByPrimaryKey(InvestmentType investmentType);

    int updateByPrimaryKeySelective(InvestmentType investmentType);

    int updateByPrimaryKey(InvestmentType investmentType);
}