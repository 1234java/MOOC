package com.zking.ssm.base.model;

import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Component;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

@Component
@Data
@ToString
public class Borrower implements Serializable {

    public static interface ValidateGroups{

        // 新增/修改
        public static interface AddEdit {
        }
        // 上架/下架
        public static interface Del {
        }

        // 更新封面
        public static interface UpdateBorrowImage {
        }

    }

    @NotBlank(message = "Id不能为空",groups = {Borrower.ValidateGroups.AddEdit.class,Borrower.ValidateGroups.UpdateBorrowImage.class,Borrower.ValidateGroups.Del.class})
    private Integer bId;

    @NotBlank(message = "借款名称不能为空")
    private String bName;

    @NotBlank(message = "申请人不能为空",groups = {Borrower.ValidateGroups.AddEdit.class,Borrower.ValidateGroups.UpdateBorrowImage.class})
    private String bUsername;

    @NotBlank(message = "申请人不能为空")
    private Double bMoney;

    private Integer bRate;

    private Date bMoneyDeadline;

    //    @Size(max = 11,min =11,message = "手机号码长度为11位数字")
//    @Range(max = 11,min = 11,message = "手机号码长度为11位数字")
    @Length(max = 11,min = 11,message = "手机号码长度为11位数字",groups ={Borrower.ValidateGroups.AddEdit.class})
    private String bPhone;

    private Integer bHouse;

    private Double bTotalValue;

    @NotBlank(message = "借款用途不能为空",groups ={Borrower.ValidateGroups.AddEdit.class})
    private String bUse;

    private String bDescribe;

    @NotBlank(message = "借款情况不能为空",groups ={Borrower.ValidateGroups.AddEdit.class})
    private Integer bCondition;

    @NotBlank(message = "借款类型不能为空",groups ={Borrower.ValidateGroups.AddEdit.class})
    private Integer bBorrowerType;

    @Max(value = 99,message = "已有投标数量不能大于99")
    @Min(value = 1,message = "已有投标数量不能小于1")
    private Integer bBidcount;

    private Integer bStatus;


}