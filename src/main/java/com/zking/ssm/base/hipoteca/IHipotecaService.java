package com.zking.ssm.base.hipoteca;

import com.zking.ssm.base.model.Borrower;

public interface IHipotecaService {
    int deleteByPrimaryKey(Integer bId);

    int insert(Borrower record);

    int insertSelective(Borrower record);

    Borrower selectByPrimaryKey(Integer bId);

    int updateByPrimaryKeySelective(Borrower record);

    int updateByPrimaryKey(Borrower record);


}
