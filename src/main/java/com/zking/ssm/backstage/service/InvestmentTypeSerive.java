package com.zking.ssm.backstage.service;

import com.zking.ssm.base.model.InvestmentType;
import com.zking.ssm.base.utils.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface InvestmentTypeSerive {
    int deleteByPrimaryKey(InvestmentType investmentType);

    int insert(InvestmentType investmentType);

    int insertSelective(InvestmentType investmentType);

    InvestmentType selectByPrimaryKey(InvestmentType investmentType);

    int updateByPrimaryKeySelective(InvestmentType investmentType);

    int updateByPrimaryKey(InvestmentType investmentType);
    List<InvestmentType> list(InvestmentType institutionalType, PageBean pageBean);
}