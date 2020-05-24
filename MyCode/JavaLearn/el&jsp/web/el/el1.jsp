<%--
  Created by IntelliJ IDEA.
  User: jeffrey
  Date: 2020/5/25
  Time: 上午12:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el运算符</title>
</head>
<body>

    ${3 > 4}
    \${3 > 4}

    <hr>
<h3>算术运算符</h3>
${3 + 4}<br>
${3 / 4}<br>
${3 div 4}<br>
${3 % 4}<br>
${3 mod 4}<br>
<h3>比较运算符</h3>
${3 == 4}<br>
<h3>逻辑运算符</h3>
${3>4 && 3<4}<br>
${3>4 and 3<4}<br>
<h3></h3>


</body>
</html>
