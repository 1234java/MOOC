package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.Organization;

public interface OrganizationMapper {
    int deleteByPrimaryKey(Integer oOid);

    int insert(Organization record);

    int insertSelective(Organization record);

    Organization selectByPrimaryKey(Integer oOid);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(Organization record);
}