package dao.impl;


import domain.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;

import java.util.List;

public class UserDaoImpl implements dao.UserDao {
    private final JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<User> findAll() {
        // 使用jdbc操作数据库
        String sql = "select * from user";
        // List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return template.query(sql, new BeanPropertyRowMapper<User>(User.class));
    }

    @Override
    public User findUserByUsernameAndPassword(String username, String password){
        try {
            String sql = "select * from user where username = ? and password = ?";
            User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), username, password);
            return user;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }


    @Override
    public void add(User user) {
        // 定义SQL
        String sql = "insert into user values(null,?,?,?,?,?,?,null,null)";
        // 执行sql
        template.update(sql, user.getName(), user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail());

    }

    @Override
    public void delete(int id) {
        // 定义sql
        String sql = "delete from user where id= ?";
        // 执行sql
        template.update(sql, id);
    }
}
