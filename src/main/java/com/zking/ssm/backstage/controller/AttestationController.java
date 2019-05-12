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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/attestaion")
public class AttestationController {

    @Autowired
    private IAttestationService service;


    @RequestMapping("/list")
    @ResponseBody
    public Map<String,Object> list(Attestation attestation, HttpServletRequest req, Model model,String  page){
        Map<String,Object> map=new HashMap<String,Object>();
        System.out.println(attestation);
        PageBean pageBean =new PageBean();
        pageBean.setRows(1);
        if(page ==null){
            pageBean.setPage(1);
        }else {
            pageBean.setPage(page);
        }
        pageBean.setRequest(req);
        List<Attestation> list = service.list(attestation, pageBean);
        for (Attestation attestation1 : list) {
            System.out.println("-----------"+attestation1);
        }
        map.put("list",list);
        map.put("pageBean",pageBean);
        return  map;
    }






    @RequestMapping("/lod")
    @ResponseBody
    public Attestation load(Attestation attestation, HttpServletRequest req, Model model){
        System.out.println(attestation);
        Attestation attestation1 = service.selectByPrimaryKey(attestation);
        return  attestation1;
    }



    @RequestMapping("/update")
    public String update(Attestation attestation, HttpServletRequest req, Model model){
        System.out.println(attestation);

        int updateatt = service.updateatt(attestation);


        return  "redirect:/admin/attestation";
    }

    @RequestMapping("/del")
    public String del(Attestation attestation, HttpServletRequest req, Model model){
        System.out.println(attestation);

        int updateatt = service.deleteByPrimaryKey(attestation);


        return  "redirect:/admin/attestation";
    }

}
