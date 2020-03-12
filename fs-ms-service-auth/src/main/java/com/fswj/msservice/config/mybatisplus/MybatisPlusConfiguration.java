package com.fswj.msservice.config.mybatisplus;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 分页插件初始化
 */
@Configuration
public class MybatisPlusConfiguration {

    @Bean
    MetaObjectHandler metaObjectHandler(){
        return new MybatisObjectHandler();
    }

    @Bean
    PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
