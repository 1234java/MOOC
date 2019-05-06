package com.zking.ssm.base.controller;

import com.zking.ssm.base.model.Borrower;
import com.zking.ssm.hipoteca.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpSession;
import java.awt.print.Book;
import java.util.Locale;

/**
 * @author shkstart
 * @create 2019-04-23 17:49
 */
@Controller
public class IndexController {
    @Autowired
    private BorrowerService borrowerService;

    @RequestMapping("/zking/zking.shtml")
    public String toIdex() {
        return "index";
    }

    @ModelAttribute
    public void init(Model model) {
        Borrower borrower = new Borrower();
        model.addAttribute("borrow", borrower);
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


    @RequestMapping("/hipoteca/add")
    public String Add(Borrower borrower, Model model) {
        System.out.println("-------------123");
        boolean b = model.containsAttribute("borrow");
        System.out.println(b);
        borrowerService.insert(borrower);
        return "Borrowing/borrow";
    }


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
