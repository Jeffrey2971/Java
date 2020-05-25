package servlet;

import domain.User;

import java.util.List;

/**
 * 用户管理的业务接口
 */

public interface UserServlet {

    /**
     *查询所用用户信息
     * @return
     */

    public List<User> findAll();

    User login(User user);
}
