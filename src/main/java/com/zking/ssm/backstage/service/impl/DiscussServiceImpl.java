package com.zking.ssm.backstage.service.impl;

import com.zking.ssm.backstage.service.IDiscussService;
import com.zking.ssm.base.mapper.DiscussMapper;
import com.zking.ssm.base.model.Discuss;
import com.zking.ssm.base.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class DiscussServiceImpl implements IDiscussService {
    @Autowired
    private DiscussMapper discussMapper;


    @Override
    public int deleteByPrimaryKey(Discuss discuss) {
        return discussMapper.deleteByPrimaryKey(discuss.getdId());
    }

    @Override
    public int insert(Discuss discuss) {
        return discussMapper.insert(discuss);
    }

    @Override
    public int insertSelective(Discuss discuss) {

        return discussMapper.insertSelective(discuss);
    }

    @Override
    public Discuss selectByPrimaryKey(Discuss discuss) {

        return discussMapper.selectByPrimaryKey(discuss.getdId());
    }

    @Override
    public int updateByPrimaryKeySelective(Discuss discuss) {
        return discussMapper.updateByPrimaryKeySelective(discuss);
    }

    @Override
    public int updateByPrimaryKey(Discuss discuss) {

        return discussMapper.updateByPrimaryKey(discuss);
    }

    @Override
    public List<Discuss> list(Discuss discuss,PageBean pageBean) {

        return discussMapper.list(discuss);
    }
}
