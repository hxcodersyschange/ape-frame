package com.hx.user.service.impl;

import com.hx.user.entity.dto.UserDto;
import com.hx.user.mapper.UserMapper;
import com.hx.user.entity.po.UserPo;
import com.hx.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int addUser(UserDto userDto) {
        UserPo userPo = new UserPo();
        BeanUtils.copyProperties(userDto,userPo);
        int count = userMapper.insert(userPo);
        return count;
    }

    @Override
    public int updateUser(Long id,UserDto userDto) {
        UserPo userPo = new UserPo();
        userPo.setId(id);
       BeanUtils.copyProperties(userDto,userPo);
        return userMapper.updateById(userPo);
    }
}
