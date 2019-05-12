package com.zking.ssm.Borrowing.serviec;

import com.zking.ssm.base.model.BorrowerType;

/**
 * @author mi
 * @create 2019-05-03 20:20
 */
public interface IBorrowerTypeServiec {

    void deleteByPrimaryKey(Integer bTypeId);

    int insert(BorrowerType record);

    int insertSelective(BorrowerType record);

    BorrowerType selectByPrimaryKey(Integer bTypeId);

    int updateByPrimaryKeySelective(BorrowerType record);

    int updateByPrimaryKey(BorrowerType record);

}
