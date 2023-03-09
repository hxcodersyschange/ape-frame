package com.hx.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        System.out.println("insert filling ....");
        this.setFieldValByName("createBy","hx",metaObject);
        this.setFieldValByName("updateBy","hx",metaObject);
        this.setFieldValByName("createTime",new Date(System.currentTimeMillis()),metaObject);
        this.setFieldValByName("updateTime",new Date(System.currentTimeMillis()),metaObject);
        this.setFieldValByName("deleteFlag",0,metaObject);
        this.setFieldValByName("version",0,metaObject);

    }

    @Override
    public void updateFill(MetaObject metaObject) {

        System.out.println("update filling ...");
        strictUpdateFill(metaObject,"updateTime", Date::new, Date.class);
        strictUpdateFill(metaObject,"updateBy",()->"owner",String.class);
    }

}