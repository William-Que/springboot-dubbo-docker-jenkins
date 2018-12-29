package com.gaoxi.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import gaoxi.facade.user.UserService;
import javax.servlet.http.HttpServletResponse;


public class UserControllerImpl implements UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @Override
    public Result login(LoginReq loginReq,HttpServletResponse httpRsp){
        //登录鉴权
        UserEntity userEntity = userService.login(loginReq);
    }

}
