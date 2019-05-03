package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.LogonLog;

public interface LogonLogMapper {
    int deleteByPrimaryKey(Integer lId);

    int insert(LogonLog record);

    int insertSelective(LogonLog record);

    LogonLog selectByPrimaryKey(Integer lId);

    int updateByPrimaryKeySelective(LogonLog record);

    int updateByPrimaryKey(LogonLog record);
}