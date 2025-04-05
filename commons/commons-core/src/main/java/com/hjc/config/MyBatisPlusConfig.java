package com.hjc.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis Plus 配置
 */
@Configuration
@MapperScan("com.hjc.mapper")
public class MyBatisPlusConfig {
}