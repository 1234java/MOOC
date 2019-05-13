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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/comment")
public class CommentControler {

    @Autowired
    private IDiscussService service;
    @RequestMapping("/list")
    @ResponseBody
    public Map<String,Object> list(Discuss discuss, HttpServletRequest req, Model model,String  page){
        Map<String,Object> map=new HashMap<String,Object>();
        PageBean pageBean =new PageBean();
        if(page ==null){
            pageBean.setPage(1);
        }else {
            pageBean.setPage(page);
        }
        pageBean.setRequest(req);
        List<Discuss> list = service.list(discuss,pageBean);
        for (Discuss discuss1 : list) {
            System.out.println(discuss1);
        }
        map.put("list",list);
        map.put("pageBean",pageBean);
        return  map;
    }


    @RequestMapping("/del")
    public String del(Discuss discuss, HttpServletRequest req, Model model){
        System.out.println(discuss);
        service.deleteByPrimaryKey(discuss);


        return  "redirect:/admin/comment";
    }



}
