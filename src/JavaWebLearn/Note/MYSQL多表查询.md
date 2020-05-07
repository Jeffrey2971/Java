# 今日内容

- 多表查询
- 事物
- DCL


## 多表查询
- 查询语法
    - select 
        列名列表
    from 
        表名列表
    where
        ... ...
    
    - 准备SQL
        
        CREATE TABLE dept(
            id INT PRIMARY KEY AUTO_INCREMENT,
            NAME VARCHAR(20)
        );
        INSERT INTO dept (NAME) VALUES ('开发部'),('市场部'),('财务部');

        CREATE TABLE emp (
            id INT PRIMARY KEY AUTO_INCREMENT,
            NAME VARCHAR(10),
            gender CHAR(1), -- 性别
            salary DOUBLE, -- 工资
            join_date DATE, -- 入职日期
            dept_id INT,
            FOREIGN KEY (dept_id) REFERENCES dept(id) -- 外键，关联部门表(部门表的主键)
        );
        
        INSERT INTO emp(NAME,gender,salary,join_date,dept_id) VALUES('孙悟空','男',7200,'2013-02-24',1);
        INSERT INTO emp(NAME,gender,salary,join_date,dept_id) VALUES('猪八戒','男',3600,'2010-12-02',2);
        INSERT INTO emp(NAME,gender,salary,join_date,dept_id) VALUES('唐僧','男',9000,'2008-08-08',2);
        INSERT INTO emp(NAME,gender,salary,join_date,dept_id) VALUES('白骨精','女',5000,'2015-10-07',3);
        INSERT INTO emp(NAME,gender,salary,join_date,dept_id) VALUES('蜘蛛精','女',4500,'2011-03-14',1);
     
     - 笛卡尔积
        - 有两个集合A和B，取这两个集合的所有组成情况
        - 要完成多表查询，需要消除无用的数据
     
    - 多表查询的分类
        - 内连接查询
            - 隐式内连接
                - 使用where条件来消除无用的数据
                - 例如：
                    SELECT
                        t1.`NAME`, -- 员工表姓名
                        t1.gender, -- 员工表性别
                        t2.`NAME` -- 部门表的名称
                      FROM
                        emp t1,
                        dept t2
                      WHERE
                        t1.dept_id = t2.id;
                        
            - 从哪些表中查询数据
            - 查询条件是什么
            - 查询哪些字段
            
            - 显式内连接
                - 语法：
                    - select 字段列表 from 表名1 inner join 表名2 on 加入的条件
                - 例如：
                    SELECT
                    	*
                    FROM
                    	emp
                    [INNER] JOIN dept ON emp.dept_id = dept.id;
                
        - 外链接查询
            - 左外连接
                - 语法：
                    - select 字段列表 from 表1 left [outer] join 表2 on 条件;
                - 查询的是左表所有数据以及其交集部分
            - 右外连接
                - 语法
                    - select 字段列表 from 表1 right [outer] join 表2 on 条件;
            - 查询的是右表所有数据以及其交集部分
        
        - 子查询
            - 概念：查询中嵌套查询，称嵌套的查询为子查询
            - 例如
                - 查询员工工资最高的信息
                    - select max(salary) from emp;
                
                - 查询员工工资等于9000
                    - select * from emp.salary = 9000;
                
                - 一条语句完成
                    - select * from emp where emp.salary = (select max(salary) from emp);
                
            - 子查询不同情况
                - 子查询的结果是单行单列的：
                    - 子查询可以作为条件，使用运算符判断。运算符：> >= < <= = 等
                    - 例如
                        - 查询员工工资小于平均工资的人
                        - select * from emp where emp.salary < (select avg(salary) from emp);
                - 子查询的结果是多行单列或单行多列的：
                    - 子查询可以作为条件，使用运算符in来判断
                    例如
                        - 查询 财务部 和 市场部 的所有员工信息
                        - select * from emp where dept_id in (select id from dept where name = "财务部" or name = "市场部");
                - 子查询的结果是多行多列的：
                    - 子查询可作为一张虚拟表参与查询
                    -例如
                        - 查询员工入职日期是2011-11-11之后的信息和部门信息
                        - 子查询
                            - select * from dept t1,(select * from emp where emp.join_date > '2011-11-11') t2 where t1.id= t2.dept_id;
                        - 普通查询
                            - select * from emp t1,dept t2 where t1.dept_id = t2.id and t1.join_date > '2011-11-11';
                        
                
            
                
