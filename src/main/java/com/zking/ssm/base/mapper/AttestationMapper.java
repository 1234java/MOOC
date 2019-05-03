package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.Attestation;

public interface AttestationMapper {
    int deleteByPrimaryKey(Integer aId);

    int insert(Attestation record);

    int insertSelective(Attestation record);

    Attestation selectByPrimaryKey(Integer aId);

    int updateByPrimaryKeySelective(Attestation record);

    int updateByPrimaryKey(Attestation record);
}