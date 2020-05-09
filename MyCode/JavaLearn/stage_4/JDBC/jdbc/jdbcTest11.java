package JDBC.jdbc;


import JDBC.util.jdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 实务操作
 */
public class jdbcTest11 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        try {
            // 1、获取连接
            conn = jdbcUtils.getConnection();
            // 2、定义SQL
            String sql_1 = "update account set balance = balance - ? where id = ?";
            String sql_2 = "update account set balance = balance + ? where id = ?";
            // 3、获取执行SQL对象
            pstmt1 = conn.prepareStatement(sql_1);
            pstmt2 = conn.prepareStatement(sql_2);

            //4、设置参数
            pstmt1.setDouble(1,500);
            pstmt1.setDouble(2,1);
            pstmt2.setDouble(1,500);
            pstmt2.setDouble(2,2);

            // 5、执行SQL语句
            pstmt1.executeUpdate();
            pstmt2.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            jdbcUtils.close(pstmt1,conn);
            jdbcUtils.close(pstmt2,null);
        }

    }
}
