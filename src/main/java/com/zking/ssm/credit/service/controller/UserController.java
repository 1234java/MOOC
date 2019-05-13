package com.zking.ssm.credit.service.controller;

import com.zking.ssm.base.model.User;
import com.zking.ssm.credit.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/credit/user")
public class UserController {


    @Autowired
    private IuserService userService;

    @ModelAttribute
    public void init(Model model){
        User user = new User();
        model.addAttribute("user",user);
    }

    @RequestMapping(value = "/toLoad")
    public String toLoad(){

        return "credit/update";
    }

    @RequestMapping(value = "/Load")
    public ModelAndView Load(User user,ModelAndView modelAndView){
        User user1 = userService.selectByPrimaryKey(user.getpUserid());
        System.out.println(user1);
        modelAndView.addObject("user1",user1);
        modelAndView.setViewName("credit/update");
        return modelAndView;
    }

    @RequestMapping(value = "/toList")
    public String toList(){

        return "credit/list";
    }

    @RequestMapping(value = "/listUser")
    public ModelAndView listUser(User user, ModelAndView modelAndView, HttpServletRequest request){
        List<User> listUser = userService.listUser(user);
        System.out.println(listUser);
        modelAndView.addObject("listUser",listUser);
        modelAndView.setViewName("credit/list");
        return modelAndView;
    }

    @RequestMapping(value = "/Update")
    public String Update(User user){
        userService.updateByPrimaryKey(user);
        return "credit/list";
    }


}
