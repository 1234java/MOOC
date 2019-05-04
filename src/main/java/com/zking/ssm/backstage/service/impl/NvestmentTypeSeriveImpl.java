package com.zking.ssm.backstage.service.impl;

import com.zking.ssm.backstage.service.InvestmentTypeSerive;
import com.zking.ssm.base.mapper.InvestmentTypeMapper;
import com.zking.ssm.base.model.InvestmentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
/*
投资类型
 */
public class NvestmentTypeSeriveImpl implements InvestmentTypeSerive {

    @Autowired
    private InvestmentTypeMapper typeMapper ;

    @Override
    public int deleteByPrimaryKey(InvestmentType investmentType) {
        return typeMapper.deleteByPrimaryKey(investmentType.getiTypeid());
    }

    @Override
    public int insert(InvestmentType investmentType) {
        return typeMapper.insert(investmentType);
    }

    @Override
    public int insertSelective(InvestmentType investmentType) {
        return typeMapper.insertSelective(investmentType);
    }

    @Override
    public InvestmentType selectByPrimaryKey(InvestmentType investmentType) {
        return typeMapper.selectByPrimaryKey(investmentType.getiTypeid());
    }

    @Override
    public int updateByPrimaryKeySelective(InvestmentType investmentType) {
        return typeMapper.updateByPrimaryKeySelective(investmentType);
    }

    @Override
    public int updateByPrimaryKey(InvestmentType investmentType) {
        return typeMapper.updateByPrimaryKey(investmentType);
    }
}
