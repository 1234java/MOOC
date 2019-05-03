package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.Attestation;

public interface AttestationMapper {
    int insert(Attestation record);

    int insertSelective(Attestation record);
}