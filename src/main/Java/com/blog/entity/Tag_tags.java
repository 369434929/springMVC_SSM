package com.blog.entity;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
@Alias("Tag_tags")
public class Tag_tags implements Serializable {
    private String tagTagsId;

    private String artucleType;

    private String tags;

    private static final long serialVersionUID = 1L;

    public String getTagTagsId() {
        return tagTagsId;
    }

    public void setTagTagsId(String tagTagsId) {
        this.tagTagsId = tagTagsId == null ? null : tagTagsId.trim();
    }

    public String getArtucleType() {
        return artucleType;
    }

    public void setArtucleType(String artucleType) {
        this.artucleType = artucleType == null ? null : artucleType.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }
}