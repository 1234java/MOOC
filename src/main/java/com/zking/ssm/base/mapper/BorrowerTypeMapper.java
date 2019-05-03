package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.BorrowerType;

public interface BorrowerTypeMapper {
    int insert(BorrowerType record);

    int insertSelective(BorrowerType record);
}