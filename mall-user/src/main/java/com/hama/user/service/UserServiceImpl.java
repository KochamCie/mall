package com.hama.user.service;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.hama.service.UserService;
import com.hama.user.dao.UserDAO;
import com.hama.user.model.LoginReq;
import com.hama.user.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author: hama
 * @date: created in  2018/3/5
 * @description:
 */

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public UserEntity login(LoginReq loginReq) {
        return new UserEntity("123", "456");
    }
}
