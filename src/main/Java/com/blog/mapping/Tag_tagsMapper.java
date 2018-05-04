package com.blog.mapping;

import com.blog.entity.Tag_tags;

public interface Tag_tagsMapper {
    int deleteByPrimaryKey(String tagTagsId);

    int insert(Tag_tags record);

    int insertSelective(Tag_tags record);

    Tag_tags selectByPrimaryKey(String tagTagsId);

    int updateByPrimaryKeySelective(Tag_tags record);

    int updateByPrimaryKey(Tag_tags record);
}