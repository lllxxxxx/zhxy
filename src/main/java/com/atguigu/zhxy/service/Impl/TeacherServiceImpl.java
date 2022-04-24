package com.atguigu.zhxy.service.Impl;

import com.atguigu.zhxy.mapper.TeacherMapper;
import com.atguigu.zhxy.pojo.Teacher;
import com.atguigu.zhxy.service.TeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: lllxxx
 * @description: TODO
 * @date: 2022/4/24 10:46
 */
@Service
@Transactional
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {
}
