package com.zking.ssm.hipoteca.service;

import com.zking.ssm.base.model.Borrower;
import com.zking.ssm.base.utils.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BorrowerService {
    int deleteByPrimaryKey(Integer bId);

    int insert(Borrower record);

    int insertSelective(Borrower record);

    Borrower selectByPrimaryKey(Borrower borrower);

    int updateByPrimaryKeySelective(Borrower record);

    int updateByPrimaryKey(Borrower record);

    List<Borrower> listb(PageBean pageBean);//全部

    int selectBy();//总计

    List<Integer> selectByPrimaryInt(); //单个



}