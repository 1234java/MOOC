package com.zking.ssm.Borrowing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mi
 * @create 2019-05-04 18:43
 */
@Controller
@RequestMapping("/adminBorrowing")
public class AdminBorrowingController {

    @RequestMapping("/toBorrowingDetails")
    public String toBorrowingDetails(){

        return "admin/adminBorrowing/BorrowingDetails";
    }



}
