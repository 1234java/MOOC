package com.zking.ssm.LonginIndex.controller;

import com.zking.ssm.LonginIndex.service.IUserService;
import com.zking.ssm.base.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/admin/user")
public class UsertController {

    @Autowired
    private IUserService userService;


    @ModelAttribute
    public void init(Model model){
        User user = new User();
        model.addAttribute("user",user);
    }



    @RequestMapping(value = "/list")
    public String List(){

        return "admin/user/user";
    }

    @RequestMapping(value = "/listUser")
    public ModelAndView listUser(User user, ModelAndView modelAndView, HttpServletRequest request){
        List<User> listUser = userService.list(user);
        System.out.println(listUser);
        modelAndView.addObject("listUser",listUser);
        modelAndView.setViewName("admin/user/user");
        return modelAndView;
    }

    @RequestMapping(value = "/toLoad")
    public String toLoad(){

        return "admin/user/user";
    }

    @RequestMapping(value = "/Load")
    @ResponseBody
    public User Load(User user,ModelAndView modelAndView,Model model){
        System.out.println(user);
        User user1 = userService.selectByPrimaryKey(user.getpUserid());
        System.out.println(user1);
       /* modelAndView.addObject("user1",user1);
        modelAndView.setViewName("admin/user/user");*/
        return user1;
    }

    @RequestMapping(value ="/Update")
    public String Update(User user,Model model){
         System.out.println("1111");
        System.out.println("User................"+user);
        //user.setpUserid(UUID.randomUUID().toString().replaceAll("-",""));
        //int i = userService.updateByPrimaryKey(user);
       // System.out.println(i);
//        System.out.println("---------"+user);

        userService.updateByPrimaryKey(user);
        return  "redirect:/admin/user/listUser";
                //"admin/user/user";
    }


    @RequestMapping(value = "/Del")
    public String Del(User user,Model model){
        System.out.println(user);
        userService.deleteByPrimaryKey(user.getpUserid());
        return "redirect:/admin/user/listUser";
    }


        @RequestMapping(value = "/Add")
    public String Add(User user,Model model){
            System.out.println("00000000000");
            user.setpUserid(UUID.randomUUID().toString().replaceAll("-","").substring(0,4));
            if(user.getpStatus()==null){
                user.setpStatus(0);
            }
            if (user.getpVip()==null){
                user.setpVip(0);
            }
            userService.add(user);
        return "redirect:/admin/user/listUser";
    }





}
