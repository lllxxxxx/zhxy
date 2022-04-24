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
 * @date: 2022/4/23 22:39
 */
@TableName("tb_grade")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grade {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String name;

    private String manager;

    private String email;

    private String telephone;

    private String introducation;
}
