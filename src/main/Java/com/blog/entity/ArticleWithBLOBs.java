package com.blog.entity;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("ArticleWithBLOBs")
public class ArticleWithBLOBs extends Article implements Serializable {
    private String content;

    private String publishTime;

    private String updataTime;

    private static final long serialVersionUID = 1L;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime == null ? null : publishTime.trim();
    }

    public String getUpdataTime() {
        return updataTime;
    }

    public void setUpdataTime(String updataTime) {
        this.updataTime = updataTime == null ? null : updataTime.trim();
    }
}