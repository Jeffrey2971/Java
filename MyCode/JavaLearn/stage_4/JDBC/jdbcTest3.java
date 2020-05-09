import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * account表 修改一条记录 update 语句
 */

public class jdbcTest3 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2、获取对应的连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///test2", "root", "664490254");
            // 3、定义SQL
            String sql = "update account set balance =  10500";
            // 4、获取执行SQL对象
            stmt = conn.createStatement();
            // 5、执行SQL
            int count = stmt.executeUpdate(sql);
            // 6、处理结果
            System.out.println(count);
            if (count > 0) {
                System.out.println("修改成功");
            } else {
                System.out.println("修改失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
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
