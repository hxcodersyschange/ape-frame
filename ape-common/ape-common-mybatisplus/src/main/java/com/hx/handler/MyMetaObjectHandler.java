package com.hx.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        System.out.println("filling ....");
        this.strictInsertFill(metaObject, "createBy", ()->"hx",String.class);
        this.strictInsertFill(metaObject, "createTime",()->new Date(System.currentTimeMillis()) ,Date.class);
        this.strictInsertFill(metaObject, "updateBy", ()->"hx",String.class);
        this.strictInsertFill(metaObject, "updateTime",()->new Date(System.currentTimeMillis()) ,Date.class);
        this.strictInsertFill(metaObject, "deleteFlag", ()->0,Integer.class);
        this.strictInsertFill(metaObject, "version", ()->0,Integer.class);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject,"updateBy",()->"hx",String.class);
        this.strictUpdateFill(metaObject, "updateTime", ()->new Date(System.currentTimeMillis()),Date.class);
    }
}
