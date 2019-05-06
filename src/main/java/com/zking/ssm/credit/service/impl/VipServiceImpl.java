package com.zking.ssm.credit.service.impl;

import com.zking.ssm.base.mapper.VipMapper;
import com.zking.ssm.base.model.Vip;
import com.zking.ssm.credit.service.IVipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class VipServiceImpl implements IVipService {

    @Autowired
    private VipMapper vipMapper;

    @Override
    public int deleteByPrimaryKey(Integer vId) {
        return vipMapper.deleteByPrimaryKey(vId);
    }

    @Override
    public int insert(Vip record) {

        return vipMapper.insert(record);
    }

    @Override
    public int insertSelective(Vip record) {
        return 0;
    }

    @Override
    public Vip selectByPrimaryKey(Integer vId) {

        return vipMapper.selectByPrimaryKey(vId);
    }

    @Override
    public int updateByPrimaryKeySelective(Vip record) {

        return 0;
    }

    @Override
    public int updateByPrimaryKey(Vip record) {

        return vipMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Vip> listVip(Vip vip) {

        return vipMapper.listVip(vip);
    }
}
