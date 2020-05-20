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
        - 响应头
        - 响应空行
        - 响应体
    - 响应字符串格式
        HTTP/1.1 200 OK
        Bdpagetype: 1
        Bdqid: 0xa777f23000001757
        Cache-Control: private
        Connection: keep-alive
        Content-Encoding: gzip
        Content-Type: text/html;charset=utf-8
        Date: Wed, 20 May 2020 10:46:00 GMT
        Expires: Wed, 20 May 2020 10:46:00 GMT
        Server: BWS/1.1
        Set-Cookie: BDSVRTM=14; path=/
        Set-Cookie: BD_HOME=1; path=/
        Set-Cookie: H_PS_PSSID=31622_1457_31325_21088_31593_31606_31464_30823_26350_22157; path=/; domain=.baidu.com
        Strict-Transport-Security: max-age=172800
        Traceid: 1589971560071404570612067380014534891351
        X-Ua-Compatible: IE=Edge,chrome=1
        Transfer-Encoding: chunked
    