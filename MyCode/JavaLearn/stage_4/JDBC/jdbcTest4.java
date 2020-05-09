import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * account表 删除一条记录 delete 语句
 */

public class jdbcTest4 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmp = null;
        try {
            // 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///test2","root","664490254");
            // 定义SQL
            String sql = "delete from account where id = 2";
            // 获取执行sql对象
            stmp = conn.createStatement();
            // 执行SQL
            int count = stmp.executeUpdate(sql);
            // 处理结果
            System.out.println(count);
            if (count > 0) {
                System.out.println("删除成功！");
            } else {
                System.out.println("删除失败");
            }
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
