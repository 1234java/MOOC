package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.Discuss;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DiscussMapper {
    int deleteByPrimaryKey(Integer dId);

    int insert(Discuss record);

    int insertSelective(Discuss record);

    Discuss selectByPrimaryKey(Integer dId);

    int updateByPrimaryKeySelective(Discuss record);

    int updateByPrimaryKey(Discuss record);

    List<Discuss> list(Discuss discuss);
}