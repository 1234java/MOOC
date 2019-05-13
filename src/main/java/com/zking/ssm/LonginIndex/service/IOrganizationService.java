package com.zking.ssm.LonginIndex.service;

import com.zking.ssm.base.model.Organization;

import java.util.List;


public interface IOrganizationService {

    //增加
    void add(Organization organization);

    //查询
    List<Organization> list(Organization organization);

    //登录
    Organization login (Organization organization);
}
