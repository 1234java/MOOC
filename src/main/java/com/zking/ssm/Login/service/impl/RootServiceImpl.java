package com.zking.ssm.Login.service.impl;

import com.zking.ssm.Login.service.IRootService;
import com.zking.ssm.base.mapper.RootMapper;
import com.zking.ssm.base.model.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RootServiceImpl implements IRootService {
    @Autowired
    private RootMapper rootMapper;

    @Override
    public int deleteByPrimaryKey(Integer rId) {
        return 0;
    }

    @Override
    public int insert(Root record) {

        return rootMapper.insert(record);
    }

    @Override
    public int insertSelective(Root record) {
        return 0;
    }

    @Override
    public Root selectByPrimaryKey(Integer rId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Root record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Root record) {

        return rootMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Root> list(Root root) {

        return rootMapper.list(root);
    }
}
