package com.hx.user.controller;

import com.hx.user.entity.dto.UserDto;
import com.hx.user.entity.req.UserReq;
import com.hx.user.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;


@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/add")
    public Integer addUser(@RequestBody UserReq userReq){
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userReq,userDto);
        return   userService.addUser(userDto);
    }

    @PostMapping("/update/{id}")
    public Integer UpdateUser(@PathVariable("id") Long id, @RequestBody UserReq userReq){
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userReq,userDto);
        return userService.updateUser(id,userDto);
    }
}
