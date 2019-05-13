package com.zking.ssm.backstage.service;

import com.zking.ssm.base.model.BorrowerType;
import com.zking.ssm.base.utils.PageBean;

import java.util.List;

public interface IBorrowerTypeService {
    int deleteByPrimaryKey(BorrowerType borrowerType);

    int insert(BorrowerType borrowerType);

    int insertSelective(BorrowerType borrowerType);

    BorrowerType selectByPrimaryKey(BorrowerType borrowerType);

    int updateByPrimaryKeySelective(BorrowerType borrowerType);

    int updateByPrimaryKey(BorrowerType borrowerType);


    List<BorrowerType> list(BorrowerType borrowerType,PageBean pageBean);
}