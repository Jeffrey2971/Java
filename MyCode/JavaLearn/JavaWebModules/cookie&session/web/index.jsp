<%--
  Created by IntelliJ IDEA.
  User: jeffrey
  Date: 2020/5/22
  Time: 下午6:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>



  <%
    System.out.println("Hello, jsp");
    int i = 5;

    String contextPath = request.getContextPath();
    out.print(contextPath);
  %>

  <%!
    int i = 3;
  %>

  <%= i + "Hello" %>

  <h1>hi,jsp!</h1>
  <%
    response.getWriter().write("response...");
  %>
  </body>
</html>
