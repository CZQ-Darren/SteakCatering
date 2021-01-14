package com.javacto.po;

/**
 * 店面信息  po
 */
public class Front {
    private int ssStoreId;
    private String ssStoreName;
    private String ssContent;
    private String ssImg;
    private String sscId;
    private String reservel1;
    private String reservel2;
    private String reservel3;

    public Front() {
    }

    public Front(int ssStoreId, String ssStoreName, String ssContent, String ssImg, String sscId, String reservel1, String reservel2, String reservel3) {
        this.ssStoreId = ssStoreId;
        this.ssStoreName = ssStoreName;
        this.ssContent = ssContent;
        this.ssImg = ssImg;
        this.sscId = sscId;
        this.reservel1 = reservel1;
        this.reservel2 = reservel2;
        this.reservel3 = reservel3;
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

    public String getSscId() {
        return sscId;
    }

    public void setSscId(String sscId) {
        this.sscId = sscId;
    }

    public String getReservel1() {
        return reservel1;
    }

    public void setReservel1(String reservel1) {
        this.reservel1 = reservel1;
    }

    public String getReservel2() {
        return reservel2;
    }

    public void setReservel2(String reservel2) {
        this.reservel2 = reservel2;
    }

    public String getReservel3() {
        return reservel3;
    }

    public void setReservel3(String reservel3) {
        this.reservel3 = reservel3;
    }

    @Override
    public String toString() {
        return "Front{" +
                "ssStoreId=" + ssStoreId +
                ", ssStoreName='" + ssStoreName + '\'' +
                ", ssContent='" + ssContent + '\'' +
                ", ssImg='" + ssImg + '\'' +
                ", sscId='" + sscId + '\'' +
                ", reservel1='" + reservel1 + '\'' +
                ", reservel2='" + reservel2 + '\'' +
                ", reservel3='" + reservel3 + '\'' +
                '}';
    }
}
