package com.gaoxi.controller.user;

import gaoxi.req.user.LoginReq;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;

public interface UserController {

    @GetMapping("/login")
    public Result login(LoginReq loginReq, HttpServletResponse httpRsp);
}
