package dataSource.druid;

import dataSource.utils.jdbcDruidUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 使用Druid工具类
 */

public class druidDemo2 {
    public static void main(String[] args) {
        /**
         * 完成添加：给account添加一条记录
         */
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            // 1、获取连接
            conn = jdbcDruidUtils.getConnection();
            // 2、定义SQL
            String sql = "insert into account values(null,?,?)";
            // 3、获取pstmt
            pstmt = conn.prepareStatement(sql);
            // 4、给？赋值
            pstmt.setString(1, "洪泽飞");
            pstmt.setDouble(2, 11500);
            // 4、执行SQL
            int count = pstmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            // 使用创建好的工具类释放资源
            jdbcDruidUtils.close(pstmt, conn);

        }
    }
}
