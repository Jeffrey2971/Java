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
        - 响应空行
        - 响应体
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
‘

    