package com.lucumt.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Slf4j
@Configuration
public class AppConfig {

    @EventListener(ApplicationReadyEvent.class)
    public void afterStartup() {
        log.info("============spring mybatis app start success=====================");
    }
}
