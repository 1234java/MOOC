package com.zking.ssm.backstage.controller;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zking.ssm.backstage.service.InstitutionalTypeSerice;
import com.zking.ssm.backstage.service.InvestmentTypeSerive;
import com.zking.ssm.backstage.service.impl.InstitutionalTypeServiceImpl;
import com.zking.ssm.base.model.BorrowerType;
import com.zking.ssm.base.model.InstitutionalType;
import com.zking.ssm.base.model.InvestmentType;
import com.zking.ssm.base.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/system/institutional")
public class InstitutionalTypControlerr {

    @Autowired
    private InstitutionalTypeSerice typeSerice;

    @RequestMapping(value = "/institutionaltylelist")
    @ResponseBody
    public   List<InstitutionalType> list(InstitutionalType institutionalType, HttpServletRequest req, HttpServletResponse response) throws Exception {
        PageBean pageBean =new PageBean();
        pageBean.setRequest(req);
        System.out.println(institutionalType);
        List<InstitutionalType> list = typeSerice.list(institutionalType, pageBean);
        // typeServiceo.l
        for (InstitutionalType type : list) {
            System.out.println(type);
        }
        return  list;
    }




    @RequestMapping("/add")
    public String add(InstitutionalType institutionalType, Model model){
        System.out.println(institutionalType);
        typeSerice.insert(institutionalType);
        return  "redirect:/admin/toorganizationtype";

    }

    @RequestMapping("/del")
    public String delinvestmentType(InstitutionalType institutionalType, Model model){
        System.out.println(institutionalType);
        typeSerice.deleteByPrimaryKey(institutionalType);
        return  "redirect:/admin/toorganizationtype";
        //"";

    }

}
