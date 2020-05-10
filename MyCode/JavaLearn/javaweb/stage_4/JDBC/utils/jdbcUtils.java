package JDBC.util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * JDBC工具类
 */

public class jdbcUtils {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    /**
     * 获取连接
     *
     * @return 连接对象
     */

    /**
     * 配置文件的读取，只需要加载一次即可，使用静态代码块
     * @return
     */
    static {
        // 读取资源文件，获取值

        // 1、创建 Properties 集合类
        Properties pro = new Properties();
        try {
            // 2、加载配置文件
                // 获取src路径下的方式-->ClassLoader类加载器
            ClassLoader classLoader = jdbcUtils.class.getClassLoader();
            URL res = classLoader.getResource("jdbc.properties");
            String path = res.getPath();
            System.out.println(path);
            // pro.load(new FileReader("/home/jeffrey/IdeaProjects/JavaLearn/MyCode/JavaLearn/stage_4/jdbc.properties"));
            pro.load(new FileReader(path));
            // 3、获取属性，赋值
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");
            // 注册驱动
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(url, user, password);

    }

    /**
     * 释放资源
     *
     * @param stmt
     * @param conn
     */
    public static void close(Statement stmt, Connection conn) {
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

    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
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
