package com.zking.ssm.backstage.controller;

import com.zking.ssm.backstage.service.IBorrowerTypeService;
import com.zking.ssm.base.model.BorrowerType;
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


@RequestMapping("/system")
public class BorrowTypeController {

    @Autowired
    private IBorrowerTypeService typeServiec;


    @RequestMapping(value = "/borrowertypelist")
    @ResponseBody
    public Map<String,Object> list(BorrowerType borrowerType, HttpServletRequest req, String  page) throws Exception {
        Map<String,Object> map=new HashMap<String,Object>();
        System.out.println("---");
        System.out.println(page);
        PageBean pageBean =new PageBean();
        pageBean.setRequest(req);

        pageBean.setRows(7);
        if(page ==null){
            pageBean.setPage(1);
        }else {
            pageBean.setPage(page);
        }
        List<BorrowerType> list = typeServiec.list(borrowerType, pageBean);
        for (BorrowerType type : list) {
            System.out.println(type);
        }
        System.out.println(pageBean);
        map.put("list",list);
        map.put("pageBean",pageBean);

        return  map;
    }




    @RequestMapping("/add")
    public String add(BorrowerType borrowerType, Model model){
        System.out.println(borrowerType);
        typeServiec.insert(borrowerType);
        return  "redirect:/admin/toborrowtype";

    }

    @RequestMapping("/del")
    public String delborrowertype(BorrowerType borrowerType, Model model){
        System.out.println(borrowerType);
        typeServiec.deleteByPrimaryKey(borrowerType);
        return  "redirect:/admin/toborrowtype";
                //"";

    }



}
