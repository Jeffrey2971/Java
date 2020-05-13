# 今日内容
- JavaScript基础


## JavaScript
- 概念：一门客户端脚本语言
    - 运行在客户端浏览器中，每一个浏览器都有JavaScript的解析引擎
    - 脚本语言：不需要编译，可直接被浏览器解析执行

- 功能
    - 可以增强用户和HTML的交互过程，可以来控制HTML元素，让页面有一些动态的效果，增强用户的体验
    
    
- JavaScript发展史
    - 1992年，Nombase公司，开发处第一门客户端脚本语言，专门用户表单校验，命名为C：--，后更名为ScriptEase
    - 1995年，Netscape(网景)公司，开发了一门客户端脚本语言：LiveScript，后来请来了sum公司的专家，修改LiveScript重新命名为JavaScript
    - 1996年，微软抄袭了JavaScript开发出JScript语言
    - 1997年，ECMA(欧洲计算机制造协会)，ECMAScript，所有客户端脚本语言的标准 
        - JavaScript = ECMAScript + JavaScript自己特有的东西(BOM+DOM)

- ECMAScript：客户端脚本语言的标准
    - 基本语法
        - 与HTML的集合方式
            - 内部JS
                - 定义<script>标签，标签体内容就是js代码
            - 外部JS
                - 定义<script>标签，通过src属性引入外部的js文件
            - 注意事项
                - -<script>标签可以定义在HTML页面的任意地方，但是定义的位置会影响执行的顺序
                - -<script>标签可以定义多个
        - 注释
            - 单行注释：//注释内容
            - 多行注释：/*注释内容*/
        - 数据类型
            - 原始数据类型(基本数据类型)
                - number：数字。 整数/小数/NaN(not a number 一个不是数字的数字类型)
                - String：字符串。"abc" "abc" 'a' 'abc'
                - boolean：true和false
                - null：一个对象为空的占位符
                - undefined：未定义，如果一个变量没有给初始化值，则会被默认赋值为undefined
            - 引用数据类型：对象
        - 变量
            - 变量：一小块存储数据的空间
            - Java语言是强类型的语言，而JavaScript是弱类型语言
                - 强类型：在开辟变量存储空间时，定义了空间将来存储的数据的数据类型只能存储固定类型的数据
                - 弱类型：在开辟变量存储空间时，不定义空间将来的存储的数据类型，可以存放任意类型的数据
            - 语法
                - var 变量名 = 初始化值;
                
        - 运算符
            - 一元运算符：只有一个运算数的运算符
                - ++ -- ， +(正好) +3
                - ++ --：自增，自减
                    - ++(--)在前，先自增(自减)，再运算
                    - ++(--)在后，先自减(自增)，再运算
            - 算术运算符
                - + - * / % ...
            - 赋值运算符
                - = += -+ == %= /= ...
            - 比较运算符
                - > < >= <= == ===(全等于)
            - 逻辑运算符
                - && || !
                    - 其他类型转boolean
                        - number：0或NaN为假，其他为真
                        - string：除了空字符串其("")，他都是true
                        - null&undefined：都是false
                        - 对象：所有对象都为true
            - 三元运算符
                - 语法
                    - 表达式? 值1:值2
                    - 判断表达式的值如果是true则取值1，否则取值2
                        var a = 3; var b = 4;
                        var c = a > b ? 1:0;
                        alert(c)
        
        - 流程控制语句
            - if...else...
            - switch
                - 在Java中switch语句可以接收的数据类型：byte int shor char 枚举(1.5) String(1.7)
                    - switch(变量)
                        - case 值：
                - 在JS中，可以接收任何原始数据类型
            - while
            - do...while
            - for
        - JS特殊语法
            - 语句以;结尾，如果一行只有一条语句则;可以省略(不建议)
            - 变量的定义使用var关键字，也可以不使用
                - 用和不用的区
                    - 用：定义的变量是局部变量
                    - 不用：定义的变量是全局变量(不建议)
        
    - 基本对象
        - Function：函数对象
        - Array
        - Boolean
        - Date
        - Math
        - Number
        - String
        - RegExp
        - Global
    

- BOM

- 
    