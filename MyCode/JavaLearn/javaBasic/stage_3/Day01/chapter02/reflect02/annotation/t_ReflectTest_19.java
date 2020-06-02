package stage_3.Day01.chapter02.reflect02.annotation;

import java.lang.reflect.Method;

/**
 * 框架类
 */

@t_Pro_20(className = "JavaWebLearn.Day01.chapter02.reflect02.annotation.t_Test_21", methodName = "show")
public class t_ReflectTest_19 {
    public static void main(String[] args) throws Exception {
        // 可以执行创建任意类的对象，可以执行任意方法
            /*
                前提：不能改变该类的任何代码，可以执行创建任意类的对象，可以执行任意方法
             */
        // 1、解析注解
            // 1.1获取该类的字节码文件对象
        Class<t_ReflectTest_19> t_reflectTest = t_ReflectTest_19.class;
        // 2、获取上面的注解对象
        // 其实就是在内存中去生成了一个该注解接口的子类实现对象
        t_Pro_20 annotation = t_reflectTest.getAnnotation(t_Pro_20.class);
        // 3、调用注解对象中定义的抽象方法，获取返回值
        String className = annotation.className();
        String methodName = annotation.methodName();
        System.out.println(className);
        System.out.println(methodName);

        // 3、加载该类进入内存
        Class<?> cls = Class.forName(className);

        // 4、创建对象
        Object obj = cls.newInstance();

        // 5、获取方法对象
        Method method = cls.getMethod(methodName);

        // 6、执行方法
        method.invoke(obj);
    }
}
