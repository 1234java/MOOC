package com.zking.ssm.backstage.service;

import com.zking.ssm.base.model.BorrowerType;

public interface IBorrowerTypeSerice {
    int deleteByPrimaryKey(BorrowerType borrowerType);

    int insert(BorrowerType borrowerType);

    int insertSelective(BorrowerType borrowerType);

    BorrowerType selectByPrimaryKey(BorrowerType borrowerType);

    int updateByPrimaryKeySelective(BorrowerType borrowerType);

    int updateByPrimaryKey(BorrowerType borrowerType);
}