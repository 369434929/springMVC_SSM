package com.blog.mapping;

import com.blog.entity.Imgs;

public interface ImgsMapper {
    int deleteByPrimaryKey(String imgId);

    int insert(Imgs record);

    int insertSelective(Imgs record);

    Imgs selectByPrimaryKey(String imgId);

    int updateByPrimaryKeySelective(Imgs record);

    int updateByPrimaryKeyWithBLOBs(Imgs record);

    int updateByPrimaryKey(Imgs record);
}