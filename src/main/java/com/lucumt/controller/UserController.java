package com.lucumt.controller;

import com.lucumt.model.UserModel;
import com.lucumt.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("queryAll")
    public List<UserModel> all() {
        return userService.queryAllUsers();
    }

}
