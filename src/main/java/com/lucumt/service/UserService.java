package com.lucumt.service;

import com.lucumt.mapper.UserMapper;
import com.lucumt.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void addUser(UserModel userModel) {
        userMapper.addUser(userModel);
    }

    public UserModel getUser(Integer id) {
        return userMapper.findById(id);
    }

    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }
}
