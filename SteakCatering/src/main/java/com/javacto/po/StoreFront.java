package com.javacto.po;

/**
 * 店面分类查询   po
 */
public class StoreFront {
    private int sscId;
    private String sscName;

    public StoreFront() {
    }

    public StoreFront(int sscId, String sscName) {
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
        return "StoreFront{" +
                "sscId=" + sscId +
                ", sscName='" + sscName + '\'' +
                '}';
    }
}
