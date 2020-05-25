package dao;

import domain.User;

import java.util.List;

/**
 * 用户操作的Dao
 */

public interface UserDao {
    public List<User>findAll();
    User findUserByUsernameAndPassword(String username, String password);

    void add(User user);

    void delete(int parseInt);
}

