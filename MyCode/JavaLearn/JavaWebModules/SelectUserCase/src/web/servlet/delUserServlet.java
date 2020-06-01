package web.servlet;

import servlet.UserServlet;
import servlet.impl.UserServletImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteUserServlet")
public class delUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取参数
        String id = request.getParameter("id");
        // 调用service删除
        UserServlet service = new UserServletImpl();
        service.deleteUser(id);
        // 跳转到查询所有的servlet
        response.sendRedirect(request.getContextPath() + "/userListServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
