package web.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletContextDemo2")
public class ServletContextDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
         ServletContext功能
         - 功能
             - 获取MIME类型
                - MIME类型：在互联网通信过程中定义的一种文件数据类型
                    - 格式：大类型/小类型  text/html     image/jpeg
                - 获取String getMimeType(String file)  
         */
        // 通过httpServlet获取
        ServletContext context = this.getServletContext();

        // 定义文件名称
        String filename = "a.jpg";

        // 获取MiME类型
        String mimeType = context.getMimeType(filename);
        System.out.println(mimeType);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
