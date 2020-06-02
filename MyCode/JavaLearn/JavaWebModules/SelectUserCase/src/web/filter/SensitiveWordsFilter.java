package web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;

/**
 * 敏感词汇过滤
 */

@WebFilter("/*")
public class SensitiveWordsFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(final ServletRequest req, final ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        // 创建代理对象，增强Parameter方法
        ServletRequest proxy_req = (ServletRequest) Proxy.newProxyInstance(req.getClass().getClassLoader(), req.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                /*if(method.getName().equals("getParameter")){
                    // 增强返回值
                    String value = (String) method.invoke(req, args);
                    if(value!=null){
                        for (String str : list) {
                            if(value.contains(str)){
                                value = value.replaceAll(str, "***");
                            }
                        }
                    }
                    return value;
                }*/

                if(method.getName().equals("getParameterMap")){
                    Map map = (Map) method.invoke(req, args);
                    Set keySet = map.keySet();
                    for (Object values : keySet) {
                        String[] value = (String[]) map.get(values);
                        for (String str : value) {
                            System.out.println("str===" + str);

                        }
                    }

                }

                return method.invoke(req, args);
            }
        });
        // 放行
        chain.doFilter(proxy_req, resp);
    }

    private List<String> list = new ArrayList<String>(); // 敏感词汇
    public void init(FilterConfig config) throws ServletException {
        try {
            // 获取文件的真实
            String realPath = config.getServletContext().getRealPath("/WEB-INF/classes/敏感词汇.txt");
            BufferedReader br = new BufferedReader(new FileReader(realPath));
            // 读取文件
            String line = null;
            while ((line = br.readLine()) != null){
                list.add(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 将文件每一行的数据添加到list中
    }

}
