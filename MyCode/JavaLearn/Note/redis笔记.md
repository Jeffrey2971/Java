# 今日内容
- redis
    - 概念
    - 下载/安装
    - 命令操作
        - 数据结构
    - 持久化
    - 使用Java客户端操作redis
    
## redis
- 概念：redis是一款高性能的NoSQL系列非关系型数据库
- 下载安装
    - sudo apt-get install redis
    - /etc/redis/redis.conf：配置文件
    - redis-cli：redis的客户端
    - redis-server：redis的服务器端
- 命令操作
    - redis存储的是：key, value格式的数据，其中key都是字符串，value有五中不同的数据结构
        - value的数据结构
            - 字符串类型：string
            - 哈希类型：hash map格式
            - 列表类型：list linkedlist格式，支持重复元素
            - 集合类型：set：不允许重复元素
            - 有序集合类型：sortedset 不允许重复，且元素有序排序
            
    - 字符串类型 string
        - 存储：set key value
        - 获取：get key value
            - hget key field：获取指定的field对应的值
            - hgetall key：获取所有的field和value
        - 删除：del key field
    
    - 哈希类型 hash
        - 存储：hset key field value
        - 获取：hget key field
        - 删除：hdel key field
        
    - 列表类型 list：可以添加一个元素到列表的头部(左边)或者尾部右边
            - 添加
                - lpush key value：将元素添加到列表左侧
                - rpush key value：将元素添加到列表右侧 
            - 获取：lrange key start end：范围获取
            - 删除
                - lpop key：删除列表最左侧的元素，并将元素返回
                - rpop key：删除列表最右侧的元素，并将元素返回
    - 集合类型 set：不允许重复元素
        - 存储：sadd key value1 value2...
        - 获取：smembers key：获取set集合中所有的元素
        - 删除：srem key value：删除set集合中某个元素
    - 有序集合类型：sortedset，不允许重复，且元素有序排序
        - 存储：zadd key score value
        - 获取：zrange key start end
        - 删除：zrem key value
    
    - 通用命令
        - keys *：查询所有的键
        - type key：获取键对应的value类型
        - del key：删除指定的key value