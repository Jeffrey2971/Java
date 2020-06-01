package web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Servlet路径配置
 */
//@WebServlet({"/test4","/test5","/test6"})
//    @WebServlet("/user/test4")
//@WebServlet("/user/*")
//    @WebServlet("/*")
    @WebServlet("*.do")
public class ServletDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("test4-6");
        System.out.println(req);
    }
}
