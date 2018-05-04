package com.blog.entity;

import java.io.Serializable;

public class Categorys implements Serializable {
    private String categorysId;

    private String categorysExpain;

    private static final long serialVersionUID = 1L;

    public String getCategorysId() {
        return categorysId;
    }

    public void setCategorysId(String categorysId) {
        this.categorysId = categorysId == null ? null : categorysId.trim();
    }

    public String getCategorysExpain() {
        return categorysExpain;
    }

    public void setCategorysExpain(String categorysExpain) {
        this.categorysExpain = categorysExpain == null ? null : categorysExpain.trim();
    }
}