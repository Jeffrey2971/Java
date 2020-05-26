package web.servlet;

import domain.PageBean;
import domain.User;
import servlet.UserServlet;
import servlet.impl.UserServletImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/findUserByPageServlet")
public class findUserByPageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取参数
        String currentPage = request.getParameter("currentPage"); // 当前页码
        String rows = request.getParameter("rows"); // 每页显示的条目

        if(currentPage == null || "".equals(currentPage)){
            currentPage = "1";
        }
        if (rows == null || "".equals(rows)){
            rows = "5";
        }


        // 调用Servlet查询
        UserServlet servlet = new UserServletImpl();
        PageBean<User> pb = servlet.findUserByPage(currentPage ,rows);

        // 将PageBean存入request
        request.setAttribute("pb", pb);

        System.out.println(pb);

        // 转发到list.jsp
        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
