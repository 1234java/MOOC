package com.zking.ssm.backstage.service;

import com.zking.ssm.base.model.FundType;
import org.springframework.stereotype.Repository;

public interface IFundTypeService {
    int deleteByPrimaryKey(FundType fundType);

    int insert(FundType fundType);

    int insertSelective(FundType fundType);

    FundType selectByPrimaryKey(FundType fundType);

    int updateByPrimaryKeySelective(FundType fundType);

    int updateByPrimaryKey(FundType fundType);
}