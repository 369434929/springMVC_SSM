package com.blog.entity;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
@Alias("Imgs")
public class Imgs implements Serializable {
    private String imgId;

    private String imgType;

    private String imgUrl;

    private String imgSignaturs;

    private String imgAddtime;

    private static final long serialVersionUID = 1L;

    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId == null ? null : imgId.trim();
    }

    public String getImgType() {
        return imgType;
    }

    public void setImgType(String imgType) {
        this.imgType = imgType == null ? null : imgType.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getImgSignaturs() {
        return imgSignaturs;
    }

    public void setImgSignaturs(String imgSignaturs) {
        this.imgSignaturs = imgSignaturs == null ? null : imgSignaturs.trim();
    }

    public String getImgAddtime() {
        return imgAddtime;
    }

    public void setImgAddtime(String imgAddtime) {
        this.imgAddtime = imgAddtime == null ? null : imgAddtime.trim();
    }
}