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
            // 建立连接
            /*
                参数
                    - 请求方式：GET、POST
                        - GET方式请求参数在url后面拼接，send()方法为空参
                        - post方式，请求参数在send()方法中定义
                    - 请求的url路径
                    - 同步或异步请求：true(异步)或false(同步)
             */
            xmlhttp.open("GET","ajaxServlet?username=mable",true);

            // 发送请求
            xmlhttp.send();

            // 接收并处理来自服务器的响应结果
            // 获取方式：xmlhttp.responseText
            // 当服务器响应成功后再获取结果
            // 当xmlhttp对象的就绪状态改变时，会触发onreadystatechange事件
            xmlhttp.onreadystatechange=function()
            {
                // 判断readyState就绪状态是否为4，判断status响应状态码是否为200
                if (xmlhttp.readyState==4 && xmlhttp.status==200)
                {
                    // 获取服务器的响应结果
                    var responseText = xmlhttp.responseText;
                    alert(responseText)
                }
            }






        }
    </script>
</head>
<body>
<input type="button" value="发送异步请求" onclick="fun();">
<input type="text">
</body>
</html>
