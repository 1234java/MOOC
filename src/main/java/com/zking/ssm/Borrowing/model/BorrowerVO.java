package com.zking.ssm.Borrowing.model;

import com.zking.ssm.base.model.Borrower;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author mi
 * @create 2019-05-07 18:15
 */
@Data
@ToString
public class BorrowerVO extends Borrower implements Serializable {

    //借款情况
    private String situation;

    public BorrowerVO() {

    }

    public BorrowerVO(Borrower borrower){

    }
}
