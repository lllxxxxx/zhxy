package com.atguigu.zhxy.service.Impl;

import com.atguigu.zhxy.mapper.GradeMapper;
import com.atguigu.zhxy.pojo.Grade;
import com.atguigu.zhxy.service.GradeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: lllxxx
 * @description: TODO
 * @date: 2022/4/24 10:43
 */
@Service
@Transactional
public class GradeServiceImpl extends ServiceImpl<GradeMapper, Grade> implements GradeService {
}
