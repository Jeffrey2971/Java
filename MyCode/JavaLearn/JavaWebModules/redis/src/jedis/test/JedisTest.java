package jedis.test;

import jedis.util.JedisPoolUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Jedis的测试类
 */

public class JedisTest {
    /**
     * string 数据结构操作
     */
    @Test
    public void test1(){
        // 获取连接
        Jedis jedis = new Jedis("localhost", 6379); // 如果空参构造，默认值 "localhost", 6379
        // 操作
            // 存储
        jedis.set("username", "mable");
            // 获取
        String username = jedis.get("username");
        System.out.println(username);

        // 可使用setex()方法存储可以指定过期时间的key和value
        jedis.setex("activeCode", 20, "哈哈"); // 将activeCode:哈哈 键值对存入redis中，并且20秒后自动删除该键值对

        // 关闭连接
        jedis.close();
    }

    /**
     * hash 数据结构操作
     */
    @Test
    public void test2(){
        // 获取连接
        Jedis jedis = new Jedis("localhost", 6379); // 如果空参构造，默认值 "localhost", 6379
        // 操作
            // 存储hash
        jedis.hset("user", "name", "mable");
        jedis.hset("user", "age", "21");
        jedis.hset("user", "gender", "female");
            // 获取hash
        String name = jedis.hget("user", "age");
        System.out.println(name);
            // 获取hash的所有map中的数据
        Map<String, String> user = jedis.hgetAll("user");
        System.out.println(user);

        // keySet
        Set<String> keySet = user.keySet();
        for (String key : keySet) {
            // 获取value
            String value = user.get(key);
            System.out.println(key + "：" + value);
        }

        // 关闭连接
        jedis.close();
    }

    /**
     * list 数据结构操作
     */
    @Test
    public void test3(){
        // 获取连接
        Jedis jedis = new Jedis("localhost", 6379); // 如果空参构造，默认值 "localhost", 6379
        // 操作
            // list存储
        jedis.lpush("mylist", "a", "b", "c", "d"); // 从左侧存储
        jedis.rpush("mylist", "a", "b", "c", "d"); // 从右侧存储
            // list范围获取
        List<String> mylist1 = jedis.lrange("mylist", 0, -1);
        System.out.println(mylist1);
            // list 弹出
        String element_l = jedis.lpop("mylist");
        System.out.println(element_l);

        String element_r = jedis.rpop("mylist");
        System.out.println(element_r);
        List<String> mylist2 = jedis.lrange("mylist", 0, -1);
        System.out.println(mylist2);

        // 关闭连接
        jedis.close();
    }

    /**
     * set 数据结构操作
     */
    @Test
    public void test4(){
        // 获取连接
        Jedis jedis = new Jedis("localhost", 6379); // 如果空参构造，默认值 "localhost", 6379
        // 操作
            // set存储
        jedis.sadd("myset", "java", "python", "c++");
            // set获取
        Set<String> myset = jedis.smembers("myset");
        System.out.println(myset);


        // 关闭连接
        jedis.close();
    }

    /**
     * sortedset 数据结构操作
     */
    @Test
    public void test5(){
        // 获取连接
        Jedis jedis = new Jedis("localhost", 6379); // 如果空参构造，默认值 "localhost", 6379
        // 操作
            // sortedset 存储
        jedis.zadd("mysrotedset", 3, "亚瑟");
        jedis.zadd("mysrotedset", 30, "后裔");
        jedis.zadd("mysrotedset", 55, "孙悟空");
            // sortedset获取
        Set<String> mysrotedset = jedis.zrange("mysrotedset", 0, -1);
        System.out.println(mysrotedset);


        // 关闭连接
        jedis.close();
    }


    /**
     * Jedis连接池使用
     */
    @Test
    public void test6(){
        // 创建一个配置对象
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(50);
        config.setMaxIdle(10);

        // 创建Jedis连接池对象
        JedisPool jedisPool = new JedisPool(config, "localhost", 6379);

        // 获取连接
        Jedis jedis = jedisPool.getResource();

        // 使用
        jedis.set("hehe", "heihei");


        // 关闭 归还到连接池中
        jedis.close();
    }

    /**
     * Jedis连接池工具类使用
     */
    @Test
    public void test7(){
        // 通过连接池获取
        Jedis jedis = JedisPoolUtils.getJedis();
        jedis.set("hello", "world");
        jedis.close();

    }

}
