package com.javacto.dao.impl;


import com.javacto.dao.StoreFrontDao;
import com.javacto.po.StoreFront;
import com.javacto.utils.BaseDao;
import com.javacto.utils.PageInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 店面分页查询  Dao
 */
public class StoreFrontDaolmpl implements StoreFrontDao {


    /**
     * 分页查询
     * @param pageInfo
     * @param storeFront
     * @return
     */
    @Override
    public List<StoreFront> queryAllPage(PageInfo pageInfo, StoreFront storeFront) {
        List<StoreFront> list = new ArrayList<StoreFront>();
        Connection conn = BaseDao.getConnection();
        System.out.println(conn);
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            //处理预编译sql语句
            pstm = conn.prepareStatement("SELECT * FROM steak_store_category LIMIT ?,?");
            int begin = (pageInfo.getCurPageNo() - 1) * pageInfo.getPageSize();
            int end = pageInfo.getPageSize();
            pstm.setObject(1, begin);
            pstm.setObject(2, end);
            //执行预编译sql语句
            rs = pstm.executeQuery();
            while (rs.next()) {
                StoreFront s = new StoreFront();
                s.setSscId(rs.getInt("ssc_id"));
                s.setSscName(rs.getString("ssc_name"));
                list.add(s);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.closeAll(conn, pstm, rs);
        }
        return list;
    }

    /**
     * 查询总条数
     * @param storeFront
     * @return
     */
    @Override
    public int getTotalCount(StoreFront storeFront) {
        int i = 0;
        Connection conn = BaseDao.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            //处理预编译sql语句
            pstm = conn.prepareStatement("SELECT COUNT(*) FROM steak_dish");
            //执行预编译sql语句
            rs = pstm.executeQuery();
            //循环遍历
            while (rs.next()) {
                i = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            BaseDao.closeAll(conn,pstm,rs);
        }
        return i;
    }

    /**
     * 根据id查询
     * @param sscId
     * @return
     */
    @Override
    public StoreFront findById(int sscId) {
        StoreFront storeFront = null;
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        conn = BaseDao.getConnection();
        try {
            //处理预编译sql语句
            pstm = conn.prepareStatement("SELECT * FROM steak_store_category WHERE ssc_id=?");
            //赋值
            pstm.setObject(1, sscId);
            //执行预编译sql语句
            rs = pstm.executeQuery();
            //循环遍历
            while (rs.next()) {
                storeFront = new StoreFront();
                storeFront.setSscId(rs.getInt("ssc_id"));
                storeFront.setSscName(rs.getString("ssc_name"));


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return storeFront;
    }
}
