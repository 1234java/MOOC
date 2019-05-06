package com.zking.ssm.hipoteca.service.impl;

import com.zking.ssm.base.mapper.BorrowerMapper;
import com.zking.ssm.base.model.Borrower;
import com.zking.ssm.hipoteca.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class IBorrowerServiceImpl implements BorrowerService {
    @Autowired
   private    BorrowerMapper borrowerMapper;

    @Override
    public int deleteByPrimaryKey(Integer bId) {
        return 0;
    }

    @Override
    public int insert(Borrower record) {
        return borrowerMapper.insert(record);
    }

    @Override
    public int insertSelective(Borrower record) {
        return 0;
    }

    @Override
    public Borrower selectByPrimaryKey(Integer bId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Borrower record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Borrower record) {
        return 0;
    }
}
