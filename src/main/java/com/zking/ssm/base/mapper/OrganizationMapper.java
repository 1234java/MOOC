package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.Organization;

public interface OrganizationMapper {
    int insert(Organization record);

    int insertSelective(Organization record);
}