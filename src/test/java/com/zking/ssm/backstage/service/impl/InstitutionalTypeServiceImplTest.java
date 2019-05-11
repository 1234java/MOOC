package com.zking.ssm.backstage.service.impl;

import com.zking.ssm.Borrowing.serviec.impl.BaseTestCase;
import com.zking.ssm.backstage.service.InstitutionalTypeService;
import com.zking.ssm.base.model.InstitutionalType;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InstitutionalTypeServiceImplTest extends BaseTestCase {

    @Autowired
    private InstitutionalTypeService typeSerice;
    private InstitutionalType institutionalType;

    @Override
    public void before() {
        super.before();
        institutionalType =new InstitutionalType();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        institutionalType.setiTypename("工艺机构");
        typeSerice.insert(institutionalType);
    }

    @Test
    public void selectByPrimaryKey() {
        institutionalType.setiTypeid(1);
        InstitutionalType ins = typeSerice.selectByPrimaryKey(this.institutionalType);
        System.out.println(ins);
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void listInstitutionalType() {
        List<InstitutionalType> is = typeSerice.listInstitutionalType(institutionalType);
        for (InstitutionalType i : is) {
            System.out.println(i);
        }
    }
}