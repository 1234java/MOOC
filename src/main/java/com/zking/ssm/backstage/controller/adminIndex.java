package com.zking.ssm.backstage.controller;


import com.zking.ssm.backstage.service.IOrganizationServiec;
import com.zking.ssm.backstage.service.InstitutionalTypeService;
import com.zking.ssm.base.model.InstitutionalType;
import com.zking.ssm.base.model.Organization;
import com.zking.ssm.base.model.ResponseResult;
import com.zking.ssm.base.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class adminIndex {

    @Autowired
    private IOrganizationServiec organizationSerice;

    @Autowired
    private InstitutionalTypeService institutionalTypeSerice;

    @ModelAttribute
    public void init(Model model) {
        Organization organization = new Organization();
        model.addAttribute("organization", organization);
    }


    @RequestMapping("/toadmin")
    public String toadminIndex() {

        return "admin/index";
    }




    @RequestMapping("/userindex")
    public String userlist() {

        return "admin/user/index";
    }


    //个人
    @RequestMapping("/userlist")
    public String userList() {

        return "admin/user/user";
    }


    //企业方法开始
    @RequestMapping("/userenterpise")
    public String useRenterpise() {

        return "admin/user/enterprise";
    }

    //查询所有
    @RequestMapping("/listorganization")
    public ModelAndView listorganization(Organization organization, ModelAndView modelAndView, HttpServletRequest request) {
//        System.out.println(organization.getoOrganization());
//        System.out.println("-------");
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        List<Organization> list = organizationSerice.listOrganization(organization, pageBean);
        for (Organization or : list) {
            for (InstitutionalType institutionalType : or.getInstitutionalTypeList()) {
                System.out.println(institutionalType);
            }

        }
        System.out.println(pageBean.getTotal());
        modelAndView.addObject("organization",list);
        modelAndView.addObject("pageBean",pageBean);
        modelAndView.setViewName("admin/user/enterprise");

        return modelAndView;
    }


    //增加
    @RequestMapping("/addenterpise")
    public String addenterpise(Organization organization,String s_province,String s_city,String password,Model model){
//        System.out.println(s_province+"------");
//        System.out.println(s_city+"------");
        if(s_province.equals(s_city)){
          organization.setoAddress(s_province);
        }
        else if(s_province !=s_city & !s_province.equals(s_city)){
            String address=s_province+s_city;
            organization.setoAddress(address);
        }
        int insert = organizationSerice.insert(organization);
        return "redirect:listorganization";
    }

    //删除
    @RequestMapping(value = "delenterpise",produces ="application/json;text/html;charset=UTF-8" )
    @ResponseBody
    public ResponseResult<Map<String,Object>> delenterpise(Organization organization, BindingResult bindingResult, Model model){
        ResponseResult<Map<String,Object>> responseResult=new ResponseResult<Map<String,Object>>(1,"删除成功",null);

        if(bindingResult.hasErrors()){
            Map<String,Object> errors=new HashMap<String,Object>();
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError f : fieldErrors) {
                System.out.println(f.getField());
                System.out.println(f.getDefaultMessage());

                String field = f.getField();
                String message = f.getDefaultMessage();
                errors.put(field,message);

            }
            responseResult.setStatus(0);
            responseResult.setMessage("删除失败");
            responseResult.setData(errors);
            return responseResult;
        }
        boolean b = model.containsAttribute("organization");
        organizationSerice.deleteByPrimaryKey(organization.getoOid());

        return responseResult;
    }

    //查询单个
    @RequestMapping(value = "/selectOrganization",produces ="application/json;text/html;charset=UTF-8")
    @ResponseBody
    public List<Organization> selectOrganization(Organization organization){
        List<Organization> organizationList=new ArrayList<Organization>();
        Organization or1 = organizationSerice.selectByPrimaryKey(organization);
        organizationList.add(or1);
        return organizationList;
    }



    @RequestMapping(value = "/load",produces ="application/json;text/html;charset=UTF-8")
    @ResponseBody
    public Organization load(Organization organization,Model model){
        System.out.println(organization);
        Organization or1 = organizationSerice.selectByPrimaryKey(organization);
        InstitutionalType institutionalType=new InstitutionalType();
        List<InstitutionalType> institutionalTypes = this.listType(institutionalType);
        or1.setInstitutionalTypeList(institutionalTypes);
        System.out.println("1:"+or1);
        return or1;
    }
    @RequestMapping(value = "/update",produces ="application/json;text/html;charset=UTF-8")
    @ResponseBody
    public ResponseResult<Map<String,Object>> update(Organization organization,BindingResult bindingResult, Model model){
        ResponseResult<Map<String,Object>> responseResult=new ResponseResult<Map<String,Object>>(1,"修改成功",null);
        System.out.println(organization.getoOrganization());
        System.out.println(organization.getoAddress());
        if(bindingResult.hasErrors()){
            Map<String,Object> errors=new HashMap<String,Object>();
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError f : fieldErrors) {
                System.out.println(f.getField());
                System.out.println(f.getDefaultMessage());

                String field = f.getField();
                String message = f.getDefaultMessage();
                errors.put(field,message);

            }
            responseResult.setStatus(0);
            responseResult.setMessage("修改失败");
            responseResult.setData(errors);
            return responseResult;
        }
        boolean b = model.containsAttribute("organization");
        organizationSerice.updateByPrimaryKeySelective(organization);

        return responseResult;
    }



    //获取类别
    @RequestMapping(value = "/listType",produces = "application/json;text/html;charset=UTF-8")
    @ResponseBody
    public List<InstitutionalType> listType(InstitutionalType institutionalType){

        List<InstitutionalType> institutionalTypes = institutionalTypeSerice.listInstitutionalType(institutionalType);
        for (InstitutionalType type : institutionalTypes) {
            System.out.println(type);
        }

        return institutionalTypes;
    }


    //企业方法结束


    //认证
    @RequestMapping("/attestation")
    public String attestation() {

        return "admin/attestation/attestationList";
    }


    //借贷
    @RequestMapping("/debit")
    public String debit() {

        return "admin/debit/debit";
    }


    //评论
    @RequestMapping("/comment")
    public String comment() {

        return "admin/comment/comment";
    }


    //信用管理
    @RequestMapping("/cradit")
    public String craditlist() {

        return "admin/credit/creditList";
    }


    @RequestMapping("/cradit/report")
    public String craditreport() {

        return "admin/credit/report";
    }


    @RequestMapping("/tosyso")
    public String tosys() {

        return "admin/system/index";
    }


    //管理列表
    @RequestMapping("/toadminlist")
    public String toadminlist() {

        return "admin/system/adminlist";
    }


    //借款类型列表
    @RequestMapping("/toborrowtype")
    public String toBorrowtype() {

        return "admin/system/borrow_type";
    }

    //资金类型列表
    @RequestMapping("/tocapitaltype")
    public String toCapitaltype() {

        return "admin/system/capital_type";
    }

    //投资类型列表
    @RequestMapping("/toinvesttype")
    public String toinvesttype() {

        return "admin/system/invest_type";
    }

    // 机构类型列表
    @RequestMapping("/toorganizationtype")
    public String toOrganizationtype() {

        return "admin/system/organization_type";
    }


}
