package com.zking.ssm.backstage.service;

import com.zking.ssm.base.model.Discuss;
import com.zking.ssm.base.utils.PageBean;

import java.util.List;

public interface IDiscussService {
    int deleteByPrimaryKey(Discuss discuss);

    int insert(Discuss discuss);

    int insertSelective(Discuss discuss);

    Discuss selectByPrimaryKey(Discuss discuss);

    int updateByPrimaryKeySelective(Discuss discuss);

    int updateByPrimaryKey(Discuss discuss);

    List<Discuss> list(Discuss discuss, PageBean pageBean);
}