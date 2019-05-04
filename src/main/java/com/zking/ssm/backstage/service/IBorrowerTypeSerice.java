package com.zking.ssm.backstage.service;

import com.zking.ssm.base.model.BorrowerType;

public interface IBorrowerTypeSerice {
    int deleteByPrimaryKey(Integer bTypeId);

    int insert(BorrowerType record);

    int insertSelective(BorrowerType record);

    BorrowerType selectByPrimaryKey(Integer bTypeId);

    int updateByPrimaryKeySelective(BorrowerType record);

    int updateByPrimaryKey(BorrowerType record);
}