package web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@WebServlet("/testServlet")
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*String name = request.getParameter("name");
        String msg = request.getParameter("msg");
        System.out.println(name + "：" + msg);*/

        Map<String, String[]> map = request.getParameterMap();
        Set<String> keySet = map.keySet();
        for (String values : keySet) {
            String[] value = map.get(values);
            for (String str : value) {
                System.out.println(str);

            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
