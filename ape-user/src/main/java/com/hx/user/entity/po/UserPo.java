package com.hx.user.entity.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@TableName("user")
@Data
public class UserPo {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    @TableField
    private String name;
    @TableField
    private Integer age;
    @TableField(value = "create_by",fill = FieldFill.INSERT)
    private String createBy;
    @TableField(value="create_time",fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(value = "update_by",fill =FieldFill.INSERT_UPDATE)
    private String updateBy;
    @TableField(value = "update_time",fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    @TableField(value = "delete_flag",fill = FieldFill.INSERT)
    private Integer deleteFlag;
    //乐观锁
    @TableField(value = "version",fill = FieldFill.INSERT)
    private Integer version;

}
