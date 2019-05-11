package com.zking.ssm.Borrowing.controller;

import com.zking.ssm.Borrowing.serviec.IBorrowerServiec;
import com.zking.ssm.base.model.Borrower;
import com.zking.ssm.base.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
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

    @ModelAttribute
    public void init(Model model){
        Borrower borrower =new Borrower();
        model.addAttribute("borrower",borrower);
    }


    @RequestMapping("/toBorrowingDetails")
    public String toBorrowingDetails(Borrower borrower, HttpServletRequest request){

        return "admin/adminBorrowing/BorrowingDetails";
    }


    //查询所有
    @RequestMapping(value = "/listBorrowingDetails",produces = "application/json;text/html;charset=UTF-8")
    @ResponseBody
    public ModelAndView  listBorrowingDetails(Borrower borrower, ModelAndView modelAndView, HttpServletRequest request){
//        System.out.println("---------");
//        System.out.println(borrower.getbName());
        PageBean pageBean=new PageBean();
        //分页初始化
        pageBean.setRequest(request);
        List<Borrower> borrowers = borrowerServiec.listBorrower(borrower, pageBean);
        for (Borrower borrower1 : borrowers) {
            System.out.println(borrower1);
        }
        modelAndView.addObject("borrowers",borrowers);
        modelAndView.addObject("pageBean",pageBean);
        modelAndView.setViewName("admin/adminBorrowing/BorrowingDetails");

        return modelAndView;
    }

    //查询单个
    @RequestMapping(value = "/selectBorrower",produces = "application/json;text/html;charset=UTF-8")
    @ResponseBody
    public List<Borrower> selectBorrower(Borrower borrower, ModelAndView modelAndView){
        Borrower borrower1 = borrowerServiec.selectByPrimaryKey(borrower);

        List<Borrower> borrowerList1=new ArrayList<Borrower>();
        borrowerList1.add(borrower1);
        return borrowerList1;
    }

    @RequestMapping(value = "/listBorrowingReviewStatus",produces = "application/json;text/html;charset=UTF-8")
    @ResponseBody
    public ModelAndView  listBorrowingReview(Borrower borrower, ModelAndView modelAndView, HttpServletRequest request){
        System.out.println(borrower.getbStatus() );
        System.out.println("---------");
//        System.out.println(borrower.getbName());

        System.out.println(borrower.getbStatus() );
        PageBean pageBean=new PageBean();
        //分页初始化
        pageBean.setRequest(request);
        List<Borrower> borrowers = borrowerServiec.listBorrowerStatus(borrower, pageBean);
        for (Borrower borrower1 : borrowers) {
            System.out.println(borrower1);
        }
        System.out.println(pageBean.getMaxPage());
        System.out.println(pageBean.getTotal());
        modelAndView.addObject("borrowers",borrowers);
        modelAndView.addObject("pageBean",pageBean);
        modelAndView.setViewName("admin/adminBorrowing/BorrowingReview");

        return modelAndView;
    }



    //修改
    @RequestMapping("/updateBorrowerReview")
//    @ResponseBody
    public String updateBorrowerReview(Borrower borrower){
//        System.out.println(borrower.getbId());
//        System.out.println("-----------------");
//        System.out.println(borrower.getbStatus());
        Borrower borrower1 = borrowerServiec.selectByPrimaryKey(borrower);
        borrower1.setbStatus(borrower.getbStatus());
        System.out.println("查询后:");
        System.out.println(borrower1.getbStatus());
        int i = borrowerServiec.updateByPrimaryKey(borrower1);
        System.out.println("修改成功");
        System.out.println(i);
        return "redirect:listBorrowingReviewStatus";
    }



}
