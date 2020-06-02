<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: jeffrey
  Date: 2020/5/25
  Time: 下午4:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>foreach标签</title>
</head>
<body>
<%--
- foreach：相当于Java代码的for语句
    - 完成重复性的操作
        for(int i = 0; i < 10; i++){
            ...
        }
    - 属性
        - begin：开始值
        - end：结束值
        - var：临时变量
        - step：步长
        - varstatus：循环状态对象
            - index：容器中元素的索引，从0开始
            - count：循环的次数，从1开始
    - 遍历容器
        List<User> list;
        for(User user : list){
            ...
        }
    - 属性
        - items：容器对象
        - var：容器中元素的临时变量
        - varstatus：循环状态对象
            - index：容器中元素的索引，从0开始
            - count：循环的次数，从1开始
--%>

<c:forEach begin="0" end="10" var="i" step="2" varStatus="s">
    ${i} <h3>${s.index}</h3> <h4>${s.count}</h4><br>

</c:forEach>
<hr>
<%
    List list = new ArrayList<>();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    request.setAttribute("list", list);
%>
<c:forEach items="${requestScope.list}" var="str" varStatus="s">
    ${s.index} ${s.count} ${str}<br>

</c:forEach>

</body>
</html>