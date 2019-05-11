package com.zking.ssm.backstage.controller;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zking.ssm.backstage.service.IBorrowerTypeService;
import com.zking.ssm.base.model.BorrowerType;
import com.zking.ssm.base.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;

@Controller


@RequestMapping("/system")
public class BorrowTypeController {

    @Autowired
    private IBorrowerTypeService typeServiec;


    @RequestMapping(value = "/borrowertypelist")
    @ResponseBody
    public   String list(BorrowerType borrowerType, HttpServletRequest req, HttpServletResponse response) throws Exception {
        PrintWriter out = response.getWriter();
        System.out.println("---");
        PageBean pageBean =new PageBean();
        pageBean.setRows(2);
        pageBean.setRequest(req);
        List<BorrowerType> list = typeServiec.list(borrowerType, pageBean);
        for (BorrowerType type : list) {
            System.out.println(type);
        }
        ObjectMapper mapper = new ObjectMapper();



        JsonGenerator generator = mapper.getJsonFactory().createJsonGenerator(System.out,JsonEncoding.UTF8);

        String s = mapper.writeValueAsString(list);

        //out.print(list);
        out.print(s);

        return  null;
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
