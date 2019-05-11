package com.zking.ssm.backstage.controller;


import com.zking.ssm.backstage.service.IDiscussService;
import com.zking.ssm.base.model.Discuss;
import com.zking.ssm.base.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/comment")
public class CommentControler {

    @Autowired
    private IDiscussService service;
    @RequestMapping("/list")
    @ResponseBody
    public List<Discuss> list(Discuss discuss, HttpServletRequest req, Model model){
        PageBean pageBean =new PageBean();
        pageBean.setRequest(req);
        List<Discuss> list = service.list(discuss,pageBean);
        for (Discuss discuss1 : list) {
            System.out.println(discuss1);
        }

        return  list;
    }


    @RequestMapping("/del")
    public String del(Discuss discuss, HttpServletRequest req, Model model){
        System.out.println(discuss);
        service.deleteByPrimaryKey(discuss);


        return  "redirect:/admin/comment";
    }



}
