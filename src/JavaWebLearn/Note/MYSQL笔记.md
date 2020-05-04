# 今日内容

- 数据库的基本概念

- MYSQL数据库软件
    - 安装
    - 卸载
    - 配置
    
- SQL

## 数据库的基本概念
    - 数据库的英文单词：database 简称为：db
    - 数据库
        - 用于存储和管理数据的仓库
    
    - 数据库的特点
        - 持久化存储数据，就是一个文件系统
        - 方便存储和管理数据
        - 使用了统一的方式操作数据库 -- SQL
        
    - 常见的数据库软件
        - MYSQL
        - ORACLE
        - ... ...
# MYSQL数据库软件
    - ubuntu
        - 安装
            - sudo apt-get install mysql-server mysql-client
    
    - 查看安装端口情况
        - sudo netstat -tap | grep mysql
    
    - 配置文件位置
        - sudo vim /etc/mysql/my.cnf
    
    - 打开关闭服务
        - /etc/init.d/mysql start/stop
        
    - 登入方式
        - mysql -u账户 -p密码
        - mysql -hIP地址 -uroot -p连接目标的密码
        -  mysql --host=IP地址 --user=root --password=连接目标密码
    
    - 设置本机MYSQL可以被局域网所访问
        - mysql -uroot -p root
        - mysql->use mysql
        - mysql->update user set host = '%' where user ='root';
        - mysql->grant all privileges on *.* to 'root'@'%' with grant option;
        - mysql->flush privileges;
        - mysql->exit;
        - sudo /etc/init.d/mysql restart
    

    - 其它文件默认位置
        - /usr/bin                  客户端程序和脚本  
        - /usr/sbin                 mysqld 服务器  
        - /var/lib/mysql            日志文件，数据库  ［重点要知道这个］  
        - /usr/share/doc/packages   文档  
        - /usr/include/mysql        包含( 头) 文件  
        - /usr/lib/mysql            库  
        - /usr/share/mysql          错误消息和字符集文件  
        - /usr/share/sql-bench      基准程序  
        
    
    - MYSQL目录结构
        - MYSQL安装目录
            - 配置文件：/etc/my.cnf
        - MYSQL数据目录
            - 几个概念
                - 数据库：文件夹
                - 数据：文件
                - 表：文件里存储的数据
                
# SQL
    - SQL全称：structured query language 表示结构化查询语言，定义了操作所有关系型数据库的规则
        - 每一种数据库操作方式都存在不一样的地方，称为“方言”，但整体大部分一致
        
    - SQL通用语法：
        - SQL语句可以单行或多行书写，以分号为结尾
        - 可使用空格和缩进来增强语句的可读性
        - MYSQL数据库的SQL语句不区分大小写，关键字建议使用大写
        - 三种注释
            - 单行注释：
                - -- 注释内容
                - # 注释内容（MYSQL特有）
            - 多行注释：
                - /* 注释内容 */
                
    - SQL分类：
        - DML：增删改表中的数据
        - DDL：操作数据库、表
        - DQL：查询表中的数据
        - DCL：数据库中授权设置
    
    
        - Data Definition Language (DDL 数据定义语言) 如:建库,建表
        - Data Manipulation Language(DML 数据操纵语言),如:对表中的记录操作增删改
        - Data Query Language(DQL 数据查询语言),如:对表中的查询操作
        - Data Control Language(DCL 数据控制语言),如:对用户权限的设置
        
            
## DDL 操作数据库、表
    - 操作数据库：CRUD
        - C（Create）：创建
            - 创建数据库
                - create database 数据库名称
            - 创建数据库且指定字符集
                - create database 数据库名称 charset 指定的字符集编码
            - 创建数据库并判断不存在，再创建
                - create database if not exists 数据库名称
            - 创建名为test数据库，判断是否存在且指定字符集为GBK
                - CREATE DATABASE if not exists test charset utf8
        - R（Retrieve）：查询
            - 查询所有数据库的名称
                - show databases;
            - 查看某个数据库的字符集：查看某个数据库的创建语句
                - show create database 数据库的名称;
        - U（Update）：修改
            - 修改数据库的字符集
                - alter database 数据库名称 charset 字符集名称
        - D (Delete)
            - 删除数据库
                - drop database 数据库名称;
            - 先判断数据库存在，再删除
                - drop database if exists 数据库名称;
        - 使用数据库
            - 查询当前正在使用的数据库名称
                - select database();
            - 使用数据库
                - use 数据库名称;
                
    - 操作表
        - C（Create）：创建
            - 语法
                - create table 表名(
                    列名1 数据类型1,
                    列名2 数据类型2,
                    ... ...
                    列名n 数据类型3
                );
                    - 注意：最后一列数据不需要添加逗号
                    
            - 数据库类型
                - int(integer)：整数类型
                    - age int,
                - double：小数类型
                    - score double(5,2)
                - date：日期类型，只包含年月日的日期
                    - yyyy-MM-dd
                - datetime：日期，包含了年月日时分秒
                    - yyyy--MM-dd HH:mm:ss
                - timestamp：时间戳类型，包含了年月日时分秒
                    - yyyy--MM-dd HH:mm:ss
                    - 如果将来不给这个字段赋值，赋值为null，则默认使用当前的系统时间来自动赋值
                - varchar：字符串类型
                    - name varchar(20)
                    - 表示了姓名最大20个字符
                    - 例如：zhangsan 八个字符，张三 两个字符，如果超出了指定的长度则会报错
            - 创建表
                - create table student(
                    id int,
                    name varchar(32),
                    age int,
                    score double(4,1),
                    birthday date,
                    insertTime timestamp
                );
                
            - 备份（复制）表
                - create table 新表名 like 原表名; 
                
                    
        - R（Retrieve）：查询
            - 查询某个数据库中所有表的名称
                - show tables;
            - 查询表结构
                - desc 表名称;
        - U（Update）：修改
        - D (Delete)：删除
            - 删除表
                - drop table 表名称;
            - 判断表存在，再删除
                - drop table if exists 表名称;
        
    - 
        