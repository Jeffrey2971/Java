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
        
        
         
        