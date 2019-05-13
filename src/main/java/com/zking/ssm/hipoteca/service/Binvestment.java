package com.zking.ssm.hipoteca.service;

import com.zking.ssm.base.model.InstitutionalType;
import com.zking.ssm.base.model.Investment;

public interface Binvestment {
    int deleteByPrimaryKey(Integer iId);

    int insert(Investment record);

    int insertSelective(Investment record);

    Investment selectByPrimaryKey(Integer iId);

    int updateByPrimaryKeySelective(Investment record);

    int updateByPrimaryKey(Investment record);

    int  select();

    int update (Integer id);
}
