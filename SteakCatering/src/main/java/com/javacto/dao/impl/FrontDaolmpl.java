package com.javacto.dao.impl;

import com.javacto.dao.FrontDao;
import com.javacto.po.Front;
import com.javacto.utils.BaseDao;
import com.javacto.utils.PageInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FrontDaolmpl implements FrontDao {
    /**
     * 分页查询
     *
     * @param pageInfo
     * @param front
     * @return
     */
    @Override
    public List<Front> queryAllPage(PageInfo pageInfo, Front front) {
        List<Front> frontList = new ArrayList<Front>();
        Connection conn = BaseDao.getConnection();
        System.out.println(conn);
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            //处理sql语句
            pstm = conn.prepareStatement("SELECT * FROM steak_store LIMIT ?,?");
            int begin = (pageInfo.getCurPageNo() - 1) * pageInfo.getPageSize();
            int end = pageInfo.getPageSize();
            pstm.setObject(1, begin);
            pstm.setObject(2, end);
            //执行预编译sql语句
            rs = (ResultSet) pstm.executeQuery();
            //循环遍历
            while (rs.next()) {
                Front front1 = new Front();
                front1.setSsStoreId(rs.getInt("ss_store_id"));
                front1.setSsStoreName(rs.getString("ss_store_name"));
                front1.setSsContent(rs.getString("ss_content"));
                front1.setSsImg(rs.getString("ss_img"));
                front1.setReservel1(rs.getString("reserve1"));
                front1.setReservel2(rs.getString("reserve2"));
                front1.setReservel3(rs.getString("reserve3"));
                //添加到集合中
                frontList.add(front1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            BaseDao.closeAll(conn, pstm, rs);
        }

        return frontList;
    }

    /**
     * 查询总条数
     * @param front
     * @return
     */
    @Override
    public int getTotalCount(Front front) {
        int i=0;
        Connection conn = BaseDao.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs=null;
        try{
            //处理预编译sql语句
            pstm = conn.prepareStatement("SELECT  COUNT(*) FROM steak_store ");
            //执行预编译sql语句
            rs = pstm.executeQuery();
            //循环遍历
            while (rs.next()){
                i=rs.getInt(1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            BaseDao.closeAll(conn,pstm,rs);
        }

        return  i;
    }

    /**
     * 根据ID查询
     * @param ssStoreId
     * @return
     */
    @Override
    public Front findNewsById(int ssStoreId) {
        Front front = null;
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        conn = BaseDao.getConnection();
        try {
           //处理预编译sql语句
            pstm = conn.prepareStatement("SELECT * FROM steak_store WHERE ss_store_id=?");
            //赋值
            pstm.setObject(1, ssStoreId);
            //执行预编译sql语句
            rs = pstm.executeQuery();
            //循环遍历
            while (rs.next()) {
                front = new Front();
                front.setSsStoreId(rs.getInt("ss_store_id"));
                front.setSsStoreName(rs.getString("ss_store_name"));
                front.setSsContent(rs.getString("ss_content"));
                front.setSsImg(rs.getString("ss_img"));
                front.setReservel1(rs.getString("reserve1"));
                front.setReservel2(rs.getString("reserve2"));
                front.setReservel3(rs.getString("reserve3"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.closeAll(conn, pstm, rs);
        }


        return front;
    }
}
