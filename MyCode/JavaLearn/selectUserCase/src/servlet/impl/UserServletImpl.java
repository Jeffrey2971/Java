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
        dao.add(user);

    }

    @Override
    public void deleteUser(String id) {
        dao.delete(Integer.parseInt(id));
    }

    @Override
    public User findUserById(String id) {
        return dao.findById(Integer.parseInt(id));
    }

    @Override
    public void updateUser(User user) {
        dao.update(user);
    }

    @Override
    public void delSelectUser(String[] ids) {
        // 遍历数组
        for (String id : ids) {
            // 调用dao删除
            dao.delete(Integer.parseInt(id));
        }
    }


}
