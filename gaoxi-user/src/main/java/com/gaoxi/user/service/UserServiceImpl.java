package com.gaoxi.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import gaoxi.facade.user.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserEntity login(LoginReq loginReq) {
        return null;
    }

}
