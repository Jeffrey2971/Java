package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class proxyTest {
    public static void main(String[] args) {
        // 创建真实对象
        Lenovo lenovo = new Lenovo();

        // 动态代理增强Lenovo对象

        /*
            三个参数：
                - 类加载器：真实对象.getClass.getClassLoader()
                - 接口数组：真实对象.getClass.getInterfaces()
                - 处理器：new InvocationHandler()
         */
        SaleComputer proxy_lenovo = (SaleComputer) Proxy.newProxyInstance(lenovo.getClass().getClassLoader(), lenovo.getClass().getInterfaces(), new InvocationHandler() {
            /*
                代理逻辑编写的方法：代理对象调用的所有方法都会出发该方法执行
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("该方法执行");
                return null;
            }
        });

        // 调用方法

        String computer = proxy_lenovo.sale(8000);
        System.out.println(computer);
    }
}
