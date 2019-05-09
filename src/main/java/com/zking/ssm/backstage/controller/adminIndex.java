package com.zking.ssm.backstage.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class adminIndex {

    @RequestMapping("/toadmin")
    public  String toadminIndex(){

        return  "admin/index";
    }




    @RequestMapping("/userindex")
    public  String userlist(){

        return  "admin/user/index";
    }

    //个人
    @RequestMapping("/userlist")
    public  String userList(){

        return  "admin/user/user";
    }

    //企业
    @RequestMapping("/userenterpise")
    public  String useRenterpise(){

        return  "admin/user/enterprise";
    }


    //认证
    @RequestMapping("/attestation")
    public  String attestation(){

        return  "admin/attestation/attestationList";
    }


    //借贷
    @RequestMapping("/debit")
    public  String debit(){

        return  "admin/debit/debit";
    }


    //评论
    @RequestMapping("/comment")
    public  String comment(){

        return  "admin/comment/comment";
    }


    //信用管理
       @RequestMapping("/cradit")
    public  String craditlist(){

        return  "admin/credit/creditList";
    }


    @RequestMapping("/cradit/report")
    public  String craditreport(){

        return  "admin/credit/report";
    }







    @RequestMapping("/tosyso")
    public  String tosys(){

        return  "admin/system/index";
    }


    //管理列表
    @RequestMapping("/toadminlist")
    public  String toadminlist(){

        return  "admin/system/adminlist";
    }


    //借款类型列表
    @RequestMapping("/toborrowtype")
    public  String toBorrowtype(){

        return  "admin/system/borrow_type";
    }

    //资金类型列表
    @RequestMapping("/tocapitaltype")
    public  String toCapitaltype(){

        return  "admin/system/capital_type";
    }

    //投资类型列表
    @RequestMapping("/toinvesttype")
    public  String toinvesttype(){

        return  "admin/system/invest_type";
    }

    // 机构类型列表
    @RequestMapping("/toorganizationtype")
    public  String toOrganizationtype(){

        return  "admin/system/organization_type";
    }







}
