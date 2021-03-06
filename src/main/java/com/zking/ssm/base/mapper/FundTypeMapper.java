package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.FundType;
import org.springframework.stereotype.Repository;

@Repository
public interface FundTypeMapper {
    int deleteByPrimaryKey(Integer fTId);

    int insert(FundType record);

    int insertSelective(FundType record);

    FundType selectByPrimaryKey(Integer fTId);

    int updateByPrimaryKeySelective(FundType record);

    int updateByPrimaryKey(FundType record);
}