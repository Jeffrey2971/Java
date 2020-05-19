package web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
- 获取请求参数通用方式
    - String getParameter(String name)：根据参数名称获取参数值      username=jeffrey&password=123
    - String[] getParameterValues(String name)：根据参数名称获取参数值的数组       hobby=xx&hobby=game
    - Enumeration<String> getParameterNames()：获取所有请求的参数名称
    - Map<String, String[]> getParameterMap()：获取所有参数的Map集合
 */


@WebServlet("/requestDemo9")
public class RequestDemo9 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("requestDemo9被访问了");


    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request, response);


    }
}
