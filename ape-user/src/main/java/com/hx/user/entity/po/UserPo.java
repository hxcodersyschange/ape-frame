package com.hx.user.entity.po;

import com.baomidou.mybatisplus.annotation.*;
import com.hx.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

@TableName("user")
@Data
public class UserPo extends BaseEntity {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    @TableField(value = "name")
    private String name;
    @TableField(value = "age")
    private Integer age;
}
