package JDBCTemplate;

import domain.Emp;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import utils.jdbcDruidUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * - 需求：更改emp表
 * - 修改1号数据的salary的工资为10000
 * - 添加一条记录
 * - 删除刚才添加的记录
 * - 查询id为1的记录，将其封装为Map集合
 * - 查询所有的记录，将其封装为List集合
 * - 查询所有的记录，将其封装为Emp对象的List集合
 * - 查询总的记录数
 */

public class JDBCTemplateDemo2 {
    // Junit 单元测试，可以让方法独立执行

    // 1、获取JDBCTemplate对象
    private JdbcTemplate template = new JdbcTemplate(jdbcDruidUtils.getDataSource());

    /**
     * 修改1号数据的salary的工资为10000
     */


    @Test
    public void test1() {
        // 2、定义SQL
        String sql = "update emp set salary = 10000 where id = 1001";
        // 3、执行SQL
        int count = template.update(sql);
        System.out.println(count);
    }

    /**
     * 添加一条记录
     */
    @Test
    public void test2() {
        String sql = "insert into emp(id,ename,dept_id) values(?,?,?)";
        int count = template.update(sql, 1015, "雯雯", 10);
        System.out.println(count);
    }

    /**
     * 删除刚才添加的记录
     */
    @Test
    public void test3() {
        String sql = "delete from emp where id = ?";
        int count = template.update(sql, 1015);
        System.out.println(count);
    }

    /**
     * 查询id为1014的记录，将其封装为Map集合
     * 注意事项：这个方法查询的结果集长度只能是1
     */
    @Test
    public void test4() {
        /*String sql = "select * from emp where id = ? or id = ?";
        Map<String, Object> map = template.queryForMap(sql, 1013,1014);*/
        String sql = "select * from emp where id = ?";
        Map<String, Object> map = template.queryForMap(sql, 1013);
        System.out.println(map); // {id=1014, ename=关羽, job_id=4, mgr=1007, joindate=2002-01-23, salary=13000.00, bonus=null, dept_id=10}

    }

    /**
     * 查询所有的记录，将其封装为List集合
     */
    @Test
    public void test5() {
        String sql = "select * from emp";
        List<Map<String, Object>> list = template.queryForList(sql);
        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(stringObjectMap);
        }
    }

    /**
     * 脑残写法 查询所有的记录，将其封装为Emp对象的List集合
     */
    @Test
    public void test6() {
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet rs, int i) throws SQLException {
                Emp emp = new Emp();
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                emp.setId(id);
                emp.setName(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBouns(bonus);
                emp.setDept_id(dept_id);

                return emp;


            }
        });
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    /**
     * 查询所有的记录，将其封装为Emp对象的List集合
     */
    @Test
    public void test7(){
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    /**
     * 查询总记录数
     */
    @Test
    public void test8(){
        String sql = "select count(id) from emp";
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);
    }


}
