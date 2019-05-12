package com.zking.ssm.backstage.service.impl;

import com.zking.ssm.backstage.service.IRoottService;
import com.zking.ssm.base.mapper.RootMapper;
import com.zking.ssm.base.model.Root;
import com.zking.ssm.base.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class RoottServiceImpl implements IRoottService {
    @Autowired
    private RootMapper rootMapper;

    @Override
    public int deleteByPrimaryKey(Root root) {
        return rootMapper.deleteByPrimaryKey(root.getrId());
    }

    @Override
    public int insert(Root root) {

        return rootMapper.insert(root);
    }

    @Override
    public int insertSelective(Root root) {
        return rootMapper.insertSelective(root);
    }

    @Override
    public Root selectByPrimaryKey(Root root) {
        return rootMapper.selectByPrimaryKey(root.getrId());
    }

    @Override
    public int updateByPrimaryKeySelective(Root root) {
        return rootMapper.updateByPrimaryKeySelective(root);
    }

    @Override
    public int updateByPrimaryKey(Root root) {
        return rootMapper.updateByPrimaryKey(root);
    }

    @Override
    public Root selectByRName(String rname) {
        return null;
    }

    @Override
    public List<Root> list(Root root, PageBean pageBean) {
        return rootMapper.list(root);
    }
}
