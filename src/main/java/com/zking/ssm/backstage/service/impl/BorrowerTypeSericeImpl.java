package com.zking.ssm.backstage.service.impl;

import com.zking.ssm.backstage.service.IBorrowerTypeSerice;
import com.zking.ssm.base.mapper.BorrowerTypeMapper;
import com.zking.ssm.base.model.BorrowerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class BorrowerTypeSericeImpl implements IBorrowerTypeSerice {

    @Autowired
    private BorrowerTypeMapper typeMapper;


    @Override
    public int deleteByPrimaryKey(BorrowerType borrowerType) {

        return typeMapper.deleteByPrimaryKey(borrowerType.getbTypeId());
    }

    @Override
    public int insert(BorrowerType borrowerType) {
        return typeMapper.insert(borrowerType);
    }

    @Override
    public int insertSelective(BorrowerType borrowerType) {

        return typeMapper.insertSelective(borrowerType);
    }

    @Override
    public BorrowerType selectByPrimaryKey(BorrowerType borrowerType) {
        return typeMapper.selectByPrimaryKey(borrowerType.getbTypeId());
    }

    @Override
    public int updateByPrimaryKeySelective(BorrowerType borrowerType) {
        return typeMapper.updateByPrimaryKey(borrowerType);
    }

    @Override
    public int updateByPrimaryKey(BorrowerType borrowerType)
    {
        return typeMapper.updateByPrimaryKey(borrowerType);
    }
}
