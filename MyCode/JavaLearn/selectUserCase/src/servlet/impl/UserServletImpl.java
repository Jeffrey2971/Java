package servlet.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import domain.User;
import servlet.UserServlet;

import java.util.List;

public class UserServletImpl implements UserServlet {
    private final UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        // 调用Dao完成查询
        return dao.findAll();
    }

    @Override
    public User login(User user){
        return dao.findUserByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public void addUser(User user) {

    }


}
