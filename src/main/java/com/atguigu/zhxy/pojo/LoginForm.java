package com.atguigu.zhxy.pojo;

import lombok.Data;

/**
 * @author: lllxxx
 * @description: 登录表单
 * @date: 2022/4/24 10:28
 */
@Data
public class LoginForm {

    private String username;

    private String password;

    private String verifiCode;

    private Integer userType;

}
