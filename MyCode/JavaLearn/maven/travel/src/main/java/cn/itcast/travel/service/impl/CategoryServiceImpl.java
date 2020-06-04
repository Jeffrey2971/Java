package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.CategoryDao;
import cn.itcast.travel.dao.impl.CategoryDaoImpl;
import cn.itcast.travel.domain.Category;
import cn.itcast.travel.service.CategoryService;
import cn.itcast.travel.util.JedisUtil;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CategoryServiceImpl implements CategoryService {

    private final CategoryDao categoryDao = new CategoryDaoImpl();

    @Override
    public List<Category> findAll() {
        // 从redis中查询是否有数据
        // 获取Jedis客户端
        Jedis jedis = JedisUtil.getJedis();
        // 使用sortedset排序查询
        Set<String> categorys = jedis.zrange("category", 0, -1);
        List<Category> cs = null;
        // 判断查询的集合是否为null
        if (categorys == null || categorys.size() == 0) {
            System.out.println("从数据库查询");
            // 为空，第一次访问，需要从数据库中查询，再将数据存入redis
            cs = categoryDao.findAll();
            // 将查询到的集合存储到redis中键名为category
            for (int i = 0; i < cs.size(); i++) {
                jedis.zadd("category", cs.get(i).getCid(), cs.get(i).getCname());
            }

        } else {
            // 不为空，redis中有数据，将set的数据存入到list(cs)，直接返回
            System.out.println("从redis缓存中查询");
            cs = new ArrayList<Category>();
            for (String name : categorys) {
                Category category = new Category();
                category.setCname(name);
                cs.add(category);

            }

        }
        return cs;
    }
}
