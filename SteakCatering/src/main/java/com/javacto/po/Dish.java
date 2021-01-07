package com.javacto.po;

/**
 * @author CZQ
 * @date 2021-01-07 14:47
 * Description：
 **/
public class Dish {
    private int sdDishId;
    private String sdDishName;
    private double sdDishPrice;
    private String sdDishContent;
    private int sdcId;
    private String sdImg;
    private String sdCreateTime;
    private String sdCreateUser;
    private String sdUpdateTime;
    private String sdUpdateUser;
    private String reserve1;
    private String reserve2;
    private String reserve3;

    public Dish() {
    }

    public Dish(int sdDishId, String sdDishName, double sdDishPrice, String sdDishContent, int sdcId, String sdImg, String sdCreateTime, String sdCreateUser, String sdUpdateTime, String sdUpdateUser, String reserve1, String reserve2, String reserve3) {
        this.sdDishId = sdDishId;
        this.sdDishName = sdDishName;
        this.sdDishPrice = sdDishPrice;
        this.sdDishContent = sdDishContent;
        this.sdcId = sdcId;
        this.sdImg = sdImg;
        this.sdCreateTime = sdCreateTime;
        this.sdCreateUser = sdCreateUser;
        this.sdUpdateTime = sdUpdateTime;
        this.sdUpdateUser = sdUpdateUser;
        this.reserve1 = reserve1;
        this.reserve2 = reserve2;
        this.reserve3 = reserve3;
    }

    public int getSdDishId() {
        return sdDishId;
    }

    public void setSdDishId(int sdDishId) {
        this.sdDishId = sdDishId;
    }

    public String getSdDishName() {
        return sdDishName;
    }

    public void setSdDishName(String sdDishName) {
        this.sdDishName = sdDishName;
    }

    public double getSdDishPrice() {
        return sdDishPrice;
    }

    public void setSdDishPrice(double sdDishPrice) {
        this.sdDishPrice = sdDishPrice;
    }

    public String getSdDishContent() {
        return sdDishContent;
    }

    public void setSdDishContent(String sdDishContent) {
        this.sdDishContent = sdDishContent;
    }

    public int getSdcId() {
        return sdcId;
    }

    public void setSdcId(int sdcId) {
        this.sdcId = sdcId;
    }

    public String getSdImg() {
        return sdImg;
    }

    public void setSdImg(String sdImg) {
        this.sdImg = sdImg;
    }

    public String getSdCreateTime() {
        return sdCreateTime;
    }

    public void setSdCreateTime(String sdCreateTime) {
        this.sdCreateTime = sdCreateTime;
    }

    public String getSdCreateUser() {
        return sdCreateUser;
    }

    public void setSdCreateUser(String sdCreateUser) {
        this.sdCreateUser = sdCreateUser;
    }

    public String getSdUpdateTime() {
        return sdUpdateTime;
    }

    public void setSdUpdateTime(String sdUpdateTime) {
        this.sdUpdateTime = sdUpdateTime;
    }

    public String getSdUpdateUser() {
        return sdUpdateUser;
    }

    public void setSdUpdateUser(String sdUpdateUser) {
        this.sdUpdateUser = sdUpdateUser;
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
        return "Dish{" +
                "sdDishId=" + sdDishId +
                ", sdDishName='" + sdDishName + '\'' +
                ", sdDishPrice=" + sdDishPrice +
                ", sdDishContent='" + sdDishContent + '\'' +
                ", sdcId=" + sdcId +
                ", sdImg='" + sdImg + '\'' +
                ", sdCreateTime='" + sdCreateTime + '\'' +
                ", sdCreateUser='" + sdCreateUser + '\'' +
                ", sdUpdateTime='" + sdUpdateTime + '\'' +
                ", sdUpdateUser='" + sdUpdateUser + '\'' +
                ", reserve1='" + reserve1 + '\'' +
                ", reserve2='" + reserve2 + '\'' +
                ", reserve3='" + reserve3 + '\'' +
                '}';
    }
}
