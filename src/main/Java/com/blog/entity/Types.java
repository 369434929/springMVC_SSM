package com.blog.entity;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
@Alias("Types")
public class Types implements Serializable {
    private String typeId;

    private Integer type;

    private String typeExplain;

    private static final long serialVersionUID = 1L;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeExplain() {
        return typeExplain;
    }

    public void setTypeExplain(String typeExplain) {
        this.typeExplain = typeExplain == null ? null : typeExplain.trim();
    }
}