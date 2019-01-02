package gaoxi.facade.user;

import gaoxi.entity.user.UserEntity;
import gaoxi.req.user.LoginReq;

public interface UserService {
    public UserEntity login(LoginReq loginReq);
}
