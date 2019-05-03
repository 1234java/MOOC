package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.Vip;

public interface VipMapper {
    int insert(Vip record);

    int insertSelective(Vip record);
}