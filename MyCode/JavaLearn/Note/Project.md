# 黑马旅游网项目

## 技术选型
- Web层
    - Servlet：前端控制器
    - HTML：视图
        - 不使用jsp，基于项目展示，层需考虑用户访问速度，一般后台的管理系统才使用(OA/办公/财务，给内部人员使用)JSP作为展示层
    - Filter：过滤器
    - BeanUtils：完成数据的封装
    - Jackson：json序列化工具
- Service层
    - JavaMail：Java发送邮件工具
    - Redis：nosql内存数据库
    - Jedis：Java的Redis客户端
- Dao层
    - MySQL：数据库
    - Druid：使用阿里巴巴提供的Druid数据库连接池优化连接
    - JdbcTemplate：jdbc工具
    
## 数据库搭建

- 创建数据库环境
    - 创建数据库
        - create database travel;
    - 使用数据库
        - use travel;
    - 创建表及导入数据
        - ...
    
## 注册


## 登录

## 退出 