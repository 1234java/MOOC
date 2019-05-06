package com.zking.ssm.LonginIndex.service.impl;

import com.zking.ssm.LonginIndex.service.IOrganizationService;
import com.zking.ssm.base.mapper.OrganizationMapper;
import com.zking.ssm.base.model.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrganizationServiceImpl implements IOrganizationService {

    @Autowired
    private OrganizationMapper organizationMapper;

    @Override
    public void add(Organization organization) {
        organizationMapper.insert(organization);
    }

    @Override
    public List<Organization> list(Organization organization) {
        return organizationMapper.list(organization);
    }
}
