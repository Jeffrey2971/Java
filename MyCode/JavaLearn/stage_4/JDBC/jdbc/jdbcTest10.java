package JDBC.jdbc;

import JDBC.util.jdbcUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * - 需求：
 * - 通过键盘录入用户名和密码
 * - 判断用户是否登录成功
 */

public class jdbcTest10 {
    public static void main(String[] args) {
        // 1、键盘录入，接收用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        // 2、调用方法
        boolean result = new jdbcTest10().login2(username, password);
        if (result) {
            System.out.println("登录成功！");
        } else {
            System.out.println("用户名或密码错误！");
        }

        // 3、判断结果输出不同于巨
    }

    /**
     * 登录方法
     */
    public boolean login(String username, String password) {
        if (username == null || password == null) {
            return false;
        }

        // 连接数据库判断是否登录成功
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 1、获取连接
            conn = jdbcUtils.getConnection();
            // 2、定义SQL
            String sql = "select * from user where username = '" + username + "'and password = '" + password + "'";
            System.out.println(sql);
            // 3、获取SQL对象
            stmt = conn.createStatement();
            // 4、执行SQL
            rs = stmt.executeQuery(sql);
            // 5、判断
            /*if (rs.next()) {
                // 如果有下一行则返回true
                return true;
            } else {
                return false;
            }*/
            return rs.next(); // // 如果有下一行则返回true
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            jdbcUtils.close(rs, stmt, conn);
        }

        return false;
    }

    /**
     * 登录方法，使用PreparedStatement实现
     */
    public boolean login2(String username, String password) {
        if (username == null || password == null) {
            return false;
        }

        // 连接数据库判断是否登录成功
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        PreparedStatement pstmt = null;
        try {
            // 1、获取连接
            conn = jdbcUtils.getConnection();
            // 2、定义SQL
            String sql = "select * from user where username = ? and password = ?";
            System.out.println(sql);
            // 3、获取SQL对象
            pstmt = conn.prepareStatement(sql);
            // 给?赋值
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            // 4、执行SQL，不需要传递SQL
            rs = pstmt.executeQuery();
            // 5、判断
            /*if (rs.next()) {
                // 如果有下一行则返回true
                return true;
            } else {
                return false;
            }*/
            return rs.next(); // // 如果有下一行则返回true
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            jdbcUtils.close(rs, pstmt, conn);
        }

        return false;
    }


}
