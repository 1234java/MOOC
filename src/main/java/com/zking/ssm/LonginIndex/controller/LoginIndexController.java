package com.zking.ssm.LonginIndex.controller;


import com.zking.ssm.LonginIndex.service.IOrganizationService;
import com.zking.ssm.LonginIndex.service.IUserService;
import com.zking.ssm.base.model.Organization;
import com.zking.ssm.base.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;


@Controller
@RequestMapping("/LoginIndex/login")
public class LoginIndexController {

    @Autowired
    private IUserService userService;


    @ModelAttribute
    public void init(Model model) {/*会先执行*/
        User u = new User();

        model.addAttribute("user", u);

    }

    //登录
    @RequestMapping("/toLogin")
    public String toAdd() {
        return "LoginIndex/register";
    }

    @RequestMapping("LoginIndex/login")
    public String toIdex() {
        return "LoginIndex/loginIndex";

    }

    @RequestMapping("/register")
    public String add(User user) {
       /* if (bindingResult.hasErrors()) {
           *//* List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError fieldError:fieldErrors) {
                System.out.println(fieldError.getDefaultMessage());
            }*//*
            return "LoginIndex/loginIndex";
        }*/
        user.setpUserid(UUID.randomUUID().toString().replaceAll("-",""));
       if(user.getpUsername()!=null){
           userService.add(user);
       }

       /* return "LoginIndex/register";*/
        return "LoginIndex/register";
    }


    @RequestMapping("/lg")
    public String Login(User user,Model model) {
        System.out.println(user);
        User login = userService.login(user);
        /*Organization ologin=organizationService.login(organization);*/
        if (login != null) {
            return "index";
        }

        return "LoginIndex/register";
    }

    /*@RequestMapping("/lo")
    public String Oogin(Organization organization, Model model) {
        System.out.println(organization);

        Organization login = organizationService.login(organization);
        if (login != null) {
            return "index";
        }
        return "LoginIndex/register";
    }*/


}
