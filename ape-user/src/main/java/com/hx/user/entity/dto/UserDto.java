package com.hx.user.entity.dto;


import lombok.Data;

@Data
public class UserDto {
    private String name;
    private Integer age;
    private Long pageIndex;
    private Long pageSize;
}
