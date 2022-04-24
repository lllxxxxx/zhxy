package com.atguigu.zhxy.service.Impl;

import com.atguigu.zhxy.mapper.AdminMapper;
import com.atguigu.zhxy.pojo.Admin;
import com.atguigu.zhxy.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: lllxxx
 * @description: TODO
 * @date: 2022/4/24 10:37
 */
@Service
@Transactional
public class AdminServiceImpl extends ServiceImpl<AdminMapper,Admin> implements AdminService {
}
