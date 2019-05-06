package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.Borrower;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BorrowerMapper {
    int deleteByPrimaryKey(Integer bId);

    int insert(Borrower record);

    int insertSelective(Borrower record);

    Borrower selectByPrimaryKey(Integer bId);

    int updateByPrimaryKeySelective(Borrower record);

    int updateByPrimaryKey(Borrower record);
    List<Borrower> listBorrower(Borrower borrower);
}