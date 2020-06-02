package JDBC.jdbc; /**
 * 执行ddl语句
 */

import java.sql.*;

public class jdbcTest6 {


    public static void main(String[] args) {
        Connection conn = null;
        Statement stmp = null;
        ResultSet rs = null;
        try {
            // 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///test2", "root", "664490254");
            // 定义SQL
            String sql = "select * from account";
            // 获取执行sql对象
            stmp = conn.createStatement();
            // 执行SQL
            rs = stmp.executeQuery(sql);
            // 处理结果
            // 让游标向下移动一行
            rs.next();
            // 获取数据
            int id = rs.getInt(1);
            String name = rs.getString("name");
            double balance = rs.getDouble(3);
            System.out.println(id + "---" + name + "---" + balance);
            // 让游标向下移动一行
            rs.next();
            // 获取数据
            int id2 = rs.getInt(1);
            String name2 = rs.getString("name");
            double balance2 = rs.getDouble(3);
            System.out.println(id2 + "---" + name2 + "---" + balance2);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            }
            if (stmp != null) {
                try {
                    stmp.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

        }
    }
}

