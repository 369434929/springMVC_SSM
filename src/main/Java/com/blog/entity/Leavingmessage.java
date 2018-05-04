package com.blog.entity;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
@Alias("Leavingmessage")
public class Leavingmessage implements Serializable {
    private String leavingId;

    private String categoryType;

    private String username;

    private String userUuid;

    private String avatar;

    private Integer likes;

    private String leavingEmail;

    private static final long serialVersionUID = 1L;

    public String getLeavingId() {
        return leavingId;
    }

    public void setLeavingId(String leavingId) {
        this.leavingId = leavingId == null ? null : leavingId.trim();
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType == null ? null : categoryType.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid == null ? null : userUuid.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getLeavingEmail() {
        return leavingEmail;
    }

    public void setLeavingEmail(String leavingEmail) {
        this.leavingEmail = leavingEmail == null ? null : leavingEmail.trim();
    }
}