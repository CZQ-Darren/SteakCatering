package com.javacto.po;

/**
 * @author CZQ
 * @date 2021-01-07 14:58
 * Description：
 **/
public class News {
    private int snId;
    private String snTitle;
    private String snContent;
    private String snImg;
    private String snCreateTime;
    private String snCreateUser;
    private String snUpdateTime;
    private String snUpdateUser;
    private String reserve1;
    private String reserve2;
    private String reserve3;

    public News() {
    }

    public News(int snId, String snTitle, String snContent, String snImg, String snCreateTime, String snCreateUser, String snUpdateTime, String snUpdateUser, String reserve1, String reserve2, String reserve3) {
        this.snId = snId;
        this.snTitle = snTitle;
        this.snContent = snContent;
        this.snImg = snImg;
        this.snCreateTime = snCreateTime;
        this.snCreateUser = snCreateUser;
        this.snUpdateTime = snUpdateTime;
        this.snUpdateUser = snUpdateUser;
        this.reserve1 = reserve1;
        this.reserve2 = reserve2;
        this.reserve3 = reserve3;
    }

    public int getSnId() {
        return snId;
    }

    public void setSnId(int snId) {
        this.snId = snId;
    }

    public String getSnTitle() {
        return snTitle;
    }

    public void setSnTitle(String snTitle) {
        this.snTitle = snTitle;
    }

    public String getSnContent() {
        return snContent;
    }

    public void setSnContent(String snContent) {
        this.snContent = snContent;
    }

    public String getSnImg() {
        return snImg;
    }

    public void setSnImg(String snImg) {
        this.snImg = snImg;
    }

    public String getSnCreateTime() {
        return snCreateTime;
    }

    public void setSnCreateTime(String snCreateTime) {
        this.snCreateTime = snCreateTime;
    }

    public String getSnCreateUser() {
        return snCreateUser;
    }

    public void setSnCreateUser(String snCreateUser) {
        this.snCreateUser = snCreateUser;
    }

    public String getSnUpdateTime() {
        return snUpdateTime;
    }

    public void setSnUpdateTime(String snUpdateTime) {
        this.snUpdateTime = snUpdateTime;
    }

    public String getSnUpdateUser() {
        return snUpdateUser;
    }

    public void setSnUpdateUser(String snUpdateUser) {
        this.snUpdateUser = snUpdateUser;
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3;
    }

    @Override
    public String toString() {
        return "News{" +
                "snId=" + snId +
                ", snTitle='" + snTitle + '\'' +
                ", snContent='" + snContent + '\'' +
                ", snImg='" + snImg + '\'' +
                ", snCreateTime='" + snCreateTime + '\'' +
                ", snCreateUser='" + snCreateUser + '\'' +
                ", snUpdateTime='" + snUpdateTime + '\'' +
                ", snUpdateUser='" + snUpdateUser + '\'' +
                ", reserve1='" + reserve1 + '\'' +
                ", reserve2='" + reserve2 + '\'' +
                ", reserve3='" + reserve3 + '\'' +
                '}';
    }
}
