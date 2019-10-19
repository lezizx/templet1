package com.lezizx.littlestep.service;

import com.lezizx.littlestep.dao.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginMapper loginMapper;

    public boolean loginJudge(String userName, String userPwd) {
        return loginMapper.loginJudge(userName,userPwd)>0;
    }
}
