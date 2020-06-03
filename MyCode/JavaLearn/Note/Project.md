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
- 前台效果
    - 表单校验
        - 用户名：单词字符，8到20位
        - 密码：单词字符，8到20位
        - 邮件：把判断扔给email属性处理，只判断非空
        - 姓名：非空
        - 手机号：手机号格式
        - 出生日期：非空
        - 验证码：非空
    - 异步(ajax)提交表单
        - 在此使用异步提交表单是为了获取服务器响应的数据，因为前台使用的是HTML作为视图层，不能够直接从servlet相关的域对象获取值，只能通过ajax方式获取相应数据
- 后台代码实现
    - 编写RegistUserServlet
    - 编写UserService以及UserServiceImpl
    - 编写UserDao以及UserDao实现类

## 邮件激活
- 为了保证用户填写的邮箱是正确的，可以推广一些宣传信息到用户邮箱中
- 发送邮件
    - 使用工具类
- 用户点击邮件
    - 用户激活其实就是修改用户表中的status为Y

- 用户点击邮件并激活
    - 代码实现
- 激活代码实现
    - ActiveUserService
    - UserService: active
    - UserDao
        - findByCode
        - updateStatus


## 登录
- 代码实现
    - 前台
        - 
    - 后台
        - LoginServlet
        - UserService
        - UserDao

## 退出 