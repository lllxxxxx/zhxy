package com.atguigu.zhxy.service.Impl;

import com.atguigu.zhxy.mapper.StudentMapper;
import com.atguigu.zhxy.pojo.Student;
import com.atguigu.zhxy.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: lllxxx
 * @description: TODO
 * @date: 2022/4/24 10:45
 */
@Service
@Transactional
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
}
