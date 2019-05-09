package com.zking.ssm.Login.controller;

import com.zking.ssm.Login.service.IRootService;
import com.zking.ssm.base.model.Root;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



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
    public String toLogin (Model model){
        return "Login/login";
    }

    @RequestMapping("/login")
    public String login(Model model,Root root){
        System.out.println(root);
        UsernamePasswordToken token = new UsernamePasswordToken(root.getrName(), root.getrPassword());
        Subject subject = SecurityUtils.getSubject();
        String message = null;
        try {
            subject.login(token);
        } catch (UnknownAccountException e) {// 捕获未知用户名异常
            message = "帐号错误";
        } catch (LockedAccountException e) {// 捕获错误登录过多的异常
            message = "帐号已锁定，请与管理员联系";
        } catch (IncorrectCredentialsException e) {// 捕获密码错误异常
            message = "密码错误";
        } catch (ExcessiveAttemptsException e) {// 捕获错误登录过多的异常
            message = "多次登录尝试失败，请60秒后再试";
        }

        if (null == message) {
            Session session = subject.getSession();//此session为org.apache.shiro.session.Session
            session.setAttribute("root",root);//登陆成功后要保存shiro的会话中，已备之后使用
            return "/index";
        } else {
            model.addAttribute("message", message);
            return "Login/login";
        }
    }
    }




