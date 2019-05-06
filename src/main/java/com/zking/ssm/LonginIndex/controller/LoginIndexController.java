package com.zking.ssm.LonginIndex.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginIndexController {

    @RequestMapping("/login")
    public  String toIdex(){

        return "LoginIndex/loginIndex";
       /* return "LoginIndex/register";*/
    }
}
