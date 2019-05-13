package com.zking.ssm.hipoteca.service.impl;

import com.zking.ssm.base.mapper.InvestmentMapper;
import com.zking.ssm.base.model.InstitutionalType;
import com.zking.ssm.base.model.Investment;
import com.zking.ssm.hipoteca.service.Binvestment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class BinvestmentImpl implements Binvestment {

    @Autowired
    private InvestmentMapper investmentMapper;


    @Override
    public int deleteByPrimaryKey(Integer iId) {
        return 0;
    }

    @Override
    public int insert(Investment record) {
        return investmentMapper.insert(record);
    }

    @Override
    public int insertSelective(Investment record) {
        return 0;
    }

    @Override
    public Investment selectByPrimaryKey(Integer iId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Investment record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Investment record) {
        return 0;
    }

    @Override
    public int select() {
        return investmentMapper.select();
    }

    @Override
    public int update(Integer id) {
        return investmentMapper.update(id);
    }
}
