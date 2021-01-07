package com.javacto.po;

/**
 * @author CZQ
 * @date 2021-01-07 14:52
 * Description：
 **/
public class DishCategory {
    private int sdcId;
    private String sdcName;

    public DishCategory() {
    }

    public DishCategory(int sdcId, String sdcName) {
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
        return "DishCategory{" +
                "sdcId=" + sdcId +
                ", sdcName='" + sdcName + '\'' +
                '}';
    }
}
