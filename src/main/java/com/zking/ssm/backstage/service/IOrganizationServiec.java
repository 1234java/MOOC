package com.zking.ssm.backstage.service;

import com.zking.ssm.base.model.Organization;
import com.zking.ssm.base.utils.PageBean;

import java.util.List;

/**
 * @author mi
 * @create 2019-05-09 17:13
 */
public interface IOrganizationServiec {

    //删除
    int deleteByPrimaryKey(Integer oOid);
    //增加
    int insert(Organization record);

    int insertSelective(Organization record);
    //查询单个
    Organization selectByPrimaryKey(Organization organization);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(Organization record);

    Organization load(Organization organization);

    //查询全部
    List<Organization> listOrganization(Organization organization,PageBean pageBean);
}
