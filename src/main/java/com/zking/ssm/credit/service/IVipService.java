package com.zking.ssm.credit.service;

import com.zking.ssm.base.model.Vip;

import java.util.List;

public interface IVipService {
    int deleteByPrimaryKey(Integer vId);

    int insert(Vip record);

    int insertSelective(Vip record);

    Vip selectByPrimaryKey(Integer vId);

    int updateByPrimaryKeySelective(Vip record);

    int updateByPrimaryKey(Vip record);

    List<Vip> listVip(Vip vip);
}
