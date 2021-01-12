package com.javacto.utils;

/**
 * @author CZQ
 * @date 2020-12-27 17:24
 * Description：
 **/
public class PageInfo {
    /**
     * curPageNo：当前页，默认设置为1
     * pageSize：每页显示多少条数据，默认设置为3
     * totalCount：总条数
     * totalPageCount：总页数
     */
    private int curPageNo = 1;
    private int pageSize = 2;
    private int totalCount;
    private int totalPageCount;

    public int getCurPageNo() {
        return curPageNo;
    }

    public void setCurPageNo(int curPageNo) {
        this.curPageNo = curPageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        // 计算出总页数
        if (totalCount > 0){
            this.totalCount = totalCount;
            if (totalCount%pageSize == 0){
                totalPageCount = totalCount / pageSize;
            }else {
                totalPageCount = (totalCount / pageSize) + 1;
            }
        }
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }
}
