# 今日内容
- HTTP协议：响应消息

- response对象

- ServletContext对象

## HTTP协议
- 请求消息：客户端发送给服务器端的数据
    - 数据格式
        - 请求行
        - 请求头
        - 请求空行
        - 请求体
- 响应消息：服务器端发送给客户端的数据
    - 数据格式
        - 响应行
            - 组成：协议/版本 HTTP/1.1 200 响应状态码 状态码描述
            - 响应的状态码：服务器告诉浏览器本次请求和响应的状态
                - 状态码都是三位数字
                     分类
                        - 1xx：服务器接收客户端消息，但没有接收完成，等待一段时间后发送1xx状态码
                        - 2xx：成功200
                        - 3xx：重定向，代表：302(重定向)，304(访问缓存)
                        - 4xx：客户端错误
                            - 404：请求路径没有对应的资源
                            - 405：请求方式没有对应的doXXX方法
                        - 5xx：服务器端错误，代表500(服务器内部出现异常)
        - 响应头
            - 格式：头名称:值
            - 常见的响应头
                - Content-Type：告诉客户端浏览器本次的响应体数据格式以及编码格式
                - Content-disposition：服务器告诉客户端以什么格式打开响应体数据
                    - 值
                        - in-line：默认值，在当前页面内打开
                        - attachment;filename=xxx：以附件形式打开响应体，文件下载
        - 响应空行
        - 响应体：传输的数据
    - 响应字符串格式
        HTTP/1.1 200 
        Set-Cookie: JSESSIONID=549E6DDE2390C71CB41377962379AD6D; Path=/; HttpOnly
        Content-Type: text/html;charset=UTF-8
        Content-Length: 101
        Date: Wed, 20 May 2020 13:19:08 GMT
        
        <html>
          <head>
            <title>$Title$</title>
          </head>
          <body>
          Hello，response
          </body>
        </html>
        
## Response对象
- 功能：设置响应消息
    - 设置响应行
        - 格式：HTTP/1.1 200 ok
        - 设置状态码：setStatus(int sc)
    - 设置响应头：setHeader(String name, String value)
    - 设置响应体
        - 使用步骤
            - 获取输出流
                - 字符输出流：PrintWriter getWriter()
                - 字节输出流：ServletOutputStream getOutputStream()
            - 使用输出流，将数据输出到客户端浏览器中

- 案例
    - 完成重定向
        // 访问/servletDemo1自动跳转到servletDemo2
            // 1、设置状态码为302
        response.setStatus(302);
            // 2、设置响应头location
        response.setHeader("location", "/response/responseDemo2");
        // 简化重定向方法
        response.sendRedirect("/response/responseDemo2");
        - 重定向的特点
            - 转发地址发生变化
            - 重定向可以访问其他站点的资源
            - 重定向是两次请求，不能使用request对象共享数据
        - 转发的特点
            - 转发地址栏路径不变
            - 转发只能访问当前服务器下的资源
            - 转发是一次请求，可以使用request对象共享数据
        - 路径的写法
            - 路径的分类
                - 相对路径：通过相对路径不可以确定唯一资源
                    - 如：./index.html
                    - 不以/开头，以.开头路径
                    - 规则：找到访问的当前资源和目标资源之间的相对位置关系
                        - ./当前目录
                        - ../后退一级目录
                - 绝对路径：通过绝对路径可以确定唯一资源
                    - 如：http://localhost:8080/response/responseDemo2
                    - 以/开头的路径
                    
                
    - 服务器输出字符数据到浏览器
    - 服务器输出字节数据到浏览器
    - 验证码