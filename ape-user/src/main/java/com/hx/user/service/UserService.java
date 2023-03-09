package com.hx.user.service;

import com.hx.user.entity.dto.UserDto;


public interface UserService {
    int addUser(UserDto userDto);
    int updateUser(Long id,UserDto userDto);
}
