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
 * @date: 2022/4/23 22:42
 */
@TableName("tb_student")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String sno;

    private String name;

    private Character gender;

    private String password;

    private String email;

    private String telephone;

    private String address;

    private String introducation;

    private String portraitPath;

    private String clazzName;

}
