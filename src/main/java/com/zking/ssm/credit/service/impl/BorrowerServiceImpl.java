package com.zking.ssm.credit.service.impl;

import com.zking.ssm.base.mapper.BorrowerMapper;
import com.zking.ssm.base.model.Borrower;
import com.zking.ssm.credit.service.IBorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class BorrowerServiceImpl implements IBorrowerService {

    @Autowired
    private BorrowerMapper borrowerMapper;
    @Override
    public int deleteByPrimaryKey(Integer bId) {
        return borrowerMapper.deleteByPrimaryKey(bId);
    }

    @Override
    public int insert(Borrower record) {

        return borrowerMapper.insert(record);
    }

    @Override
    public int insertSelective(Borrower record) {
        return 0;
    }

    @Override
    public Borrower selectByPrimaryKey(Borrower record) {

        return borrowerMapper.selectByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Borrower record) {
        return borrowerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Borrower record) {

//        System.out.println(record);
        return borrowerMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updatebStatus(Borrower record) {

        return borrowerMapper.updatebStatus(record);
    }

    @Override
    public List<Borrower> listBorrower(Borrower borrower) {

        return borrowerMapper.listBorrower(borrower);
    }

    public List<Borrower> listborrower(Borrower borrower){

        return  borrowerMapper.listborrower(borrower);
    }

    public  Borrower load(Borrower record){

        return  borrowerMapper.load(record);
    }
}
