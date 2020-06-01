package web.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet("/ServletContextDemo5")
public class ServletContextDemo5 extends HttpServlet {
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
        ServletContext context = request.getServletContext();

        // 获取文件的服务器路径
        String realPath = context.getRealPath("/WEB-INF/b.txt");  // 对应web目录下资源访问b.txt
        System.out.println(realPath);
        // File file = new File(realPath);
        String c = context.getRealPath("/WEB-INF/c.txt");  // 对应web目录下资源访问c.txt
        System.out.println(c);
        String a = context.getRealPath("/WEB-INF/classes/a.txt");  // src目录下的资源访问
        System.out.println(a);






    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
