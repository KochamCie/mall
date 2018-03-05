package com.hama.user.model;

import lombok.Data;

/**
 * @author: hama
 * @date: created in  2018/3/5
 * @description:
 */

@Data
public class LoginReq {

    private String loginName;

    private String password;
}
