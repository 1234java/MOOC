package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.InstitutionalType;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
机构类型
 */
@Repository
public interface InstitutionalTypeMapper {
    int deleteByPrimaryKey(Integer iTypeid);

    int insert(InstitutionalType record);

    int insertSelective(InstitutionalType record);

    InstitutionalType selectByPrimaryKey(Integer iTypeid);

    int updateByPrimaryKeySelective(InstitutionalType record);

    int updateByPrimaryKey(InstitutionalType record);



    //查询所有
    List<InstitutionalType>  listInstitutionalType(InstitutionalType institutionalType);
}