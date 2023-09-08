package com.lucumt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    // 用于在线程间传递mdc值
    static {
        System.setProperty("log4j2.isThreadContextMapInheritable", "true");
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
