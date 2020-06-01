package web.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletContextDemo1")
public class ServletContextDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
         ServletContext对象的获取
         - 获取
            - 通过request对象获取
                request.getServletContext();
            - 通过httpServlet获取
                this.getServletContext();
         */

        // 通过request对象获取
        ServletContext context1 = request.getServletContext();

        // 通过httpServlet获取
        ServletContext context2 = this.getServletContext();

        System.out.println(context1);
        System.out.println(context2);
        System.out.println(context1 == context2); // true


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
