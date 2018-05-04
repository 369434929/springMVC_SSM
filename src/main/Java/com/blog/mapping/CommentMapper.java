package com.blog.mapping;

import com.blog.entity.Comment;
import com.blog.entity.CommentWithBLOBs;

public interface CommentMapper {
    int deleteByPrimaryKey(String commentId);

    int insert(CommentWithBLOBs record);

    int insertSelective(CommentWithBLOBs record);

    CommentWithBLOBs selectByPrimaryKey(String commentId);

    int updateByPrimaryKeySelective(CommentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CommentWithBLOBs record);

    int updateByPrimaryKey(Comment record);
}