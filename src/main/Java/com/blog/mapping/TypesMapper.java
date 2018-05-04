package com.blog.mapping;

import com.blog.entity.Types;

public interface TypesMapper {
    int deleteByPrimaryKey(String typeId);

    int insert(Types record);

    int insertSelective(Types record);

    Types selectByPrimaryKey(String typeId);

    int updateByPrimaryKeySelective(Types record);

    int updateByPrimaryKey(Types record);
}