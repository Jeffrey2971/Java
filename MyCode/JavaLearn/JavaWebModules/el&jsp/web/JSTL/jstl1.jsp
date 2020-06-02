<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: jeffrey
  Date: 2020/5/25
  Time: 下午3:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>if标签</title>
</head>
<body>
<%--
- c:if标签
    - 属性：test为必须属性，接收boolean表达式，如果表达式为true则显示if标签体内容，如果为false则不显示if标签体内容
    - 一般情况下，test属性值会结合el表达式一起使用
- 注意事项
    - c:if标签没有else的情况，如需else则可以再定义一个c:if标签

--%>
<c:if test="true">
    <h1>我是真....</h1>
</c:if>
<br>
<%
    // 判断request域中的一个list集合是否为空，如果不为空则显示遍历集合
    List list = new ArrayList<>();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    request.setAttribute("list", list);
    request.setAttribute("number", 5);

%>
<c:if test="${not empty list}">
    遍历集合...
</c:if>
<br>
<c:if test="${number % 2 != 0}">
    ${number}为基数
</c:if>

<c:if test="${number % 2 == 0}">
    ${number}为偶数
</c:if>

</body>
</html>
