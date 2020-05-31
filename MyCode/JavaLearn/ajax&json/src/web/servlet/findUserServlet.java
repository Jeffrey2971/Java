package web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/findUserServlet")
public class findUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置编码
        response.setContentType("application/json;charset=utf-8"); // 设置响应的数据格式为json
        // 获取用户名
        String username = request.getParameter("username");
        System.out.println("username：" + username);
        // 调用service层判断用户名是否存在
        // 期望服务器响应回的数据格式：{"userExist":true, "msg":"用户已存在"}
        // {"userExist":false, "msg":"用户可用"}
        Map<String, Object> map = new HashMap<String, Object>();
        if("tom".equals(username)){
            // 存在
            map.put("userExist", true);
            map.put("msg", "用户已存在");

        }else{
            // 不能在
            map.put("userExist", false);
            map.put("msg", "用户名可用");
        }

        // 将map转换为json并且传递给客户端
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getWriter(), map);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
