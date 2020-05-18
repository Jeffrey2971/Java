# 今日内容：
- Servlet
- HTTP协议
- Request




## Servlet：
- 概念
- 步骤
- 执行原理
- 生命周期
- Servlet3.0 注解配置
- Servlet的体系结构	
    Servlet -- 接口
        |
    GenericServlet -- 抽象类
        |
    HttpServlet  -- 抽象类

    - GenericServlet：将Servlet接口中其他的方法做了默认空实现，只将service()方法作为抽象
        - 将来定义Servlet类时，可以继承GenericServlet，实现service()方法即可

    - HttpServlet：对http协议的一种封装，简化操作
        - 定义类继承HttpServlet
        - 复写doGet/doPost方法
	
	- Servlet相关配置
		- urlpattern:Servlet访问路径
			- 一个Servlet可以定义多个访问路径 ： @WebServlet({"/d4","/dd4","/ddd4"})
			- 路径定义规则：
				- /xxx：路径匹配
				- /xxx/xxx:多层路径，目录结构
				- *.do：扩展名匹配

## HTTP：
- 概念：Hyper Text Transfer Protocol 超文本传输协议
    - 传输协议：定义了，客户端和服务器端通信时，发送数据的格式
    - 特点：
        - 基于TCP/IP的高级协议
        - 默认端口号:80
        - 基于请求/响应模型的:一次请求对应一次响应
        - 无状态的：每次请求之间相互独立，不能交互数据
- 历史版本：
        - 1.0：每一次请求都会建立新的连接
        - 1.1：复用连接
    - 请求消息数据格式
        - 请求行
            - 请求方式 请求url 请求协议/版本
            - 请求方式
                - http协议有七中请求方式，常用的有两种
                    - GET
                        - 请求参数在请求行中，在url后
                        - 请求的url长度是有限制
                        - 不太安全
                    - POST
                        - 请求参数在请求体中
                        - 请求的url长度没有限制
                        - 较为安全
        - 请求头：客户端浏览器告诉服务器一些信息
            - 请求头名称：请求头值
            - 常见的请求头
                - User-Agent：浏览器告诉服务器，当前使用浏览器的版本信息
                    - 可以再服务器端获取该头的信息，解决浏览器的兼容性问题
                - Accept：告诉服务器，当前浏览器可以解析什么类型的文件
                - Accept-Language：告诉服务器，当前浏览器可以解析什么语言
                - Accept-Encoding：告诉浏览器，当前浏览器支持的压缩格式
                - Referer：告诉服务器，当前请求从哪里来
                    - 作用
                        - 防盗链
                        - 统计工作
                - Connection：连接状态
        - 请求空行
            - 空行，用于分割post请求的请求头和请求体
        - 请求体(正文)
            - GET请求没有
            - 封装post请求消息的请求参数
    - 响应消息数据格式



## Request

- request和response对象的原理
  - request和response对象是由服务器创建的，可以直接使用
  - request对象是用于获取请求信息的而reponse对象是用于设置相应消息
- request继承体系结构
  - servleRequest               --- 接口
    - |		继承
  - HttpServletRequest   --- 接口
    - |		继承
  - org.apache.catalina.connector.RequestFacade@3753b7b7 类 (tomcat)
- request：获取请求消息