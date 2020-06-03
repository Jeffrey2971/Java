package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.util.MailUtils;
import cn.itcast.travel.util.UuidUtil;
public class UserServiceImpl implements UserService {

    /**
     * 注册用户
     * @param user
     * @return
     */

    private final UserDao userDao = new UserDaoImpl();

    @Override
    public boolean regist(User user) {
        // 根据用户名查询用户对象
        User u = userDao.findByUsername(user.getUsername());
        // 判断u是否为null
        if(u!=null){
            // 用户名存在，注册失败
            return false;
        }
        // 保存用户信息
        // 设置激活码，唯一字符串
        user.setCode(UuidUtil.getUuid());
        // 设置初始状态
        user.setStatus("N");
        userDao.save(user);
        // 3、激活邮件发送
        String content = "<a href='http://localhost:8080/travel/activeUserServlet?code="+ user.getCode() +"'>点击激活【黑马旅游网】</a>";
        MailUtils.sendMail(user.getEmail(), content, "邮件激活");
        return true;


    }


    /**
     * 用户邮件激活
     * @param code
     * @return
     */
    @Override
    public boolean active(String code) {
        return false;
    }
}
