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
            三个参数
                - 类加载器：真实对象.getClass().getClassLoader()
                - 接口数组：真实对象.getClass().getInterfaces()
                - 处理器：new InvocationHandler()

         */

        saleComputer proxy_lenovo = (saleComputer) Proxy.newProxyInstance(lenovo.getClass().getClassLoader(), lenovo.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });


        // 调用方法
        String computer = lenovo.sale(9000);
        System.out.println(computer);
    }
}
