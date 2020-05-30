<%--
  Created by IntelliJ IDEA.
  User: jeffrey
  Date: 2020/5/30
  Time: 下午6:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>01-原生js实现ajax.jsp</title>
    <script>
        // 定义方法
        function fun() {
            // 创建核心对象
            var xmlhttp;
            if (window.XMLHttpRequest)
            {// code for IE7+, Firefox, Chrome, Opera, Safari
                xmlhttp=new XMLHttpRequest();
            }
            else
            {// code for IE6, IE5
                xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
            }
            // 发送请求
            /*
                参数
                    - 请求方式：GET、POST
                    - 请求的url路径
                    - 同步或异步请求
             */
            xmlhttp.open("GET","test1.txt",true);





        }
    </script>
</head>
<body>
<input type="button" value="发送异步请求" onclick="fun();">
</body>
</html>
