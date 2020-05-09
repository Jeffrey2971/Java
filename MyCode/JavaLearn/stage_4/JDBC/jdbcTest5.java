/**
 * 执行ddl语句
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcTest5 {


    public static void main(String[] args) {
        Connection conn = null;
        Statement stmp = null;
        try {
            // 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///test2", "root", "664490254");
            // 定义SQL
            String sql = "create table student(id int, name varchar(20))";
            // 获取执行sql对象
            stmp = conn.createStatement();
            // 执行SQL
            int count = stmp.executeUpdate(sql);
            // 处理结果
            System.out.println(count);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
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

