package JDBC.jdbc;

import JDBC.domain.Emp;
import JDBC.util.jdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个方法，查询emp表的数据，将其封装为对象，然后装载集合返回，
 */

public class jdbcTest9 {
    /**
     * 查询所有emp对象
     *
     * @return
     */
    public static void main(String[] args) {
        List<Emp> list = new jdbcTest9().findAll2();
        for (Emp emp : list) {
            System.out.println(emp);

        }
    }

    public List<Emp> findAll() {
        ResultSet rs = null;
        Statement stmt = null;
        Connection conn = null;
        ArrayList<Emp> list = null;
        try {
            // 1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2、获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///test2", "root", "664490254");
            // 3、定义SQL语句
            String sql = "select * from emp";
            // 4、获取SQL对象
            stmt = conn.createStatement();
            // 5、执行SQL
            rs = stmt.executeQuery(sql);
            // 6、遍历结果集，封装对象，装载集合
            Emp emp = null;
            list = new ArrayList<Emp>();
            while (rs.next()) {
                // 获取数据
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                int bonus = rs.getInt("bonus");
                int dept_id = rs.getInt("dept_id");

                // 创建emp对象，并赋值
                emp = new Emp();
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                // 装载集合
                list.add(emp);
            }

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
        return list;
    }

    /**
     * 演示JDBC工具类
     *
     * @return
     */

    public List<Emp> findAll2() {
        ResultSet rs = null;
        Statement stmt = null;
        Connection conn = null;
        ArrayList<Emp> list = null;
        try {
            /*// 1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2、获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///test2", "root", "664490254");*/
            conn = jdbcUtils.getConnection();
            // 3、定义SQL语句
            String sql = "select * from emp";
            // 4、获取SQL对象
            stmt = conn.createStatement();
            // 5、执行SQL
            rs = stmt.executeQuery(sql);
            // 6、遍历结果集，封装对象，装载集合
            Emp emp = null;
            list = new ArrayList<Emp>();
            while (rs.next()) {
                // 获取数据
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                int bonus = rs.getInt("bonus");
                int dept_id = rs.getInt("dept_id");

                // 创建emp对象，并赋值
                emp = new Emp();
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                // 装载集合
                list.add(emp);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }/* finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
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
        }*/
        jdbcUtils.close(rs, stmt, conn);
        return list;
    }
}
