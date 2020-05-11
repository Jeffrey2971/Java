package JDBCTemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import utils.jdbcDruidUtils;

/**
 * JDBCTemplate入门
 */

public class JDBCTemplateDemo1 {
    public static void main(String[] args) {
        // 1、导入jar包
        // 2、创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(jdbcDruidUtils.getDataSource());
        // 调用方法
        String sql = "update account set balance = 12500 where id = ?";
        int count = template.update(sql, 4);
        System.out.println(count);

    }
}
