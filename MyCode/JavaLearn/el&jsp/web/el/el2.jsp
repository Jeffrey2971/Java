<%--
  Created by IntelliJ IDEA.
  User: jeffrey
  Date: 2020/5/25
  Time: 上午1:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取域中的数据</title>
</head>
<body>
<%
    // 在域中存储数据
    request.setAttribute("name", "mable");
    session.setAttribute("age", "21");
%>

<h3>el获取值</h3>
${requestScope.name}
${sessionScope.age}
${sessionScope.hobby}

</body>
</html>
