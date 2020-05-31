package service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dao.ProvinceDao;
import dao.impl.ProvinceDaoImpl;
import domain.Province;
import jedis.util.JedisPoolUtils;
import redis.clients.jedis.Jedis;
import service.ProvinceService;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {
    // 声明dao
    private final ProvinceDao dao = new ProvinceDaoImpl();
    @Override
    public List<Province> findAll() {
        return dao.findAll();
    }

    /**
     * 使用redis缓存
     * @return
     */
    @Override
    public String findAllJson() {
        // 先从redis中查询是否有数据
            // 获取redis客户端连接
        Jedis jedis = JedisPoolUtils.getJedis();
        String province_json = jedis.get("province");
            // 判断province_json 数据是否为null
        if(province_json == null || province_json.length() == 0){
            // redis缓存中没有数据，从数据库中查询
            System.out.println("redis中没有数据，查询数据库");
            List<Province> ps = dao.findAll();
                // 将list序列化为json
            ObjectMapper mapper = new ObjectMapper();
            try {
                province_json = mapper.writeValueAsString(ps);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            // 将json数据顺便存入redis缓存中
            jedis.set("province", province_json);
            // 归还连接
            jedis.close();
        }else {
            System.out.println("redis中有数据，查询缓存");
        }

        //
        return province_json;
    }
}
