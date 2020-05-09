package stage_3.Day01.chapter02.reflect02;

import stage_3.Day01.chapter02.reflect02.domain.t_Person_5;

import java.lang.reflect.Method;

public class t_Reflect_9 {
    /*
    ## Class对象功能：
        - 获取成员方法们
            - Method[] getMethods()
            - Method getMethod(String name, Class<?>... parameterTypes)

            - Method[] getDeclaredMethods()
            - Method getDeclaredMethod(String name, Class<?>... parameterTypes)
     */
    public static void main(String[] args) throws Exception {
        // 0、获取Person的class对象
        Class<t_Person_5> personClass = t_Person_5.class;

        /*
            - 获取成员方法们
            - Method[] getMethods()
            - Method getMethod(String name, Class<?>... parameterTypes)

            - Method[] getDeclaredMethods()
            - Method getDeclaredMethod(String name, Class<?>... parameterTypes)
         */

        // 获取指定名称的方法
        Method eatMethod1 = personClass.getMethod("eat");

        t_Person_5 p = new t_Person_5();
        // 执行方法
        eatMethod1.invoke(p);

        Method eatMethod2 = personClass.getMethod("eat", String.class);
        // 执行方法
        eatMethod2.invoke(p, "饭");

        System.out.println("--------------------------");

        // 获取所有public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println("--------");
            System.out.println(name);
            // method.setAccessible(true);
        }

        System.out.println("--------------------");
        // 获取类名
        String className = personClass.getName();
        System.out.println(className);


    }
}
