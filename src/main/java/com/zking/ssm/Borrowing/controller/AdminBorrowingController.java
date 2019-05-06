package com.zking.ssm.Borrowing.controller;

import com.zking.ssm.Borrowing.serviec.IBorrowerServiec;
import com.zking.ssm.base.model.Borrower;
import com.zking.ssm.base.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author mi
 * @create 2019-05-04 18:43
 */
@Controller
@RequestMapping("/adminBorrowing")
public class AdminBorrowingController {

    @Autowired
    private IBorrowerServiec borrowerServiec;

    public void init(Model model){
        Borrower borrower =new Borrower();
        model.addAttribute("borrower",borrower);
    }


    @RequestMapping("/toBorrowingDetails")
    public String toBorrowingDetails(Borrower borrower, HttpServletRequest request){

        this.listBorrowingDetails(borrower,request);
        return "admin/adminBorrowing/BorrowingDetails";
    }


    @RequestMapping(value = "/listBorrowingDetails",produces = "application/json;text/html;charset=UTF-8")
    @ResponseBody
    public List<Borrower> listBorrowingDetails(Borrower borrower, HttpServletRequest request){
//        System.out.println("---------");
//        System.out.println(borrower.getbName());
        PageBean pageBean=new PageBean();
        //分页初始化
        pageBean.setRequest(request);
        List<Borrower> borrowers = borrowerServiec.listBorrower(borrower, pageBean);
        for (Borrower borrower1 : borrowers) {
            System.out.println(borrower1);
        }
//        modelAndView.addObject("borrowers",borrowers);
//        modelAndView.addObject("pageBean",pageBean);
//        modelAndView.setViewName("adminBorrowing/listBorrowingDetails");

        return borrowers;
    }






}
