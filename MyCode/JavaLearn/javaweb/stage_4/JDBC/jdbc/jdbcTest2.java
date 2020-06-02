package JDBC.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * account表 添加一条记录 insert 语句
 */

public class jdbcTest2 {
    public static void main(String[] args) {
        // 1、注册驱动
        Statement stmt = null;
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            // 2、定义SQL
            String sql = "insert into account values(null,'张雯蔚',12000)";
            // 获取Connection对象
            conn = DriverManager.getConnection("jdbc:mysql:///test2", "root", "664490254");
            // 4、获取执行SQL的对象
            stmt = conn.createStatement();
            // 5、执行SQL
            int count = stmt.executeUpdate(sql); // count：影响的行数
            // 6、处理结果
            System.out.println(count);
            if (count > 0) {
                System.out.println("添加成功！");
            } else {
                System.out.println("添加失败！");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            // 7、释放资源
            // 避免空指针异常
            if (stmt != null) {
                try {
                    stmt.close();
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
