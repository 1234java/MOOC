package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.Root;

public interface RootMapper {
    int insert(Root record);

    int insertSelective(Root record);
}