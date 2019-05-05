package com.zking.ssm.Borrowing.serviec.impl;

import com.zking.ssm.Borrowing.serviec.IBorrowerTypeServiec;
import com.zking.ssm.base.mapper.BorrowerTypeMapper;
import com.zking.ssm.base.model.BorrowerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author mi
 * @create 2019-05-03 20:22
 */
@Service
@Transactional
public class IBorrowerTypeServiecImpl implements IBorrowerTypeServiec {

    @Autowired
    private BorrowerTypeMapper borrowerTypeMapper;

    @Override
    public void deleteByPrimaryKey(Integer bTypeId) {
        borrowerTypeMapper.deleteByPrimaryKey(bTypeId);
    }

    @Override
    public int insert(BorrowerType record) {
        return borrowerTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(BorrowerType record) {
        return 0;
    }

    @Override
    public BorrowerType selectByPrimaryKey(Integer bTypeId) {
        return borrowerTypeMapper.selectByPrimaryKey(bTypeId);
    }

    @Override
    public int updateByPrimaryKeySelective(BorrowerType record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(BorrowerType record) {
        return borrowerTypeMapper.updateByPrimaryKey(record);
    }
}
