package cookie;



/*
- 案例：记住上一次的访问时间
    - 案例需求：
      	1. 访问一个Servlet，如果是第一次访问，则提示：您好，欢迎您首次访问。
      	2. 如果不是第一次访问，则提示：欢迎回来，您上次访问时间为:显示时间字符串
    - 分析
        - 可以采用cookie来完成
        - 在服务器中的Servlet中判断是否有一个名为lastTime的cookie
            - 有：不是第一次访问
                - 相应数据：欢迎回来，您上次的访问时间为：时间
                - 写回cookie：更新时间k
            - 没有：是第一次访问
                - 相应数据：您好，欢迎您首次访问。
                - 写回cookie:lastTime = 时间
 */

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/cookieCase")
public class CookieCase extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应消息体的数据格式以及编码
        response.setContentType("text/html;charset=utf-8");
        // 1、获取所有的cookie
        Cookie[] cookies = request.getCookies();
        boolean flag = false; // 代表没有cookie为lastTime
        // 2、遍历cookie数组
        if(cookies!=null && cookies.length > 0){
            for (Cookie cookie : cookies) {
                // 3、获取cookie的名称
                String name = cookie.getName();
                // 4、判断名称是否为lastTime
                if("lastTime".equals(name)){
                    // 存在该cookie，不是第一次访问
                    flag = true; // 有lastTime的cookie
                        // 设置cookie的value
                            // 获取当前时间的字符串，重新设置cookie的值并发送cookie
                    Date date  = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String str_date = sdf.format(date);
                    System.out.println("编码之前" + str_date);
                        // URL编码
                    str_date = URLEncoder.encode(str_date, "utf-8");
                    System.out.println("编码之后" + str_date);
                    cookie.setValue(str_date);
                    // 设置cookie的存活时间
                    cookie.setMaxAge(60 * 60 * 24 * 30); // 一个月
                    String value = cookie.getValue();
                        // URL解码
                    System.out.println("解码之前" + value);
                    value = URLDecoder.decode(value, "utf-8");
                    System.out.println("解码之后" + value);
                    // 响应数据，获取cookie的value时间
                    response.getWriter().write("<h1>欢迎回来，您上次访问的时间为：" + value + "</h1>");
                    response.addCookie(cookie);
                    break;
                }

            }
        }
        if(cookies == null || cookies.length == 0 || flag == false){
            // 没有cookie，第一次访问
            Date date  = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String str_date = sdf.format(date);
            System.out.println("编码之前" + str_date);
            // URL编码
            str_date = URLEncoder.encode(str_date, "utf-8");
            System.out.println("编码之后" + str_date);
            Cookie cookie = new Cookie("lastTime", str_date);
            cookie.setValue(str_date);
            // 设置cookie的存活时间
            cookie.setMaxAge(60 * 60 * 24 * 30); // 一个月
            response.addCookie(cookie);

            response.getWriter().write("<h1>您好，欢迎您首次访问。</h1>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
