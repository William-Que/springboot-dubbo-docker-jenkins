package com.gaoxi.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.gaoxi.user.dao.UserDAO;
import gaoxi.entity.user.UserEntity;
import gaoxi.exception.CommonBizException;
import gaoxi.exception.ExpCodeEnum;
import gaoxi.facade.user.UserService;
import gaoxi.req.user.LoginReq;
import gaoxi.req.user.UserQueryReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.List;

@Service(version = "1.0.0")
@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;




    @Override
    public UserEntity login(LoginReq loginReq) {

        UserQueryReq userQueryReq=buildUserQueryReq(loginReq);

        List<UserEntity> userEntityList = userDAO.findUsers(userQueryReq);

        if(CollectionUtils.isEmpty(userEntityList)){
            throw new CommonBizException(ExpCodeEnum.LOGIN_FINAL);
        }
        return userEntityList.get(0);
        
    }

    private UserQueryReq buildUserQueryReq(LoginReq loginReq) {
        UserQueryReq userQueryReq=new UserQueryReq();
        return userQueryReq;
    }
}
