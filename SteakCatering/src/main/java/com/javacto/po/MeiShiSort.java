package com.javacto.po;

public class MeiShiSort {
    private int sdcId;
    private String sdcName;

    public MeiShiSort() {
    }

    public MeiShiSort(int sdcId, String sdcName) {
        this.sdcId = sdcId;
        this.sdcName = sdcName;
    }

    public int getSdcId() {
        return sdcId;
    }

    public void setSdcId(int sdcId) {
        this.sdcId = sdcId;
    }

    public String getSdcName() {
        return sdcName;
    }

    public void setSdcName(String sdcName) {
        this.sdcName = sdcName;
    }

    @Override
    public String toString() {
        return "MeiShiSort{" +
                "sdcId=" + sdcId +
                ", sdcName='" + sdcName + '\'' +
                '}';
    }
}
