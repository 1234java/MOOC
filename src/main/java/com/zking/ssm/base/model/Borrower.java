package com.zking.ssm.base.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Component
@ToString
@Data
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
    private List<BorrowerType> borrowerTypeList;

    private List<ConditionType> conditionTypeList;


    @NotBlank(message = "Id不能为空",groups = {Borrower.ValidateGroups.AddEdit.class,Borrower.ValidateGroups.UpdateBorrowImage.class,Borrower.ValidateGroups.Del.class})
    private Integer bId;

    @NotBlank(message = "借款名称不能为空")
    private String bName;

    @NotBlank(message = "申请人不能为空",groups = {Borrower.ValidateGroups.AddEdit.class,Borrower.ValidateGroups.UpdateBorrowImage.class})
    private String bUsername;

    @NotBlank(message = "申请人不能为空")
    private Double bMoney;

    private Integer bRate;

    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss")
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

    public Borrower(Integer bId, String bName, String bUsername, Double bMoney, Integer bRate, Date bMoneyDeadline, String bPhone, Integer bHouse, Double bTotalValue, String bUse, String bDescribe, Integer bCondition, Integer bBorrowerType, Integer bBidcount, Integer bStatus) {
        this.bId = bId;
        this.bName = bName;
        this.bUsername = bUsername;
        this.bMoney = bMoney;
        this.bRate = bRate;
        this.bMoneyDeadline = bMoneyDeadline;
        this.bPhone = bPhone;
        this.bHouse = bHouse;
        this.bTotalValue = bTotalValue;
        this.bUse = bUse;
        this.bDescribe = bDescribe;
        this.bCondition = bCondition;
        this.bBorrowerType = bBorrowerType;
        this.bBidcount = bBidcount;
        this.bStatus = bStatus;
    }

    public Borrower() {
        super();
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbUsername() {
        return bUsername;
    }

    public void setbUsername(String bUsername) {
        this.bUsername = bUsername;
    }

    public Double getbMoney() {
        return bMoney;
    }

    public void setbMoney(Double bMoney) {
        this.bMoney = bMoney;
    }

    public Integer getbRate() {
        return bRate;
    }

    public void setbRate(Integer bRate) {
        this.bRate = bRate;
    }

    public Date getbMoneyDeadline() {
        return bMoneyDeadline;
    }

    public void setbMoneyDeadline(Date bMoneyDeadline) {
        this.bMoneyDeadline = bMoneyDeadline;
    }

    public String getbPhone() {
        return bPhone;
    }

    public void setbPhone(String bPhone) {
        this.bPhone = bPhone;
    }

    public Integer getbHouse() {
        return bHouse;
    }

    public void setbHouse(Integer bHouse) {
        this.bHouse = bHouse;
    }

    public Double getbTotalValue() {
        return bTotalValue;
    }

    public void setbTotalValue(Double bTotalValue) {
        this.bTotalValue = bTotalValue;
    }

    public String getbUse() {
        return bUse;
    }

    public void setbUse(String bUse) {
        this.bUse = bUse;
    }

    public String getbDescribe() {
        return bDescribe;
    }

    public void setbDescribe(String bDescribe) {
        this.bDescribe = bDescribe;
    }

    public Integer getbCondition() {
        return bCondition;
    }

    public void setbCondition(Integer bCondition) {
        this.bCondition = bCondition;
    }

    public Integer getbBorrowerType() {
        return bBorrowerType;
    }

    public void setbBorrowerType(Integer bBorrowerType) {
        this.bBorrowerType = bBorrowerType;
    }

    public Integer getbBidcount() {
        return bBidcount;
    }

    public void setbBidcount(Integer bBidcount) {
        this.bBidcount = bBidcount;
    }

    public Integer getbStatus() {
        return bStatus;
    }

    public void setbStatus(Integer bStatus) {
        this.bStatus = bStatus;
    }
}