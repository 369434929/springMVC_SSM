package com.blog.entity;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
@Alias("User")
public class User implements Serializable {
    private String userUuid;

    private String username;

    private String password;

    private String avatar;

    private String useremail;

    private String singnature;

    private String userip;

    private Integer reportnumber;

    private static final long serialVersionUID = 1L;

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid == null ? null : userUuid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public String getSingnature() {
        return singnature;
    }

    public void setSingnature(String singnature) {
        this.singnature = singnature == null ? null : singnature.trim();
    }

    public String getUserip() {
        return userip;
    }

    public void setUserip(String userip) {
        this.userip = userip == null ? null : userip.trim();
    }

    public Integer getReportnumber() {
        return reportnumber;
    }

    public void setReportnumber(Integer reportnumber) {
        this.reportnumber = reportnumber;
    }
}