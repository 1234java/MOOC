package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.Borrower;

public interface BorrowerMapper {
    int insert(Borrower record);

    int insertSelective(Borrower record);
}