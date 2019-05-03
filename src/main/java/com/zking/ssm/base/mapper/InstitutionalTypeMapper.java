package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.InstitutionalType;

public interface InstitutionalTypeMapper {
    int insert(InstitutionalType record);

    int insertSelective(InstitutionalType record);
}