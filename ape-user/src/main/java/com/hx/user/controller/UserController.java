package com.hx.user.controller;

import com.hx.user.entity.dto.UserDto;
import com.hx.user.entity.req.UserReq;
import com.hx.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public Integer addUser(@RequestBody UserReq userReq){
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userReq,userDto);
        int i = userService.addUser(userDto);
        return i;
    }
//
//    @PostMapping("/update")
//    public Integer UpdateUser(@RequestBody UserReq userReq){
//        UserDto userDto = new UserDto();
//        BeanUtils.copyProperties(userReq,userDto);
//        int i = userService.updateUser(userDto);
//        return i;
//    }
}
