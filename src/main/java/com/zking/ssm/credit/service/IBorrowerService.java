package com.zking.ssm.credit.service;

import com.zking.ssm.base.model.Borrower;

import java.util.List;

public interface IBorrowerService {
    int deleteByPrimaryKey(Integer bId);

    int insert(Borrower record);

    int insertSelective(Borrower record);

    Borrower selectByPrimaryKey(Borrower record);

    int updateByPrimaryKeySelective(Borrower record);

    int updateByPrimaryKey(Borrower record);
    Borrower load(Borrower record);
    int updatebStatus(Borrower record);
    List<Borrower> listborrower(Borrower borrower);
    List<Borrower> listBorrower(Borrower borrower);
}