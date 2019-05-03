package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.Root;

public interface RootMapper {
    int deleteByPrimaryKey(Integer rId);

    int insert(Root record);

    int insertSelective(Root record);

    Root selectByPrimaryKey(Integer rId);

    int updateByPrimaryKeySelective(Root record);

    int updateByPrimaryKey(Root record);
}