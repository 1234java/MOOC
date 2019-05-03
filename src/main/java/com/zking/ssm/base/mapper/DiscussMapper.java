package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.Discuss;

public interface DiscussMapper {
    int insert(Discuss record);

    int insertSelective(Discuss record);
}