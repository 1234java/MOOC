package com.zking.ssm.backstage.service.impl;

import com.zking.ssm.Borrowing.serviec.impl.BaseTestCase;
import com.zking.ssm.backstage.service.IAttestationService;
import com.zking.ssm.base.model.Attestation;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class AttestationServiceImplTest extends BaseTestCase {

    @Autowired
    private IAttestationService service;

    private Attestation attestation;

    @Override
    public void before() {
        super.before();
        attestation =new Attestation();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void selectByPrimaryKey() {
        attestation.setaId(1);
        Attestation attestation = service.selectByPrimaryKey(this.attestation);
        System.out.println(attestation);

    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void list() {
        List<Attestation> list = service.list(attestation, pageBean);
        for (Attestation attestation1 : list) {
            System.out.println(attestation1);
        }

    }
}