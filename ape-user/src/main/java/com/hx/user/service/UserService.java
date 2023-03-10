package com.hx.user.service;

import com.hx.entity.PageResult;
import com.hx.user.entity.dto.UserDto;
import com.hx.user.entity.po.UserPo;


public interface UserService {
    int addUser(UserDto userDto);

    int updateUser(Long id, UserDto userDto);

    int delete(Long id);

    PageResult<UserPo> getUserPage(UserDto userDto);
}


