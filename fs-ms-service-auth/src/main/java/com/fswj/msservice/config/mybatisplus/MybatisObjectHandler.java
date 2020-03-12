package com.fswj.msservice.config.mybatisplus;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.util.Date;

/**
 * 填充创建时间与更新时间字段
 */
public class MybatisObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        Date now = new Date();
        setFieldValByName("createDate",now,metaObject);
        setFieldValByName("updateDate",now,metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        Date now = new Date();
        setFieldValByName("updateDate",now,metaObject);
    }
}
