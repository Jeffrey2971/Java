<%@ page import="domain.User" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: jeffrey
  Date: 2020/5/25
  Time: 上午1:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取数据</title>
</head>
<body>
<%
    User user = new User();
    user.setName("雯雯");
    user.setAge(21);
    user.setBirthday(new Date());

    request.setAttribute("u", user);

    List list = new ArrayList();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add(user);

    request.setAttribute("list", list);

    Map map = new HashMap<>();
    map.put("sname", "雯雯");
    map.put("gender", "女");
    map.put("user", user);
    request.setAttribute("map", map);

%>

<h3>el获取对象中的值</h3>
${requestScope.u}<br>

<%--
- 通过的是对象的属性来获取
    - setter或getter方法，去掉set或get后在将首字母转换为小写
    - setName --> Name --> name
z
--%>
${requestScope.u.name}<br>
${requestScope.u.age}<br>
${requestScope.u.birthday}<br>
${requestScope.u.birthday.month + 1}<br>
${u.birStr}<br>
<br>
<h3>el获取获取List的值</h3>
${list}<br>
${list[0]}<br>
${list[1]}<br>
${list[2]}<br>
${list[3]}<br>
${list[4]}<br>

${list[3].name}
${list[3].age}
${list[3].birthday}

<h3>el获取获取Map的值</h3>
${map}<br>
${map.gender}<br>
${map["sname"]}<br>
${map.user}<br>
${map.user.name}<br>

</body>
</html>
