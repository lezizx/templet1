package com.lezizx.littlestep.controller;

import com.lezizx.littlestep.model.CommonResponse;
import com.lezizx.littlestep.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginJudge;

    @GetMapping("/rest/v1/login")
    public CommonResponse login(String userName, String userPwd){
        CommonResponse cr=new CommonResponse();
        if(loginJudge.loginJudge(userName,userPwd)){
           cr.setStatus("ok");
        }else{
            cr.setStatus("faild");
        }
        return  cr;
    }
}
