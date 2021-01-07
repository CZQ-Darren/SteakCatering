package com.javacto.po;

/**
 * @author CZQ
 * @date 2021-01-07 14:57
 * Description：
 **/
public class StoreCategory {
    private int sscId;
    private String sscName;

    public StoreCategory() {
    }

    public StoreCategory(int sscId, String sscName) {
        this.sscId = sscId;
        this.sscName = sscName;
    }

    public int getSscId() {
        return sscId;
    }

    public void setSscId(int sscId) {
        this.sscId = sscId;
    }

    public String getSscName() {
        return sscName;
    }

    public void setSscName(String sscName) {
        this.sscName = sscName;
    }

    @Override
    public String toString() {
        return "StoreCategory{" +
                "sscId=" + sscId +
                ", sscName='" + sscName + '\'' +
                '}';
    }
}
