# 今日内容
- JDBC基本概念
- 快速入门
- 对JDBC中各个接口和类讲解

## JDBC
- 概念：Java database connectivity java数据库连接，Java语言操作数据库
- JDBC本质：其实就是官方（sum公司）定义的一套操作所有关系型数据库的规则，即接口。各个数据库厂商去实现这套接口，提供数据库驱动jar包，
  可以使用这套接口（JDBC）编程，真正执行的是驱动jar包中的实现类
  
- 快速入门
    - 步骤
        - 导入驱动jar包 mysql-connector-java-8.0.20.jar
            - 复制mysql-connector-java-8.0.20.jar到项目的libs目录下
            - Add as library
        - 注册驱动
            - 
        - 获取数据库的连接对象connection
        - 定义sql
        - 获取执行sql语句的对象Statement
        - 执行SQL，接收返回的结果
        - 处理结果
        - 释放资源
- 详解各个对象
    - DriverManager：驱动管理对象
        - 功能
            - 注册驱动，告诉程序该使用哪一个数据库驱动jar
                - static void registerDriver(Driver driver)：注册与给定的驱动DriverManager
                - 写代码使用：Class.forName("com.mysql.jdbc.Driver");
                - 通过查看源码发现：在com.mysql.jdbc.Driver类中存在静态代码块
                    static {
                    try {
                        java.sql.DriverManager.registerDriver(new Driver());
                    } catch (SQLException E) {
                        throw new RuntimeException("Can't register driver!");
                        }
                    }
                - 注意事项：MYSQL5之后驱动jar可以省略注册驱动的步骤
                    
            - 获取数据库连接
                - 方法
                     - static Connection getConnection(String url, String user, String password)
                - 参数
                    - url：指定连接的路径
                        - 语法：jdbc:mysql://ip地址(域名):端口号/数据库名称;
                    - user：用户名
                    - password：密码
                - 细节
                    - 如果连接的是本机的MYSQL服务器，并且MYSQL默认端口是3306，则url可以简写为：jdbc:mysql//数据库名称
                    
    - Connection：数据库连接对象
        - 功能
            - 获取执行SQL的对象
                - Statement createStatement()
                - PreparedStatement preparedStatement(String sql)
            - 管理事务
                - 开启事务
                    - void setAutoCommit(boolean autoCommit)：调用该方法设置参数为false即开启事务
                - 提交事务
                    - void commit()：提交事务
                - 回滚事务
                    - void rollback()：回滚事务

    - Statement：执行SQL的对象
        - 执行SQL
            - boolean execute(String sql)：可以执行任意的SQL
            - int executeUpdate(String sql)：执行的是DML(insert,update,delete)语句、DDL(create,alter,drop)语句
                - 返回值：影响的行数，可以通过影响行数判断DML语句是否执行成功 返回值>0的则执行成功，反之则失败
            - ResultSet executeQuery(String sql)：执行DQL(select)语句
        - 练习
            - account表 添加一条记录
            - account表 修改记录
            - account表 删除一条记录 
            
    - ResultSet：结果集对象，封装查询结果
        - boolean next()：游标向下移动一行，判断当前行是否是最后一行，有返回true，没有则返回false
        - getXxx(参数)：获取数据
            - Xxx：代表数据类型，如 int GetInt() String getString()
            - 参数
                - int：代表的是列的编号，从1开始。如：getString(1)
                - String：代表的是列的名称。如：getDouble("balance")
        - 注意事项：
            - 使用步骤
                - 游标向下移动一行
                - 判断是否有数据
                - 获取数据
        - 练习
            - 定义一个方法，查询emp表的数据，将其封装为对象，然后装载集合返回，
                - 定义一个emp类
                - 定义方法 public List<Emp> findAll(){}
                - 实现方法 select * from emp;
    - PrepareStatement：执行SQL对象
    

    