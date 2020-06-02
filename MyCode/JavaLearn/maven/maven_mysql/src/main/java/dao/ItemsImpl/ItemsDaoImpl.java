package dao.ItemsImpl;

import dao.itemsDao;
import domain.Items;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 要想从数据库中取出数据，必须有四个属性
 * 数据库驱动，连接数据库地址，数据库用户名称，数据库用户密码
 */

public class ItemsDaoImpl implements itemsDao {
    public List<Items> findAll() {
        List<Items> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection connection = null;
        try {
            // 获取connection对象

            // 加载驱动类
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql:///maven", "root", "664490254");
            // 获取正真操作数据库的对象
            ps = connection.prepareCall("select * from items");
            // 执行数据库查询操作
            rs = ps.executeQuery();
            // 返回数据库结果集转为JavaList集合
            list = new ArrayList<Items>();
            while (rs.next()) {
                Items items = new Items();
                items.setId(rs.getInt("id"));
                items.setName(rs.getString("name"));
                list.add(items);
                return list;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                connection.close();
                ps.close();
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }


        }
        return list;

    }
}
