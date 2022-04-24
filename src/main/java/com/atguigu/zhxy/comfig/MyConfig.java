package com.atguigu.zhxy.comfig;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: lllxxx
 * @description: 分页的配置类
 * @date: 2022/4/23 20:44
 */
@Configuration
@MapperScan("com.atguigu.zhxy.mapper")
public class MyConfig {

    /**
     * @param : null
     * @return PaginationInterceptor
     * @author lllxxx
     * @description mybatis-plus的分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor=new PaginationInterceptor();
//        paginationInterceptor.setLimit()最大单页限制数量
        return paginationInterceptor;
    }

}
