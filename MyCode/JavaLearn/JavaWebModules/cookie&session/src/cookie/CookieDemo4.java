package cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
Cookie快速入门
 */

@WebServlet("/cookieDemo4")
public class CookieDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 创建Cookie对象
        Cookie c1 = new Cookie("msg", "setMaxAge");
        // 设置cookie的存活时间
        // c1.setMaxAge(30); // 将cookie持久化到硬盘，30秒后自动销毁cookie文件
        // c1.setMaxAge(-1); 关闭浏览器后销毁
        // c1.setMaxAge(300);
        c1.setMaxAge(0);
        // 发送cookie
        response.addCookie(c1);




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
