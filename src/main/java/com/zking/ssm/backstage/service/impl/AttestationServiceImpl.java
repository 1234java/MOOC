package com.zking.ssm.backstage.service.impl;

import com.zking.ssm.backstage.service.IAttestationService;
import com.zking.ssm.base.mapper.AttestationMapper;
import com.zking.ssm.base.model.Attestation;
import com.zking.ssm.base.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class AttestationServiceImpl implements IAttestationService {
    @Autowired
    private AttestationMapper mapper;

    @Override
    public int deleteByPrimaryKey(Attestation attestation) {
        return mapper.deleteByPrimaryKey(attestation.getaId());
    }

    @Override
    public int insert(Attestation attestation) {
        return mapper.insert(attestation);
    }

    @Override
    public int insertSelective(Attestation attestation) {

        return mapper.insertSelective(attestation);

    }

    @Override
    public Attestation selectByPrimaryKey(Attestation attestation) {

        return mapper.selectByPrimaryKey(attestation.getaId());
    }

    @Override
    public int updateByPrimaryKeySelective(Attestation attestation) {

        return mapper.updateByPrimaryKeySelective(attestation);
    }

    @Override
    public int updateByPrimaryKey(Attestation attestation) {

        return mapper.updateByPrimaryKey(attestation);
    }

    @Override
    public List<Attestation> list(Attestation attestation, PageBean pageBean) {

        return mapper.list(attestation);
    }

    @Override
    public int updateatt(Attestation attestation){

        return  mapper.updateatt(attestation);
    }
}
