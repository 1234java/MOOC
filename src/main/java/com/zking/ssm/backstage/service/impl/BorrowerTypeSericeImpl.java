package com.zking.ssm.backstage.service.impl;

import com.zking.ssm.backstage.service.IBorrowerTypeSerice;
import com.zking.ssm.base.model.BorrowerType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class BorrowerTypeSericeImpl implements IBorrowerTypeSerice {



    @Override
    public int deleteByPrimaryKey(Integer bTypeId) {
        return 0;
    }

    @Override
    public int insert(BorrowerType record) {
        return 0;
    }

    @Override
    public int insertSelective(BorrowerType record) {
        return 0;
    }

    @Override
    public BorrowerType selectByPrimaryKey(Integer bTypeId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(BorrowerType record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(BorrowerType record) {
        return 0;
    }
}
