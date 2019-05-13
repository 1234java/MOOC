package com.zking.ssm.credit.service.controller;


import com.zking.ssm.base.model.Borrower;
import com.zking.ssm.credit.service.IBorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/credit/user")
public class BorrowerController {

    @Autowired
    private IBorrowerService borrowerService;

    @ModelAttribute
    public void init(Model model){
        Borrower borrower = new Borrower();
        model.addAttribute(borrower);
    }

    @RequestMapping(value = "/toLoad1")
    public String toLoad1(){

        return "credit/updateBorrower";
    }

    @RequestMapping(value = "/borrowerLoad")
    @ResponseBody
    public Borrower borrowerLoad(Borrower borrower,ModelAndView modelAndView){
        Borrower borrowerLoad = borrowerService.load(borrower);
        System.out.println("查询单个"+borrowerLoad);
        modelAndView.addObject("borrowerLoad",borrowerLoad);
        modelAndView.setViewName("admin/credit/debit");
        return borrowerLoad;
    }

    @RequestMapping(value = "/toGet")
    public String toGet(){

        return "credit/listBorrower";
    }

    @RequestMapping(value = "/listBorrower")
    public ModelAndView listBorrower(Borrower borrower, ModelAndView modelAndView){
        List<Borrower> listBorrower = borrowerService.listborrower(borrower);
        System.out.println(listBorrower);
        modelAndView.addObject("listBorrower",listBorrower);
        modelAndView.setViewName("admin/debit/debit");
        return modelAndView;
    }

    @RequestMapping(value = "/BorrowerUpdate")
    public String BorrowerUpdate(Borrower borrower){
        System.out.println("修改状态"+borrower.getbId());
        borrower.setbStatus(3);
        borrowerService.updateByPrimaryKeySelective(borrower);
        return "forward:/credit/user/listBorrower";
    }

    @RequestMapping(value = "/UpdatebStatus")
    public String UpdatebStatus(Borrower borrower){
        System.out.println("状态"+borrower.getbId());
        borrower.setbStatus(4);
        borrowerService.updateByPrimaryKeySelective(borrower);
        return "forward:/credit/user/listBorrower";
    }

    @RequestMapping(value = "/DelBorrower")
    public String DelBorrower(Borrower borrower){
        System.out.println(borrower);
        System.out.println(borrower.getbId());
        if(borrower.getbStatus()==4){
            borrowerService.deleteByPrimaryKey(borrower.getbId());
        }
        return "forward:/credit/user/listBorrower";
    }
}
