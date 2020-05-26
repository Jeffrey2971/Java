package web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/index.jsp") // 具体资源路径：/index.jsp     只有访问index.jsp资源时，过滤器才会生效
//@WebFilter("/user/*") // 拦截目录：/user/*      访问/user下所有的资源时，过滤器都会生效
@WebFilter("*.jsp") // 后缀名拦截：*.jsp       访问所有后缀名为jsp的资源时，过滤器都会被执行
public class FilterDemo4 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("Demo4...");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
