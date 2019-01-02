package com.gaoxi.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import gaoxi.facade.user.UserService;
import gaoxi.req.user.LoginReq;

import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;


public class UserControllerImpl implements UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @Override
    public Result login(LoginReq loginReq, HttpServletResponse httpRsp) {
        return null;
    }
}
