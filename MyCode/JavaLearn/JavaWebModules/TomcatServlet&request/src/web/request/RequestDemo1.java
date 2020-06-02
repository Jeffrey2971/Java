package web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * request对象获取请求行数据
 */

@WebServlet("/requestDemo1")
public class RequestDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
        - 获取请求方式：GET
            - String GetMethod()
            - * 获取虚拟目录：/test4
                - String GetContextPath()
            - 获取Servlet路径：/demo1
                - String ServletPath()
            - 获取get方式的请求参数：name=mable
                - String getQueryString()
            - * 获取请求uri：/test4/demo1
                - String getRequestURI()
                - StringBuffer getRequestURL()：http://localhost/test4/demo1
            - 获取协议及版本：HTTP/1.1
                - String getProtocol()
            - 获取客户机的ip地址
                - String getRemoteAddr()
         */

        // 获取请求方式
        String method = request.getMethod();
        System.out.println(method);

        // 获取虚拟目录
        String contextPath = request.getContextPath();
        System.out.println(contextPath);

        // 获取Servlet路径
        String servletPath = request.getServletPath();
        System.out.println(servletPath);

        // 获取get方式的请求参数
        String queryString = request.getQueryString();
        System.out.println(queryString);

        // 获取请求uri
        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURI);
        System.out.println(requestURL);

        // 获取协议及版本：HTTP/1.1
        String protocol = request.getProtocol();
        System.out.println(protocol);

        // 获取客户机的ip地址
        System.out.println(request.getRemoteAddr());


    }
}
