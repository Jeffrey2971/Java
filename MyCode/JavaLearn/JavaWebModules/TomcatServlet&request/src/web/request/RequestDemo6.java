package web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/*
- 获取请求参数通用方式
    - String getParameter(String name)：根据参数名称获取参数值      username=jeffrey&password=123
    - String[] getParameterValues(String name)：根据参数名称获取参数值的数组       hobby=xx&hobby=game
    - Enumeration<String> getParameterNames()：获取所有请求的参数名称
    - Map<String, String[]> getParameterMap()：获取所有参数的Map集合
 */


@WebServlet("/requestDemo6")
public class RequestDemo6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // post获取请求参数
            // 根据参数名称获取参数值
        /*String username = request.getParameter("username");
        System.out.println("post");
        System.out.println(username);*/


            // 根据参数名获取参数值的数组
        /*String[] hobbies = request.getParameterValues("hobby");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }*/
            // 获取所有请求的参数名称
        /*Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String name = parameterNames.nextElement();
            System.out.println(name);
            String value = request.getParameter(name);
            System.out.println(value);
            System.out.println("--------------------------");
        }*/

            // 获取所有参数的Map集合
        Map<String, String[]> parameterMap = request.getParameterMap();
            // 遍历
        Set<String> keyset = parameterMap.keySet();
        for (String name : keyset) {
            // 根据键获取值
            System.out.println(name);
            String[] values = parameterMap.get(name);
            for (String value : values) {
                System.out.println(value);
                System.out.println("------------------------");
            }

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request, response);


    }
}
