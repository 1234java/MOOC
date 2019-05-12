package com.zking.ssm.Login.service.impl;

import com.zking.ssm.Login.service.IRootService;
import com.zking.ssm.base.mapper.RootMapper;
import com.zking.ssm.base.model.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("rootService")
@Transactional
public class RootServiceImpl implements IRootService {
    @Autowired
    private RootMapper rootMapper;

    @Override
    public String doLogin(Root root) {
       String message = null;
        Root r = rootMapper.selectByRName(root.getrName());


//        boolean b = PasswordHelper.checkCredentials(root.getrPassword(),  r.getSalt(), r.getCredentials());
//        System.out.println(b);
//        if(!b){
//            message = "账号或密码错误";
//
//        }




        return message;
    }

  @Override
    public int updatePassword(Root root) {
//        //md5+盐
//        String salt = PasswordHelper.createSalt();
//        String credentials = PasswordHelper.createCredentials(root.getrPassword(),salt);
//
          Root r = new Root();
//        r.setrName(root.getrName());
//        r.setrPassword(credentials);
//        r.setSalt(salt);
//
        return rootMapper.updateByPrimaryKeySelective(r);
    }

    @Override
    public int doResetPassword(Root root) {
//        //md5+盐
//        String salt = PasswordHelper.createSalt();
//        //DEFAULT_PASSWORD 默认password
//        String credentials = PasswordHelper.createCredentials(Root.DEFAULT_PASSWORD, salt);
//
       Root r = new Root();
//        r.setrName(root.getrName());
//        r.setrPassword(credentials);
//        r.setSalt(salt);
//
      return rootMapper.updateByPrimaryKeySelective(r);
  }

    @Override
    public Root loadByRName(Root root) {
        return rootMapper.selectByRName(root.getrName());
    }

    @Override
    public int insert(Root record) {

        return rootMapper.insert(record);
    }
}
