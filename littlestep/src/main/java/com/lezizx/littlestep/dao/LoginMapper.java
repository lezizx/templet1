package com.lezizx.littlestep.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginMapper {
    int loginJudge(@Param("userName") String userName, @Param("userPwd") String userPwd);
}
