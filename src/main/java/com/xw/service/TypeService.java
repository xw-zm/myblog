package com.xw.service;

import com.xw.entity.Type;

import java.util.List;


/**
 *  文章分类业务层接口
 */
public interface TypeService {

    int saveType(Type type);

    Type getType(Long id);

    List<Type>getAllType();

    List<Type>getAllTypeAndBlog();

    Type getTypeByName(String name);

    int updateType(Type type);

    void deleteType(Long id);




}