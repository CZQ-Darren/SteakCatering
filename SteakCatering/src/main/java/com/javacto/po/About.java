package com.javacto.po;

/**
 * @author CZQ
 * @date 2021-01-07 15:01
 * Description：
 **/
public class About {
    private int saId;
    private String saName;
    private String saPhone;
    private String saFax;
    private String saZipCode;
    private String saAddress;
    private String saImg;
    private String reserve1;
    private String reserve2;
    private String reserve3;

    public About() {
    }

    public About(int saId, String saName, String saPhone, String saFax, String saZipCode, String saAddress, String saImg, String reserve1, String reserve2, String reserve3) {
        this.saId = saId;
        this.saName = saName;
        this.saPhone = saPhone;
        this.saFax = saFax;
        this.saZipCode = saZipCode;
        this.saAddress = saAddress;
        this.saImg = saImg;
        this.reserve1 = reserve1;
        this.reserve2 = reserve2;
        this.reserve3 = reserve3;
    }

    public int getSaId() {
        return saId;
    }

    public void setSaId(int saId) {
        this.saId = saId;
    }

    public String getSaName() {
        return saName;
    }

    public void setSaName(String saName) {
        this.saName = saName;
    }

    public String getSaPhone() {
        return saPhone;
    }

    public void setSaPhone(String saPhone) {
        this.saPhone = saPhone;
    }

    public String getSaFax() {
        return saFax;
    }

    public void setSaFax(String saFax) {
        this.saFax = saFax;
    }

    public String getSaZipCode() {
        return saZipCode;
    }

    public void setSaZipCode(String saZipCode) {
        this.saZipCode = saZipCode;
    }

    public String getSaAddress() {
        return saAddress;
    }

    public void setSaAddress(String saAddress) {
        this.saAddress = saAddress;
    }

    public String getSaImg() {
        return saImg;
    }

    public void setSaImg(String saImg) {
        this.saImg = saImg;
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
        return "About{" +
                "saId=" + saId +
                ", saName='" + saName + '\'' +
                ", saPhone='" + saPhone + '\'' +
                ", saFax='" + saFax + '\'' +
                ", saZipCode='" + saZipCode + '\'' +
                ", saAddress='" + saAddress + '\'' +
                ", saImg='" + saImg + '\'' +
                ", reserve1='" + reserve1 + '\'' +
                ", reserve2='" + reserve2 + '\'' +
                ", reserve3='" + reserve3 + '\'' +
                '}';
    }
}
