package com.blog.entity;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
@Alias("LeavingmessageWithBLOBs")
public class LeavingmessageWithBLOBs extends Leavingmessage implements Serializable {
    private String addTime;

    private String leavingContent;

    private static final long serialVersionUID = 1L;

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime == null ? null : addTime.trim();
    }

    public String getLeavingContent() {
        return leavingContent;
    }

    public void setLeavingContent(String leavingContent) {
        this.leavingContent = leavingContent == null ? null : leavingContent.trim();
    }
}