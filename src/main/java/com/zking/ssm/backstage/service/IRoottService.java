package com.zking.ssm.backstage.service;

import com.zking.ssm.base.model.Root;
import com.zking.ssm.base.utils.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IRoottService {
    int deleteByPrimaryKey(Root root);

    int insert(Root root);

    int insertSelective(Root root);

    Root selectByPrimaryKey(Root root);

    int updateByPrimaryKeySelective(Root root);

    int updateByPrimaryKey(Root root);

    Root selectByRName(String rname);

    List<Root> list(Root root, PageBean pageBean);







}