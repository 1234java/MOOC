package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.LogonLog;

public interface LogonLogMapper {
    int insert(LogonLog record);

    int insertSelective(LogonLog record);
}