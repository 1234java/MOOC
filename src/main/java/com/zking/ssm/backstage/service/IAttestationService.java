package com.zking.ssm.backstage.service;

import com.zking.ssm.base.model.Attestation;
import com.zking.ssm.base.utils.PageBean;

import java.util.List;

public interface IAttestationService {
    int deleteByPrimaryKey(Attestation attestation);

    int insert(Attestation attestation);

    int insertSelective(Attestation attestation);

    Attestation selectByPrimaryKey(Attestation attestation);

    int updateByPrimaryKeySelective(Attestation attestation);

    int updateByPrimaryKey(Attestation attestation);

    List<Attestation> list(Attestation attestation, PageBean pageBean);

    int updateatt(Attestation attestation);

}