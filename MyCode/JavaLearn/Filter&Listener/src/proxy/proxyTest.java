package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class proxyTest {
    public static void main(String[] args) {
        // 创建真实对象
        final Lenovo lenovo = new Lenovo();

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
                    - 参数
                        - proxy：代理对象
                        - method：代理对象调用的方法，北封装为的对象
                        - args：方法执行时，传递的实际参数
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                /*System.out.println("该方法执行");
                System.out.println(method.getName());
                System.out.println(args[0]);*/


                // 判断是否是sale方法
                if (method.getName().equals("sale")) {
                    // 增强参数
                    double money = (double) args[0];
                    money = money * 0.85;
                    System.out.println("专车接送");
                    // 使用真实对象调用该方法
                    String obj = (String) method.invoke(lenovo, money);
                    System.out.println("免费送货");
                    // 增强返回值

                    return obj + "_鼠标垫";
                }else{
                    Object obj = method.invoke(lenovo, args);
                    return obj;
                }

            }
        });

        // 调用方法

        String computer = proxy_lenovo.sale(8000);
        System.out.println(computer);
//        proxy_lenovo.show();
    }
}
