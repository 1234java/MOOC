package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.Organization;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganizationMapper {
    //删除
    int deleteByPrimaryKey(Integer oOid);
    //增加
    int insert(Organization record);

    int insertSelective(Organization record);
    //查询单个
    Organization selectByPrimaryKey(Integer oOid);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(Organization record);

    //查询全部
    List<Organization> list(Organization organization);

    //登录
    Organization login(Organization organization);
}