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


    @RequestMapping("/userlist")
    public  String userlist(){

        return  "admin/user";
    }





}
