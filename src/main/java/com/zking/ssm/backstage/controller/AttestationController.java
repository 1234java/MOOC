package com.zking.ssm.backstage.controller;

import com.zking.ssm.backstage.service.IAttestationService;
import com.zking.ssm.base.model.Attestation;
import com.zking.ssm.base.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
    public String update(Attestation attestation, HttpServletRequest req, Model model) {
        System.out.println("============="+attestation);
        attestation.setaMessage(attestation.getaMessage().trim());
        int updateatt = service.updateatt(attestation);


        return  "redirect:/admin/attestation";
    }

    @RequestMapping("/del")
    public String del(Attestation attestation, HttpServletRequest req, Model model){
        System.out.println(attestation);

        int updateatt = service.deleteByPrimaryKey(attestation);


        return  "redirect:/admin/attestation";
    }




    @RequestMapping("/upload")
    public String Upload(MultipartFile reverse,Attestation attestation, HttpSession session,MultipartFile front,Model model) throws IOException, Exception {
        System.out.println(front.getOriginalFilename());
        System.out.println(reverse.getOriginalFilename());
        System.out.println(reverse.getOriginalFilename().substring(reverse.getOriginalFilename().indexOf(".")));
        String s = reverse.getOriginalFilename().substring(reverse.getOriginalFilename().indexOf("."));
        String Reverse="/upload/"+reverse.getOriginalFilename();
        String Front="/upload/"+front.getOriginalFilename();
        attestation.setaReverse(Reverse);
        attestation.setaFront(Front);
        attestation.setaState("0");
        System.out.println(attestation);

        service.insert(attestation);
        // MultipartFile img = fileVo.getImg();
        //System.out.println(img.getContentType());
       /* System.out.println(img.getName());
        System.out.println(img.getOriginalFilename());*/
        //路径存放数据库
       /* File file =new File();
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        String url="E:\\fe\\"+uuid+s;
        System.out.println(url);
        file.setFileId(uuid);
        file.setContentType(img.getContentType());
        file.setRealName(img.getOriginalFilename());
        file.setUrl(url);

        fileService.insert(file);*/

       /* String uh ="文件上传成功";
        session.setAttribute("uh",uh);*/
        //把文件存放到服务器中
        String url="E:\\upload\\"+reverse.getOriginalFilename();
        java.io.File  tagerFile= new java.io.File(url);
        reverse.transferTo(tagerFile);
        String ur="E:\\upload\\"+front.getOriginalFilename();
        java.io.File  font= new java.io.File(ur);
        reverse.transferTo(font);

        return  "redirect:/sys/file/toupload";
    }
}
