package com.blog.mapping;

import com.blog.entity.ArticleWithBLOBs;

public interface ArticleMapper {
    int insert(ArticleWithBLOBs record);

    int insertSelective(ArticleWithBLOBs record);
}