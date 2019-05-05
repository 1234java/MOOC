package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.BorrowerType;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BorrowerTypeMapper {
    int deleteByPrimaryKey(Integer bTypeId);

    int insert(BorrowerType record);

    int insertSelective(BorrowerType record);

    BorrowerType selectByPrimaryKey(Integer bTypeId);

    int updateByPrimaryKeySelective(BorrowerType record);

    int updateByPrimaryKey(BorrowerType record);

    List<BorrowerType> list(BorrowerType borrowerType);
}