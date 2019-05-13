package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.ConditionType;

import java.util.List;

public interface ConditionTypeMapper {
    int deleteByPrimaryKey(Integer conditionTypeId);

    int insert(ConditionType record);

    int insertSelective(ConditionType record);

    ConditionType selectByPrimaryKey(Integer conditionTypeId);

    int updateByPrimaryKeySelective(ConditionType record);

    int updateByPrimaryKey(ConditionType record);

    List<ConditionType> listConditionType(ConditionType record);
}