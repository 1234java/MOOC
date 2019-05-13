package com.zking.ssm.Borrowing.serviec;

import com.zking.ssm.base.model.Borrower;
import com.zking.ssm.base.utils.PageBean;

import java.util.List;

/**
 * @author mi
 * @create 2019-05-03 20:05
 */

public interface IBorrowerServiec {

    void deleteByPrimaryKey(Integer bId);

    int insert(Borrower record);

    int insertSelective(Borrower record);

    Borrower selectByPrimaryKey(Borrower record);

    int updateByPrimaryKeySelective(Borrower record);

    int updateByPrimaryKey(Borrower record);

    List<Borrower> listBorrower(Borrower borrower, PageBean pageBean);

    List<Borrower> listBorrowerStatus(Borrower borrower, PageBean pageBean);
}
