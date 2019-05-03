package com.zking.ssm.Borrowing.serviec;

import com.zking.ssm.base.model.Borrower;

/**
 * @author mi
 * @create 2019-05-03 20:05
 */

public interface IBorrowerServiec {

    void deleteByPrimaryKey(Integer bId);

    int insert(Borrower record);

    int insertSelective(Borrower record);

    Borrower selectByPrimaryKey(Integer bId);

    int updateByPrimaryKeySelective(Borrower record);

    int updateByPrimaryKey(Borrower record);
}
