package com.javacto.po;

/**
 * @author CZQ
 * @date 2021-01-07 14:43
 * Description：
 **/
public class User {
    private int suUserId;
    private String suUserName;
    private String suEmail;
    private String suPassword;
    private String suSex;
    private String suBirthday;
    private String suMobile;
    private String suImg;
    private String suCreateTime;
    private String suCreateUser;
    private String suUpdateTime;
    private String suUpdateUser;
    private int suStatus;

    public User() {
    }

    public User(int suUserId, String suUserName, String suEmail, String suPassword, String suSex, String suBirthday, String suMobile, String suImg, String suCreateTime, String suCreateUser, String suUpdateTime, String suUpdateUser, int suStatus) {
        this.suUserId = suUserId;
        this.suUserName = suUserName;
        this.suEmail = suEmail;
        this.suPassword = suPassword;
        this.suSex = suSex;
        this.suBirthday = suBirthday;
        this.suMobile = suMobile;
        this.suImg = suImg;
        this.suCreateTime = suCreateTime;
        this.suCreateUser = suCreateUser;
        this.suUpdateTime = suUpdateTime;
        this.suUpdateUser = suUpdateUser;
        this.suStatus = suStatus;
    }

    public int getSuUserId() {
        return suUserId;
    }

    public void setSuUserId(int suUserId) {
        this.suUserId = suUserId;
    }

    public String getSuUserName() {
        return suUserName;
    }

    public void setSuUserName(String suUserName) {
        this.suUserName = suUserName;
    }

    public String getSuEmail() {
        return suEmail;
    }

    public void setSuEmail(String suEmail) {
        this.suEmail = suEmail;
    }

    public String getSuPassword() {
        return suPassword;
    }

    public void setSuPassword(String suPassword) {
        this.suPassword = suPassword;
    }

    public String getSuSex() {
        return suSex;
    }

    public void setSuSex(String suSex) {
        this.suSex = suSex;
    }

    public String getSuBirthday() {
        return suBirthday;
    }

    public void setSuBirthday(String suBirthday) {
        this.suBirthday = suBirthday;
    }

    public String getSuMobile() {
        return suMobile;
    }

    public void setSuMobile(String suMobile) {
        this.suMobile = suMobile;
    }

    public String getSuImg() {
        return suImg;
    }

    public void setSuImg(String suImg) {
        this.suImg = suImg;
    }

    public String getSuCreateTime() {
        return suCreateTime;
    }

    public void setSuCreateTime(String suCreateTime) {
        this.suCreateTime = suCreateTime;
    }

    public String getSuCreateUser() {
        return suCreateUser;
    }

    public void setSuCreateUser(String suCreateUser) {
        this.suCreateUser = suCreateUser;
    }

    public String getSuUpdateTime() {
        return suUpdateTime;
    }

    public void setSuUpdateTime(String suUpdateTime) {
        this.suUpdateTime = suUpdateTime;
    }

    public String getSuUpdateUser() {
        return suUpdateUser;
    }

    public void setSuUpdateUser(String suUpdateUser) {
        this.suUpdateUser = suUpdateUser;
    }

    public int getSuStatus() {
        return suStatus;
    }

    public void setSuStatus(int suStatus) {
        this.suStatus = suStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "suUserId=" + suUserId +
                ", suUserName='" + suUserName + '\'' +
                ", suEmail='" + suEmail + '\'' +
                ", suPassword='" + suPassword + '\'' +
                ", suSex='" + suSex + '\'' +
                ", suBirthday='" + suBirthday + '\'' +
                ", suMobile='" + suMobile + '\'' +
                ", suImg='" + suImg + '\'' +
                ", suCreateTime='" + suCreateTime + '\'' +
                ", suCreateUser='" + suCreateUser + '\'' +
                ", suUpdateTime='" + suUpdateTime + '\'' +
                ", suUpdateUser='" + suUpdateUser + '\'' +
                ", suStatus=" + suStatus +
                '}';
    }
}
