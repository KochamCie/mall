package com.hama.service;

import com.hama.user.model.LoginReq;
import com.hama.user.model.UserEntity;

/**
 * @author: hama
 * @date: created in  2018/3/5
 * @description:
 */
public interface UserService {

    public UserEntity login(LoginReq loginReq);
}
