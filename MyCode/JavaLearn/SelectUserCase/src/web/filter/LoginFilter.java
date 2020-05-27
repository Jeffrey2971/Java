package web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println(req);
        // 强制转换
        HttpServletRequest request = (HttpServletRequest) req;
        // 获取请求资源路径
        String uri = request.getRequestURI();
        // 判断是否包含登录相关资源，需注意排除css/js/图片/验证码等资源
        if (uri.contains("/login.jsp") || uri.contains("/loginServlet") || uri.contains("/checkCodeServlet") || uri.contains("/css/") || uri.contains("/fonts/") || uri.contains("/js/")) {
            // 包含，证明用户需要登录，放行
            chain.doFilter(req, resp);

        }else{
            // 不是登录，需要验证用户是否登录
            // 从session中获取
            Object user = request.getSession().getAttribute("user");
            if(user != null){
                // 已登陆过
                chain.doFilter(req, resp);

            }else{
                // 没有登录，跳转到登录页面
                request.setAttribute("login_msg", "请先登录");
                request.getRequestDispatcher("/login.jsp").forward(request,resp);
            }
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
