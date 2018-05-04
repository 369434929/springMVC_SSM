package com.blog.entity;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
@Alias("CommentWithBLOBs")
public class CommentWithBLOBs extends Comment implements Serializable {
    private String addTime;

    private String content;

    private static final long serialVersionUID = 1L;

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime == null ? null : addTime.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}