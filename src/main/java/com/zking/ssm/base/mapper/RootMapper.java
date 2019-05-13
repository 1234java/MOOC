package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.Root;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RootMapper {
    int deleteByPrimaryKey(Integer rId);

    int insert(Root record);

    int insertSelective(Root record);

    Root selectByPrimaryKey(Integer rId);

    int updateByPrimaryKeySelective(Root record);

    int updateByPrimaryKey(Root record);

    Root selectByRName(String rname);

    List<Root> list(Root root);







}