package stage_3.Day01.chapter02.reflect02;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 框架类
 */

public class t_ReflectTest_10 {
    public static void main(String[] args) throws Exception {
        // 可以执行创建任意类的对象，可以执行任意方法
            /*
                前提：不能改变该类的任何代码，可以执行创建任意类的对象，可以执行任意方法
             */
        /*t_Person_5 p = new t_Person_5();
        p.eat();*/
        /*t_Student_6 stu = new t_Student_6();
        stu.sleep();*/

        // 1、加载配置文件
            // 1.1创建Properties对象
        Properties pro = new Properties();

        // 1.2、加载配置文件，转换为一个集合
            // 1.2.1获取class目录下的配置文件
        ClassLoader classLoader = t_ReflectTest_10.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("MyCode/JavaLearn/stage_3/config.properties");
        pro.load(is);

        // 2、获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

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
