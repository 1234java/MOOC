package com.zking.ssm.LonginIndex.service.impl;

import com.zking.ssm.LonginIndex.service.IOrganizationService;
import com.zking.ssm.base.model.Organization;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class OrganizationServiceImplTest extends BaseTestCase {

    @Autowired
    private IOrganizationService organizationService;
    private Organization organization;

    @Override
    public void before() {
        super.before();
       organization=new Organization();
    }

    @Test
    public void add() {
        organization.setoOrganization("华为");
        organization.setoPassword("666");
        organization.setoInstitutionalType(1);
        organization.setoAddress("深圳");
        organization.setoLinkman("任正非");
        organization.setoSex("男");
        organization.setoPhone("11111111111");
        organization.setoFixedNumber("11111111111");
        organization.setoEmail("qq.123456");
        organization.setoInvite("马云");
        organization.setoStatus(0);
        organization.setoVip(0);
        organization.setoCapital(100000.0);
        organization.setoCredit(100.0);
        organizationService.add(organization);
    }

    @Test
    public void list() {
        List<Organization> list=organizationService.list(organization);
        for (Organization o:list) {
            System.out.println(o);
        }
    }
}