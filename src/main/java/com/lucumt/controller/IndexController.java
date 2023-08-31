package com.lucumt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class IndexController {

    @RequestMapping("hello")
    public String hello() {
        return "Hello at <b>" + LocalDateTime.now() + "</b>";
    }
}
