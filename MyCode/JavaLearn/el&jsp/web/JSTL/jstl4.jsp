<%@ page import="domain.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: jeffrey
  Date: 2020/5/25
  Time: 下午4:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>练习</title>
</head>
<body>

<%
    List list = new ArrayList();
    list.add(new User("雯雯", 23, new Date()));
    list.add(new User("mable", 21, new Date()));
    list.add(new User("啵啵", 25, new Date()));
    request.setAttribute("list", list);
%>

<table border="1" width="500" align="center">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>生日</th>
    </tr>
    <%--    数据行--%>
    <c:forEach items="${list}" var="user" varStatus="s">
        <c:if test="${s.count  % 2 == 0}">
            <tr bgcolor="#ffc0cb">
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.birStr}</td>
            </tr>
        </c:if>

        <c:if test="${s.count% 2 != 0}">
            <tr bgcolor="blue">
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.birStr}</td>
            </tr>
        </c:if>


    </c:forEach>
</table>


</body>
</html>
