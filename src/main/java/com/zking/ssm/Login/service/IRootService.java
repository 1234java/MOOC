package com.zking.ssm.Login.service;

import com.zking.ssm.base.model.Root;

import java.util.List;

public interface IRootService {
    int deleteByPrimaryKey(Integer rId);

    int insert(Root record);

    int insertSelective(Root record);

    Root selectByPrimaryKey(Integer rId);

    int updateByPrimaryKeySelective(Root record);

    int updateByPrimaryKey(Root record);

    List<Root> list(Root root);
}