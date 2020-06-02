<%--
  Created by IntelliJ IDEA.
  User: jeffrey
  Date: 2020/5/31
  Time: 下午9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="js/jquery-3.3.1.min.js"></script>
    <script>
      $(function () {
        // 发送ajax请求加载所有省份的数据
        $.get("findProvinceServlet",{}, function (data) {
          // JSON：[{"id":1,"name":"北京"},{"id":2,"name":"上海"},{"id":3,"name":"广州"},{"id":4,"name":"深圳"},{"id":5,"name":"龙岗"}]
          // 获取select
          var province = $("#province");

          // 遍历json数组
          $(data).each(function () {
            // 创建一个option标签
            var option = "<option name='"+ this.id +"'>"+ this.name +"</option>"
            // 调用select的append追加option
            province.append(option);

          })


        } )

      })
    </script>
  </head>
  <body>
  <select name="" id="province">
    <option value="">---请选择省份---</option>
  </select>
  </body>
</html>
