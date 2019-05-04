package com.zking.ssm.backstage.service.impl;

import com.zking.ssm.Borrowing.serviec.impl.BaseTestCase;
import com.zking.ssm.backstage.service.InstitutionalTypeSerice;
import com.zking.ssm.base.model.InstitutionalType;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class InstitutionalTypeServiceImplTest extends BaseTestCase {

    @Autowired
    private InstitutionalTypeSerice typeSerice;
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
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }
}