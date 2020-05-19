package web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/*
- 获取请求参数通用方式
    - String getParameter(String name)：根据参数名称获取参数值      username=jeffrey&password=123
    - String[] getParameterValues(String name)：根据参数名称获取参数值的数组       hobby=xx&hobby=game
    - Enumeration<String> getParameterNames()：获取所有请求的参数名称
    - Map<String, String[]> getParameterMap()：获取所有参数的Map集合
 */


@WebServlet("/requestDemo7")
public class RequestDemo7 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置流的编码
        request.setCharacterEncoding("utf-8");
        // 获取请求参数username
        String username = request.getParameter("username");
        System.out.println(username);

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request, response);


    }
}
