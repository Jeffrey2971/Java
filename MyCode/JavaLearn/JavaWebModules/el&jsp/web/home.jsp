<%--
  Created by IntelliJ IDEA.
  User: jeffrey
  Date: 2020/5/24
  Time: 下午10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="top.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--
<h3>Hello</h3>
-->
<h3>主体信息</h3>

<%--
<%
    System.out.println("hi");
%>
--%>

<%--<input type="text">--%>

<%
        pageContext.setAttribute("msg", "hello");
        pageContext.
%>

<%=pageContext.getAttribute("msg")%>


</body>
</html>
