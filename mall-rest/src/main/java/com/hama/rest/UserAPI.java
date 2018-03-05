package com.hama.rest;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.Result;
import com.hama.service.UserService;
import com.hama.user.model.LoginReq;
import com.hama.user.model.UserEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author: hama
 * @date: created in  2018/3/5
 * @description:
 */
@RestController
public class UserAPI {


    @Reference(version = "1.0.0")
    private UserService userService;


    public Result login(LoginReq loginReq, HttpServletResponse httpRsp) {
        // 登录鉴权
        UserEntity userEntity = userService.login(loginReq);

        return null;
    }

}
