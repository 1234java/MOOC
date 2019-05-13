package com.zking.ssm.hipoteca.service.impl;

import com.zking.ssm.base.mapper.BorrowerMapper;
import com.zking.ssm.base.model.Borrower;
import com.zking.ssm.base.utils.PageBean;
import com.zking.ssm.hipoteca.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IBorrowerServiceImpl implements BorrowerService {
    @Autowired
   private    BorrowerMapper borrowerMapper;

    @Override
    public int deleteByPrimaryKey(Integer bId) {
        return 0;
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
    public Borrower selectByPrimaryKey(Borrower borrower) {
        return borrowerMapper.selectByPrimaryKey(borrower.getbId());
    }

    @Override
    public int updateByPrimaryKeySelective(Borrower record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Borrower record) {
        return 0;
    }

    @Override
    public List<Borrower> listb(PageBean pageBean) {
        return borrowerMapper.listb();
    }

    @Override
    public int selectBy() {
        return borrowerMapper.selectBy();
    }

    @Override
    public List<Integer> selectByPrimaryInt() {
        return borrowerMapper.selectByPrimaryInt();
    }




}
