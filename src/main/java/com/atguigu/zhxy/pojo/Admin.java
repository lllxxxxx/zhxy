package com.atguigu.zhxy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: lllxxx
 * @description: TODO
 * @date: 2022/4/23 21:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_admin")
public class Admin {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String mame;

    private Character gender;

    private String password;

    private String email;

    private String telephone;

    private String address;

    private String portraitPath;

}
