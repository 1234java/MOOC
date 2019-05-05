package com.zking.ssm.Borrowing.serviec.impl;

import com.zking.ssm.Borrowing.serviec.IBorrowerServiec;
import com.zking.ssm.base.mapper.BorrowerMapper;
import com.zking.ssm.base.model.Borrower;
import com.zking.ssm.base.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author mi
 * @create 2019-05-03 20:10
 */
@Service
@Transactional
public class IBorrowerServiecImpl implements IBorrowerServiec {

    @Autowired
    private BorrowerMapper borrowerMapper;

    @Override
    public void deleteByPrimaryKey(Integer bId) {
        borrowerMapper.deleteByPrimaryKey(bId);
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
    public Borrower selectByPrimaryKey(Integer bId) {
        return borrowerMapper.selectByPrimaryKey(bId);
    }

    @Override
    public int updateByPrimaryKeySelective(Borrower record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Borrower record) {
        return borrowerMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Borrower> listBorrower(Borrower borrower, PageBean pageBean) {
        return borrowerMapper.listBorrower(borrower);
    }
}
