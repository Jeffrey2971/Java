<%--
  Created by IntelliJ IDEA.
  User: jeffrey
  Date: 2020/5/25
  Time: 上午2:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el的隐式对象</title>
</head>
<body>
${pageContext.request}<br>
<h4>在JSP页面动态获取虚拟目录</h4>
${pageContext.request.contextPath}<br>

<%--<%--%>
<%--    response.sendRedirect(request.getContextPath() + "");--%>
<%--%>--%>
</body>
</html>
