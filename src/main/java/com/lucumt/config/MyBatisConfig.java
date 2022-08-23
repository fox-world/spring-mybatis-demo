package com.lucumt.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.lucumt.mapper")
public class MyBatisConfig {
}
