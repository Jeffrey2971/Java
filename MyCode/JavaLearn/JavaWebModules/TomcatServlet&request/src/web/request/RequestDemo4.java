package web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * request对象获取请求头
 */

@WebServlet("/requestDemo4")
public class RequestDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取指定的请求头名称 - referer
        String referer = request.getHeader("referer");
        System.out.println(referer);

        // 防盗链
        if(referer!=null){
            if(referer.contains("/tomcat")){
                // 正常访问
                System.out.println("你好呀！");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("你好呀！");
            }else{
                // 盗链
                System.out.println("滚蛋～～");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("滚蛋！");
            }
            System.out.println("???");
        }

    }
}
