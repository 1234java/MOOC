package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.Organization;

import java.util.List;

public interface OrganizationMapper {
    int deleteByPrimaryKey(Integer oOid);

    int insert(Organization record);

    int insertSelective(Organization record);

    Organization selectByPrimaryKey(Organization organization);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(Organization record);

    List<Organization> listOrganization(Organization organization);

    Organization load(int organization);
}