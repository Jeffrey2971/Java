package web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * request对象获取请求头
 */

@WebServlet("/requestDemo3")
public class RequestDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
        - 方法
            - (*) String getHeader(String name)：通过请求头的名称获取请求头的值
            - Enumeration<String> getHeaderNames()：获取所有的请求头名称
         */

        // 获取指定的请求头名称 - user-agent
        String agent = request.getHeader("user-agent");
        // 判断agent的浏览器版本
        if(agent.contains("Chrome")){
            // 谷歌浏览器
            System.out.println("谷歌浏览器");
        }else if(agent.contains("Firefox")){
            // 火狐浏览器
            System.out.println("火狐浏览器");
        }

    }
}
