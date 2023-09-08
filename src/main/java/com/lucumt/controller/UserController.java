package com.lucumt.controller;

import com.lucumt.model.UserModel;
import com.lucumt.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("queryAll")
    public List<UserModel> all() {
        List<UserModel> userList = userService.queryAllUsers();
        log.info("==========all user size: {}", userList.size());
        return userList;
    }

}
