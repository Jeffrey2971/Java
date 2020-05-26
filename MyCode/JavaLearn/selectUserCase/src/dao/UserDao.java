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

    void delete(int id);

    User findById(int i);

    void update(User user);


    /**
     * 查询总记录数
     * @return
     */
    int findTotalCount();


    /**
     * 分页查询每页的条目
     * @param start
     * @param rows
     * @return
     */
    List<User> findByPage(int start, int rows);
}

