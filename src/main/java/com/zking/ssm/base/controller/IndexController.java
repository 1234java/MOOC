package com.zking.ssm.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpSession;
import java.util.Locale;

/**
 * @author shkstart
 * @create 2019-04-23 17:49
 */
@Controller
public class IndexController {

    @RequestMapping("/zking/zking.shtml")
    public  String toIdex(){

        return "index";
    }

    @RequestMapping("/zking/jsp")
    public  String toborrow(){

        return "Borrowing/borrow";
    }

    @RequestMapping("/i18n")
    public String I18n(String locale, HttpSession session){
        if(locale.equals("zh")){
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,Locale.CHINA);
        }
        else if(locale.equals("en")){
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,Locale.US);
        }
        else{
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,Locale.FRANCE);
        }


        return "index";

    }

}
