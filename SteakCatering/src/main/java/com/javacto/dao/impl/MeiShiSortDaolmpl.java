package com.javacto.dao.impl;

import com.javacto.dao.MeiShiDao;
import com.javacto.po.MeiShiSort;
import com.javacto.po.News;
import com.javacto.utils.BaseDao;
import com.javacto.utils.PageInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MeiShiSortDaolmpl implements MeiShiDao {
    /**
     * 菜品分类
     */
    @Override
    public List<MeiShiSort> sort(MeiShiSort meiShiSort) {
        List<MeiShiSort> sortsList = new ArrayList<MeiShiSort>();
        Connection conn = BaseDao.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            //处理预编译sql语句
            pstm = conn.prepareStatement("SELECT * FROM steak_dish_category");
            //执行预编译sql语句
            rs = pstm.executeQuery();
            //循环遍历
            while (rs.next()) {
                MeiShiSort s = new MeiShiSort();
                s.setSdcId(rs.getInt("sdc_id"));
                s.setSdcName(rs.getString("sdc_name"));
                sortsList.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            BaseDao.closeAll(conn, pstm, rs);
        }
        return sortsList;
    }

    /**
     * 查询总条数
     * @param meiShiSort
     * @return
     */
    @Override
    public int getTotalCount(MeiShiSort meiShiSort) {
        int i=0;
        Connection conn = BaseDao.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs=null;
        try{
            //3.处理预编译sql语句
            pstm = conn.prepareStatement("SELECT  COUNT(*) FROM steak_dish_category ");
            //5.执行预编译sql语句
            rs = pstm.executeQuery();
            //6.循环遍历
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
     * 根据id查询
     * @param sdcId
     * @return
     */
    @Override
    public MeiShiSort findMsById(int sdcId) {
        MeiShiSort meiShiSort = null;
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            //建立连接
            conn = BaseDao.getConnection();
            //处理预编译sql语句
            pstm = conn.prepareStatement("SELECT * FROM steak_dish_category WHERE sdc_id=?");
            //给占位符赋值
            pstm.setObject(1,sdcId);
            //执行预编译sql语句
            rs = pstm.executeQuery();
            //循环遍历
            while (rs.next()) {
                meiShiSort = new MeiShiSort();
                meiShiSort.setSdcId(rs.getInt("sdc_id"));
                meiShiSort.setSdcName(rs.getString("sdc_name"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            BaseDao.closeAll(conn, pstm, rs);
        }
        return meiShiSort;
    }
}
