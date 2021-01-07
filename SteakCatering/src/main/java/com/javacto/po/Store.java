package com.javacto.po;

/**
 * @author CZQ
 * @date 2021-01-07 14:53
 * Description：
 **/
public class Store {
    private int ssStoreId;
    private String ssStoreName;
    private String ssContent;
    private String ssImg;
    private int sscId;
    private String reserve1;
    private String reserve2;
    private String reserve3;

    public Store() {
    }

    public Store(int ssStoreId, String ssStoreName, String ssContent, String ssImg, int sscId, String reserve1, String reserve2, String reserve3) {
        this.ssStoreId = ssStoreId;
        this.ssStoreName = ssStoreName;
        this.ssContent = ssContent;
        this.ssImg = ssImg;
        this.sscId = sscId;
        this.reserve1 = reserve1;
        this.reserve2 = reserve2;
        this.reserve3 = reserve3;
    }

    public int getSsStoreId() {
        return ssStoreId;
    }

    public void setSsStoreId(int ssStoreId) {
        this.ssStoreId = ssStoreId;
    }

    public String getSsStoreName() {
        return ssStoreName;
    }

    public void setSsStoreName(String ssStoreName) {
        this.ssStoreName = ssStoreName;
    }

    public String getSsContent() {
        return ssContent;
    }

    public void setSsContent(String ssContent) {
        this.ssContent = ssContent;
    }

    public String getSsImg() {
        return ssImg;
    }

    public void setSsImg(String ssImg) {
        this.ssImg = ssImg;
    }

    public int getSscId() {
        return sscId;
    }

    public void setSscId(int sscId) {
        this.sscId = sscId;
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
        return "Store{" +
                "ssStoreId=" + ssStoreId +
                ", ssStoreName='" + ssStoreName + '\'' +
                ", ssContent='" + ssContent + '\'' +
                ", ssImg='" + ssImg + '\'' +
                ", sscId=" + sscId +
                ", reserve1='" + reserve1 + '\'' +
                ", reserve2='" + reserve2 + '\'' +
                ", reserve3='" + reserve3 + '\'' +
                '}';
    }
}
