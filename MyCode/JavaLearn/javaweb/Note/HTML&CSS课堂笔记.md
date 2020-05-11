# 今日内容
- HTML标签：表单标签

- CSS：


## HTML标签：表单标签
- 表单
    - 概念：用于采集用户输入的数据，用于和服务器进行交互
    - 使用的标签：
        - form：用于定义表单，可以定义一个范围，范围代表采集用户的数据范围
            - 属性
                - action：指定提交的数据url
                - method：指定提交方式
                    - 分类：共七中，两种较为常用
                        - get
                            - 请求参数会在地址栏中显示，会封装到请求行中(HTTP协议)
                            - 请求参数的大小有限制
                            - 不安全
                        - post：
                            - 请求参数不会在地址栏中显示，会封装在请求体中(HTTP协议)
                            - 参数的大小没有限制
                            - 较安全
            - 表单项中的数据要想被提交，必须指定其name属性
            
    - 表单项标签
        - input：可以通过type属性值，改变元素展示的样式
            - type属性：
                - text：文本输入框
                    - placeholder：指定输入框的提示信息
                - password：密码输入框
                - radio：单选框
                    - 注意事项：
                        - 要想让多个单选框实现单选的效果则多个单选框的name属性值必须一样
                        - 一般会给每一个单选框提供value属性来指定其被选中后提交的值
                        - checked属性，可以指定默认值
                - checkbox：复选框
                    - 注意
                        - 要想让多个单选框实现单选的效果则多个单选框的name属性值必须一样
                        - 一般会给每一个单选框提供value属性来指定其被选中后提交的值
                - file：文件选择框
                - hidden：隐藏域，用于提交一些信息
                - 按钮：
                    - submit：提交按钮，可以提交表单
                    - button：普通按钮
                    - image：图片提交按钮，通过src属性指定图片的路径
        - label：指定输入项的文字描述信息
            - 注意事项
                - label的for属性会和input的id属性值对应，如果对应则点击label区域，会让input输入框获取焦点
                
        - select：下拉列表
            - 子元素：option，用于指定列表项
            
        - textarea：文本域
            - cols：指定列数
            - rows：默认多少行
            
## CSS：页面梅花和布局控制
- 概念：cascading style sheets 层叠样式表
    - 层叠：多个样式可以作用在同一个HTML元素上，同时生效

- 好处：
     - 功能强大
     - 将内容的展示和样式的控制分离
        - 降低了解耦度，解耦
        - 让分工协作更容易
        - 提高开发效率

- CSS的使用：CSS于HTML的结合方式

    - 内敛样式
        - 在标签内使用style属性指定css代码
        - 不推荐使用，耦合
        - 如：<div style="color:red;">hello css</div>
        
    - 内部样式
        - 在head标签内，定义style标签，style标签的标签体内容就是CSS代码
        - 如：
            <style>
                div{
                    color:#2f2f6a;
                }
            </style>
            <div>hello css</div>
    
    - 外部样式
        - 定义css资源文件
        - 在head标签内，定义link标签引入外部资源文件
        - 如：
            a.css文件：
                div{
                    color:yellow;
                }
                
            <link rel="stylesheet" href="css/a.css">
            <div>hello css</div>
            <div>hello css</div>

    - 注意事项：
        - 1,2,3种方式，作用范围越来越大
        - 1方式不常用
        - 第三种格式可以写为：
             <style>
                 @import "css/a.css";
             </style>
             