package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.Vip;

public interface VipMapper {
    int deleteByPrimaryKey(Integer vId);

    int insert(Vip record);

    int insertSelective(Vip record);

    Vip selectByPrimaryKey(Integer vId);

    int updateByPrimaryKeySelective(Vip record);

    int updateByPrimaryKey(Vip record);
}