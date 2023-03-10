package com.hx.user.controller;

import com.hx.bean.Result;
import com.hx.entity.PageResult;
import com.hx.user.entity.dto.UserDto;
import com.hx.user.entity.po.UserPo;
import com.hx.user.entity.req.UserListReq;
import com.hx.user.entity.req.UserReq;
import com.hx.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.attribute.UserPrincipalLookupService;


@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/add")
    public Result addUser(@RequestBody UserReq userReq){
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userReq,userDto);
        int i = 1/0;
        return Result.ok(userService.addUser(userDto));
    }

    @PostMapping("/update/{id}")
    public Result UpdateUser(@PathVariable("id") Long id, @RequestBody UserReq userReq){
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userReq,userDto);
        return Result.ok(userService.updateUser(id,userDto));
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Long id){
        return Result.ok(userService.delete(id));
    }

   @GetMapping("/getPage")
    public Result getPage(@RequestBody UserListReq userReq){
        UserDto userDto = new UserDto();
       System.out.println(userReq.toString());
        BeanUtils.copyProperties(userReq,userDto);
       System.out.println(userDto.toString());
        return Result.ok(userService.getUserPage(userDto));

   }
}
