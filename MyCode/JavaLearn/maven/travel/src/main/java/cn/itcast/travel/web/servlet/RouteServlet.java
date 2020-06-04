package cn.itcast.travel.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet("/route/*")
public class RouteServlet extends BaseServlet {
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void pageQuery(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 接收三个参数 pageSize，currentPage，cid
        String currentPageStr = request.getParameter("currentPage");
        String PageSizeStr = request.getParameter("pageSize");
        String cidStr = request.getParameter("cid");

        int cid = 0;
        // 处理参数
        if(cidStr != null && cidStr.length() >0){ // 判断字符串是否为空和是否为空字符串
            cid = Integer.parseInt(cidStr); // 传递回来的是字符串，应该转换为int类型

        }



    }

}
