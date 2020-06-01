package web.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/test2")
public class ServletDemo2 extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("test2.......");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init... ...");
    }
}
