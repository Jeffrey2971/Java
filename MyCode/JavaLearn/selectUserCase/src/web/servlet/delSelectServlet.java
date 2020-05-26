package web.servlet;

import org.apache.commons.beanutils.BeanUtils;
import servlet.UserServlet;
import servlet.impl.UserServletImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delSelectedServlet")
public class delSelectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取所有的id
        String[] ids = request.getParameterValues("uid");
        // 调用Servlet删除
        UserServlet servlet = new UserServletImpl();
        servlet.delSelectUser(ids);
        // 跳转到查询所有的Servlet
        response.sendRedirect(request.getContextPath() + "/findUserByPageServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
