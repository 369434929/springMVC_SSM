package com.blog.mapping;

import com.blog.entity.Categorys;

public interface CategorysMapper {
    int deleteByPrimaryKey(String categorysId);

    int insert(Categorys record);

    int insertSelective(Categorys record);

    Categorys selectByPrimaryKey(String categorysId);

    int updateByPrimaryKeySelective(Categorys record);

    int updateByPrimaryKey(Categorys record);
}