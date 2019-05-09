package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.Attestation;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AttestationMapper {
    int deleteByPrimaryKey(Integer aId);

    int insert(Attestation record);

    int insertSelective(Attestation record);

    Attestation selectByPrimaryKey(Integer aId);

    int updateByPrimaryKeySelective(Attestation record);

    int updateByPrimaryKey(Attestation record);

    List<Attestation> list(Attestation attestation);

    int updateatt(Attestation attestation);

}