package com.zking.ssm.backstage.service.impl;

import com.zking.ssm.backstage.service.IOrganizationServiec;
import com.zking.ssm.base.mapper.OrganizationMapper;
import com.zking.ssm.base.model.Organization;
import com.zking.ssm.base.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author mi
 * @create 2019-05-09 17:14
 */
@Service
@Transactional
public class OrganizationServiecImpl implements IOrganizationServiec {

    @Autowired
    private OrganizationMapper organizationMapper;

    @Override
    public int deleteByPrimaryKey(Integer oOid) {
        return organizationMapper.deleteByPrimaryKey(oOid);
    }

    @Override
    public int insert(Organization record) {
        return organizationMapper.insert(record);
    }

    @Override
    public int insertSelective(Organization record) {
        return 0;
    }

    @Override
    public Organization selectByPrimaryKey(Organization organization) {
        return organizationMapper.selectByPrimaryKey(organization);
    }

    @Override
    public int updateByPrimaryKeySelective(Organization record) {
        return organizationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Organization record) {
        return organizationMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Organization> listOrganization(Organization organization, PageBean pageBean) {
        return organizationMapper.listOrganization(organization);
    }

    public  Organization load(Organization organization){
        return  organizationMapper.load(organization.getoOid());

    }

}
