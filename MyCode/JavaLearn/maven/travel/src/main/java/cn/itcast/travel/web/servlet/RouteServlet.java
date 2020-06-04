package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.PageBean;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.service.RouteService;
import cn.itcast.travel.service.impl.RouteServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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

    private final RouteService routeService = new RouteServiceImpl();

    public void pageQuery(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 接收三个参数 pageSize，currentPage，cid
        String currentPageStr = request.getParameter("currentPage");
        String pageSizeStr = request.getParameter("pageSize");
        String cidStr = request.getParameter("cid");

        int cid = 0; // 类别id
        int currentPage = 0; // 当前的页码，如果不传递则默认为第一页
        int PageSize = 0; // 每页显示条数，如果不传递，默认每页显示5条记录
        // 处理参数
        if(cidStr != null && cidStr.length() >0){ // 判断字符串是否为空和是否为空字符串
            cid = Integer.parseInt(cidStr); // 传递回来的是字符串，应该转换为int类型
        }

        if(currentPageStr != null && currentPageStr.length() >0){ // 判断字符串是否为空和是否为空字符串
            currentPage = Integer.parseInt(currentPageStr); // 传递回来的是字符串，应该转换为int类型
        }else{
            currentPage = 1;
        }


        if(pageSizeStr != null && pageSizeStr.length() >0){ // 判断字符串是否为空和是否为空字符串
            PageSize = Integer.parseInt(pageSizeStr); // 传递回来的是字符串，应该转换为int类型
        }else{
            PageSize = 5;
        }

        // 调用Service查询PageBean对象
        PageBean<Route> pb = routeService.pageQuery(cid, currentPage, PageSize);

        // 将PageBean对象序列化为json
        writeValue(pb, response);




    }

}
