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
 * @date: 2022/4/23 22:45
 */
@TableName("tb_teacher")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Teacher {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String tno;

    private String name;

    private Character gender;

    private String password;

    private String email;

    private String telephone;

    private String address;

    private String portraitPath;

    private String clazzName;
}
