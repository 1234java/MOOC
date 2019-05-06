package com.zking.ssm.backstage.controller;

import com.zking.ssm.backstage.service.IBorrowerTypeSerice;
import com.zking.ssm.base.model.BorrowerType;
import com.zking.ssm.base.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller


@RequestMapping("/system")
public class BorrowTypeController {

    @Autowired
    private IBorrowerTypeSerice typeServiec;


    @RequestMapping("/borrowertypelist")
    @ResponseBody
    public   String list(BorrowerType borrowerType, HttpServletRequest req, HttpServletResponse response) throws Exception {
        PrintWriter out = response.getWriter();
        System.out.println("---");
        PageBean pageBean =new PageBean();
        pageBean.setRows(2);
        pageBean.setRequest(req);
        List<BorrowerType> list = typeServiec.list(borrowerType, pageBean);


        out.print(list);
        return  null;
    }


}
