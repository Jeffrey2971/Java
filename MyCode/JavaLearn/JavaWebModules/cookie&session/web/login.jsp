<%--
  Created by IntelliJ IDEA.
  User: jeffrey
  Date: 2020/5/23
  Time: 下午8:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <script>
        window.onload = function(){
            document.getElementById("img").onclick = function(){
                this.src = "/cookie/checkCodeServlet?time=" + new Date().getTime();
            }
        }
    </script>
    <style>
        div{
            color:red;
        }
    </style>
</head>
<body>
<form action="/cookie/loginServlet" method="post">
    <table>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>验证码</td>
            <td><input type="text" name="checkCode"></td>
        </tr>
        <tr>
            <td colspan="2"><img src="/cookie/checkCodeServlet" alt="code" id="img"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录"></td>
        </tr>

    </table>

    <%--  使用el表达式  --%>
    ${requestScope.checkCode_error}
    ${requestScope.login_error}

    <%--<div><%=request.getAttribute("checkCode_error") == null ? "" : request.getAttribute("checkCode_error")%></div>
    <div><%=request.getAttribute("login_error") == null ? "" : request.getAttribute("login_error")%></div>--%>

</form>
</body>
</html>
