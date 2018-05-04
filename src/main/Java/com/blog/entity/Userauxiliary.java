package com.blog.entity;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
@Alias("Userauxiliary")
public class Userauxiliary implements Serializable {
    private String auxiliaryId;

    private String userUuid;

    private Integer sex;

    private Integer visitCount;

    private Integer userRank;

    private String qq;

    private String weixin;

    private String mobilePhone;

    private Integer isValidated;

    private Integer creditLine;

    private String passwdQuestion;

    private String passwdAnswer;

    private static final long serialVersionUID = 1L;

    public String getAuxiliaryId() {
        return auxiliaryId;
    }

    public void setAuxiliaryId(String auxiliaryId) {
        this.auxiliaryId = auxiliaryId == null ? null : auxiliaryId.trim();
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid == null ? null : userUuid.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Integer visitCount) {
        this.visitCount = visitCount;
    }

    public Integer getUserRank() {
        return userRank;
    }

    public void setUserRank(Integer userRank) {
        this.userRank = userRank;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public Integer getIsValidated() {
        return isValidated;
    }

    public void setIsValidated(Integer isValidated) {
        this.isValidated = isValidated;
    }

    public Integer getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(Integer creditLine) {
        this.creditLine = creditLine;
    }

    public String getPasswdQuestion() {
        return passwdQuestion;
    }

    public void setPasswdQuestion(String passwdQuestion) {
        this.passwdQuestion = passwdQuestion == null ? null : passwdQuestion.trim();
    }

    public String getPasswdAnswer() {
        return passwdAnswer;
    }

    public void setPasswdAnswer(String passwdAnswer) {
        this.passwdAnswer = passwdAnswer == null ? null : passwdAnswer.trim();
    }
}