package com.javacto.dao.impl;



import com.javacto.dao.MeiShiUserDao;
import com.javacto.po.MeiShi;
import com.javacto.utils.BaseDao;
import com.javacto.utils.PageInfo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * 菜品 dao层  实现类
 */
public class MeiShiUserDaolmpl implements MeiShiUserDao {




    /**
     * 分页查询
     *
     * @param pageInfo
     * @param meiShi
     * @return
     */
    @Override
    public List<MeiShi> queryAllPage(PageInfo pageInfo, MeiShi meiShi) {
        List<MeiShi> list = new ArrayList<MeiShi>();
        Connection conn = BaseDao.getConnection();
        System.out.println(conn);
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            //处理预编译sql语句
            pstm = conn.prepareStatement("SELECT * FROM steak_dish LIMIT ?,?");
            int begin = (pageInfo.getCurPageNo() - 1) * pageInfo.getPageSize();
            int end = pageInfo.getPageSize();
            pstm.setObject(1, begin);
            pstm.setObject(2, end);
            //执行预编译sql语句
            rs = pstm.executeQuery();
            //循环遍历
            while (rs.next()) {
                MeiShi meiShi1 = new MeiShi();
                meiShi1.setSdDishId(rs.getInt("sd_dish_id"));
                meiShi1.setSdDishName(rs.getString("sd_dish_name"));
                meiShi1.setSdDishPrice(rs.getDouble("sd_dish_price"));
                meiShi1.setSdDishContent(rs.getString("sd_dish_content"));
                meiShi1.setSdcId(rs.getInt("sdc_id"));
                meiShi1.setSdImg(rs.getString("sd_img"));
                meiShi1.setSdCreateTime(rs.getString("sd_create_time"));
                meiShi1.setSdCreateUser(rs.getString("sd_create_user"));
                meiShi1.setSdUpdateTime(rs.getString("sd_update_time"));
                meiShi1.setSdUpdateUser(rs.getString("sd_update_user"));
                meiShi1.setReserve1(rs.getString("reserve1"));
                meiShi1.setReserve2(rs.getString("reserve2"));
                meiShi1.setReserve3(rs.getString("reserve3"));

                // 其他字段再加上吧
                //把对象添加到集合中
                list.add(meiShi1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            BaseDao.closeAll(conn, pstm, rs);
        }
        return list;
    }


    /**
     * 查询总条数
     * @param meiShi
     * @return
     */
    @Override
    public int getTotalCount(MeiShi meiShi) {
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
}
