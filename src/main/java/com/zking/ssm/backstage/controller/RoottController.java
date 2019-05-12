package com.zking.ssm.backstage.controller;


import com.zking.ssm.backstage.service.IRoottService;
import com.zking.ssm.base.model.Root;
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
@RequestMapping("/system/root")
public class RoottController {

    @Autowired
    private IRoottService ice;
    @RequestMapping("/list")
    @ResponseBody
    public Map<String,Object> list(Root root, Model model, HttpServletRequest req,String  page){
        Map<String,Object> map=new HashMap<String,Object>();
        System.out.println(root);
        PageBean pageBean =new PageBean();
        if(page ==null){
            pageBean.setPage(1);
        }else {
            pageBean.setPage(page);
        }
        pageBean.setRequest(req);
        List<Root> list = ice.list(root, pageBean);
        for (Root root1 : list) {
            System.out.println(root1);
        }
        map.put("list",list);
        map.put("pageBean",pageBean);
        return  map;
    }


    @RequestMapping("/add")
    public  String add(Root root,Model model) {
        System.out.println(root);
        root.setrStatus(0);
        ice.insert(root);

        return  "redirect:/admin/toadminlist";
    }

    @RequestMapping("/load")
    @ResponseBody
    public  Root load(Root root,Model model) {
        Root root1 = ice.selectByPrimaryKey(root);
        System.out.println(root1);
        return  root1;
    }
    @RequestMapping("/update")
    @ResponseBody
    public int update(Root root){

        ice.updateByPrimaryKeySelective(root);

        System.out.println(root);
        return  1;
    }
    @RequestMapping("/del")
    public String del(Root root){

        ice.deleteByPrimaryKey(root);

        System.out.println(root);
        return  "redirect:/admin/toadminlist";
    }


}
