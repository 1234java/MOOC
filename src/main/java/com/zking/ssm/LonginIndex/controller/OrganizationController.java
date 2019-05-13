package com.zking.ssm.LonginIndex.controller;

import com.zking.ssm.LonginIndex.service.IOrganizationService;
import com.zking.ssm.base.model.Organization;
import com.zking.ssm.base.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/Oreg")
public class OrganizationController {

    @Autowired
    private IOrganizationService organizationService;

    @RequestMapping("/login")
    public String toIdex() {
        return "LoginIndex/loginIndex";

    }

    @RequestMapping("/add")
    public String add(Organization organization) {
      /*List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError fieldError:fieldErrors) {
                System.out.println(fieldError.getDefaultMessage());
            }
            return "LoginIndex/loginIndex";
        }*/
        System.out.println(organization);
       organizationService.add(organization);
        return   "LoginIndex/ologing";

}

    @RequestMapping("/olg")
    public String Login(Organization organization, Model model) {

        Organization ologin=organizationService.login(organization);
        if (ologin != null) {
            return "index";
        }

        return "LoginIndex/ologing";
    }

}
