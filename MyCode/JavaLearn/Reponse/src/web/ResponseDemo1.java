package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 重定向
 */

@WebServlet("/responseDemo1")
public class ResponseDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Demo1...");
        // 访问/servletDemo1自动跳转到servletDemo2
        /*    // 1、设置状态码为302
        response.setStatus(302);
            // 2、设置响应头location
        response.setHeader("location", "/response/responseDemo2");*/

        request.setAttribute("msg","test");
        // 简化重定向方法
         response.sendRedirect("/response/responseDemo2");
        //response.sendRedirect("https://www.baidu.com");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);

    }
}
