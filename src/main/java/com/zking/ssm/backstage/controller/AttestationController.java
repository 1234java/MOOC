package com.zking.ssm.backstage.controller;

import com.zking.ssm.backstage.service.IAttestationService;
import com.zking.ssm.base.model.Attestation;
import com.zking.ssm.base.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/attestaion")
public class AttestationController {

    @Autowired
    private IAttestationService service;


    @RequestMapping("/list")
    @ResponseBody
    public List<Attestation> list(Attestation attestation, HttpServletRequest req, Model model){
        System.out.println(attestation);
        PageBean pageBean =new PageBean();
        pageBean.setRequest(req);
        List<Attestation> list = service.list(attestation, pageBean);
        for (Attestation attestation1 : list) {
            System.out.println("-----------"+attestation1);
        }
        return  list;
    }



    @RequestMapping("/lod")
    @ResponseBody
    public Attestation load(Attestation attestation, HttpServletRequest req, Model model){
        System.out.println(attestation);
        Attestation attestation1 = service.selectByPrimaryKey(attestation);
        return  attestation1;
    }



    @RequestMapping("/update")
    public Attestation update(Attestation attestation, HttpServletRequest req, Model model){
        System.out.println(attestation);

        int updateatt = service.updateatt(attestation);


        return  null;
    }


}
