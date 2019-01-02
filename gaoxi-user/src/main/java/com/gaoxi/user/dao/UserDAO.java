package com.gaoxi.user.dao;

import gaoxi.entity.user.UserEntity;
import gaoxi.req.user.UserQueryReq;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDAO {

    List<UserEntity> findUsers(@Param("userQueryReq")UserQueryReq userQueryReq);
}


