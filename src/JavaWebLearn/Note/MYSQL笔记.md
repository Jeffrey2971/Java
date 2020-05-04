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
    

    - 其它文件默认位置
        - /usr/bin                  客户端程序和脚本  
        - /usr/sbin                 mysqld 服务器  
        - /var/lib/mysql            日志文件，数据库  ［重点要知道这个］  
        - /usr/share/doc/packages   文档  
        - /usr/include/mysql        包含( 头) 文件  
        - /usr/lib/mysql            库  
        - /usr/share/mysql          错误消息和字符集文件  
        - /usr/share/sql-bench      基准程序  
         
        