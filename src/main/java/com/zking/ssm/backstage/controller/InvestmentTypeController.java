package com.zking.ssm.backstage.controller;

import com.zking.ssm.backstage.service.InvestmentTypeSerive;
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
import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/system/investment")
public class InvestmentTypeController {
    @Autowired
    private InvestmentTypeSerive typeSerive;

    @ResponseBody
    @RequestMapping("/list")
    public List<InvestmentType> list(InvestmentType investmentType, HttpServletRequest req, HttpServletResponse response) throws Exception {
        PageBean pageBean =new PageBean();
        pageBean.setRequest(req);
        System.out.println(investmentType);
        List<InvestmentType> list = typeSerive.list(investmentType, pageBean);
        // typeServiceo.l
        for (InvestmentType type : list) {
            System.out.println(type);
        }
        return  list;
    }




    @RequestMapping("/add")
    public String add(InvestmentType investmentType, Model model){
        System.out.println(investmentType);
        typeSerive.insert(investmentType);
        return  "redirect:/admin/toinvesttype";

    }

    @RequestMapping("/del")
    public String delinvestmentType(InvestmentType investmentType, Model model){
        System.out.println(investmentType);
        typeSerive.deleteByPrimaryKey(investmentType);
        return  "redirect:/admin/toinvesttype";
        //"";

    }


}
