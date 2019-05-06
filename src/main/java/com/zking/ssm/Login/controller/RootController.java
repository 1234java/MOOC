package com.zking.ssm.Login.controller;

import com.zking.ssm.Login.service.IRootService;
import com.zking.ssm.base.model.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;

@Controller
public class RootController{
    @Autowired
    private IRootService rootService;


    @ModelAttribute
    public  void  init(Model model){
        Root r = new Root();
        model.addAttribute("root", r);
    }

    @RequestMapping("/root")
    public String r (){
        System.out.println("34567890");
        return "Login/login";
    }

}
