package com.zking.ssm.backstage.service.impl;

import com.zking.ssm.Borrowing.serviec.impl.BaseTestCase;
import com.zking.ssm.backstage.service.IOrganizationServiec;
import com.zking.ssm.base.model.Organization;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author mi
 * @create 2019-05-09 18:03
 */
public class OrganizationSericeImplTest extends BaseTestCase {

    @Autowired
    private IOrganizationServiec organizationServiec;
    private Organization organization;

    @Override
    public void before() {
        super.before();
        organization=new Organization();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        organization.setoOrganization("长江计划");
        organization.setoPassword("123456");
        organization.setoInstitutionalType(2);
        organization.setoAddress("湖南省长沙市");
        organization.setoLinkman("李江涛");
        organization.setoSex("男");
        organization.setoPhone("1232456677");
        organization.setoFixedNumber("676777882");
        organization.setoEmail("129577i8@qq.com");
        organization.setoInvite("liu");
        organizationServiec.insert(organization);
    }

    @Test
    public void selectByPrimaryKey() {
        organization.setoOid(1);
        Organization organization1 = organizationServiec.selectByPrimaryKey(this.organization);
        System.out.println(organization1);
    }

    @Test
    public void updateByPrimaryKey() {
       organization.setoOid(1);
        Organization organization = organizationServiec.selectByPrimaryKey(this.organization);
        System.out.println(organization);
    }

    @Test
    public void list() {
//        pageBean.setPage(1);
//        pageBean.setRows(2);
        List<Organization> list = organizationServiec.listOrganization(organization, pageBean);
        for (Organization org : list) {
            System.out.println(org);

        }
        System.out.println(pageBean.getTotal());
    }
}