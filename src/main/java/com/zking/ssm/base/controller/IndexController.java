package com.zking.ssm.base.controller;

import com.zking.ssm.Borrowing.serviec.IBorrowerTypeServiec;
import com.zking.ssm.base.model.Bdata;
import com.zking.ssm.base.model.Borrower;
import com.zking.ssm.base.model.BorrowerType;
import com.zking.ssm.base.model.Investment;
import com.zking.ssm.base.utils.PageBean;
import com.zking.ssm.hipoteca.service.BDataService;
import com.zking.ssm.hipoteca.service.Binvestment;
import com.zking.ssm.hipoteca.service.BorrowerService;
import javafx.scene.control.Alert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.awt.print.Book;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * @author shkstart
 * @create 2019-04-23 17:49
 */
@Controller
public class IndexController {
    @Autowired
    private BorrowerService borrowerService;

    @Autowired
    private BDataService bDataService;

    @Autowired
    private IBorrowerTypeServiec borrowerTypeServiec;

    @Autowired
    private Binvestment binvestment;

    private Bdata bdata;

    @RequestMapping("/zking/zking.shtml")
    public ModelAndView toIdex(ModelAndView modelAndView,HttpServletRequest request) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        List<Borrower> l = borrowerService.listb(pageBean);
        for (Borrower b : l) {
            System.out.println(b);
        }

        modelAndView.addObject("l",l);
        modelAndView.addObject("pageBean",pageBean);
        modelAndView.setViewName("index");

        return  modelAndView;
    }


    @ModelAttribute
    public void init(Model model) {
        Borrower bo = new Borrower();
        model.addAttribute("borrower", bo);
    }

    @RequestMapping("/zking/aa")
    public String aa() {
        return "aa";
    }


    @RequestMapping("/zking/jsp")
    public String toborrow() {
        return "Borrowing/borrow";
    }

    @RequestMapping("/zking/vehicle")
    public String tovehicle() {
        return "Borrowing/Vehicle";
    }

    @RequestMapping("/zking/credit")
    public String tocredit() {
        return "Borrowing/Credit";
    }


    //跳首页
    @RequestMapping("/hipoteca/add")
    public String Add(@Validated(value = {Borrower.ValidateGroups.AddEdit.class}) Borrower borrower, BindingResult
            bindingResult, Model model,int sid) {
//        System.out.println(123);
        if (bindingResult.hasErrors()) {
            if(sid==0){
                return "Borrowing/borrow";
            }else if (sid==1){
                return "Borrowing/Vehicle";
            }else if (sid==2){
                return "Borrowing/Credit";
            }

        }

//        boolean b = model.containsAttribute("bo");
//        System.out.println(b);
//        System.out.println(borrower.getbUsername());
//        borrower.setbMoneyDeadline(borrower.getbMoneyDeadline());
//        borrowerService.insert(borrower);
//        if(){

//        System.out.println(borrower.getbId() + "----123");

//        List<Integer> list = borrowerService.selectByPrimaryInt();
//        for (Integer i : list) {
//            System.out.println(i);
//            if(i>0){
//
//            }
//        }

//        borrower.setbRate(16);
        borrowerService.insert(borrower);
//            return "index";
//        }
        return "index";
    }

    //投资页面
    @RequestMapping("/zking/invest")
    public ModelAndView invest(Borrower borrower, ModelAndView modelAndView,HttpServletRequest request) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        List<Borrower> ls = borrowerService.listb(pageBean);
        List<Integer> list = borrowerService.selectByPrimaryInt();

        bDataService.delete();
        for (Integer l : list) {
            bdata = new Bdata();
            bdata.setbMoth(l);
            bdata.setbSum(borrowerService.selectBy());
            bDataService.insert(bdata);
        }

        List<Bdata> sa = bDataService.select();
//        for (Bdata b : sa) {
//            System.out.println(b);
//        }

////        List<Integer> list = borrowerService.selectByPrimaryInt();
////        for (Integer l : list) {
////            System.out.println(l);
////        }
////        System.out.println(i+"----");

        modelAndView.addObject("ls", ls);
        modelAndView.addObject("sa", sa);
        modelAndView.addObject("pageBean",pageBean);
        modelAndView.setViewName("invest");
        return modelAndView;
    }

    //立即投资
    @RequestMapping("/zking/detail")
    public ModelAndView todetail(ModelAndView modelAndView, String bid) {
//        System.out.println(bid);
        Borrower borrower = new Borrower();
        borrower.setbId(Integer.parseInt(bid));
        Borrower b = borrowerService.selectByPrimaryKey(borrower);
        BorrowerType type = borrowerTypeServiec.selectByPrimaryKey(b.getbBorrowerType());
        String s = type.getbTypeName();


        int i = borrowerService.selectBy();
        i = i / 10000;
//        System.out.println(i);
//        System.out.println(b);
        int a = borrowerService.selectBy();
        int b1 = binvestment.select();
        System.out.println(a+"---"+b1);
        int c = a-b1;


        modelAndView.addObject("b", b);
        modelAndView.addObject("i", i);
        modelAndView.addObject("s", s);
        modelAndView.addObject("c",c);
        modelAndView.setViewName("detail");

        return modelAndView;
    }

    @RequestMapping("/zking/index")
    public String toInvestment(Investment investment, String bid, HttpServletRequest request, String btype) {

//        String iMoney = request.getParameter("iMoney");
//        System.out.println(iMoney+"值");
//        System.out.println(investment.getiMoney()+"什么");
//        System.out.println(new Date().toString());
//        investment.setiDate();
//        System.out.println(investment.getiDate());
//        System.out.println(btype+"类型");
//        investment
        System.out.println(investment);
        investment.setbId(Integer.parseInt(bid));
        investment.setbTypeId(Integer.parseInt(btype));

        int a = borrowerService.selectBy();
        int b1 = binvestment.select();
        System.out.println(a+"---"+b1);
        int c = a-b1;


        if (investment.getiMoney() != null && !"".equals(investment.getiMoney())&&investment.getiMoney()<c) {

                       binvestment.insert(investment);
            return "index";
        } else {
            return "forward:/zking/detail?bid";
        }

    }

    @RequestMapping("/zking/index1")
    public String toType(Investment investment, HttpServletRequest request) {
        System.out.println("进了");
//        System.out.println(+"mmm");
//        System.out.println(+"id");
        System.out.println(investment.getiMoney()+"金额");


//        System.out.println("进了index1");
//        String iMoney = request.getParameter("iMoney");
//        System.out.println(iMoney+"111");
//        System.out.println(investment.getiMoney()+"金额");
        investment.setbId(investment.getbId());
        investment.setbTypeId(investment.getbTypeId());
        System.out.println(investment);
        if (investment.getiMoney() != null && !"".equals(investment.getiMoney())) {
            binvestment.insert(investment);
            System.out.println(123);
            return "index";
        } else {
            return "forward:/zking/zking.shtml";
        }

    }
//@ResponseBody
    //传入前台 集合，对象   map list
//{'sds':sd,'sdv':sd}
//json 对象







    @RequestMapping("/i18n")
    public String I18n(String locale, HttpSession session) {
        if (locale.equals("zh")) {
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.CHINA);
        } else if (locale.equals("en")) {
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.US);
        } else {
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.FRANCE);
        }
        return "index";

    }

}
