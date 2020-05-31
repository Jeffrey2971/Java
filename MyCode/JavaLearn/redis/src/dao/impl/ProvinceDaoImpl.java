package dao.impl;

import dao.ProvinceDao;
import domain.province;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;

import java.util.List;

public class ProvinceDaoImpl implements ProvinceDao {

    // 声明成员变量 jdbcTemplate
    private final JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());


    @Override
    public List<province> findAll() {
        // 定义sql
        String sql = "select * from province";
        // 执行sql
        List<province> list = template.query(sql, new BeanPropertyRowMapper<province>(province.class));

        return list;
    }
}
