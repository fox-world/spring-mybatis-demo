package com.lucumt.mapper;

import com.lucumt.model.UserModel;

public interface UserMapper {

    void addUser(UserModel userModel);

    UserModel findById(Integer id);

    void deleteUser(Integer id);
}
