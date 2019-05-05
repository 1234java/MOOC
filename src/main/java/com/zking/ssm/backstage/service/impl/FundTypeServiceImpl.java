package com.zking.ssm.backstage.service.impl;

import com.zking.ssm.backstage.service.IFundTypeService;
import com.zking.ssm.base.mapper.FundTypeMapper;
import com.zking.ssm.base.model.FundType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*

资金类型
 */
@Service
@Transactional
public class FundTypeServiceImpl implements IFundTypeService {

    @Autowired
    private FundTypeMapper typeMapper;


    @Override
    public int deleteByPrimaryKey(FundType fundType) {
        return typeMapper.deleteByPrimaryKey(fundType.getfTId());
    }

    @Override
    public int insert(FundType fundType) {
        return typeMapper.insert(fundType);
    }

    @Override
    public int insertSelective(FundType fundType) {
        return typeMapper.insertSelective(fundType);
    }

    @Override
    public FundType selectByPrimaryKey(FundType fundType) {
        return typeMapper.selectByPrimaryKey(fundType.getfTId());
    }

    @Override
    public int updateByPrimaryKeySelective(FundType fundType) {

        return typeMapper.updateByPrimaryKeySelective(fundType);
    }

    @Override
    public int updateByPrimaryKey(FundType fundType) {

        return typeMapper.updateByPrimaryKey(fundType);
    }
}
