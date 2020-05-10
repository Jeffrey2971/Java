package stage_3.Day01.chapter02.reflect02.demo;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * 简单的测试框架
 * 当主方法执行后，会自动被检测的所有方法（加上@check注解的方法），判断方法是否有异常，记录到文件中
 */

public class t_TestCheck_25 {
    public static void main(String[] args) throws IOException {
        // 1、创建计算器对象
        t_Calculator_23 c = new t_Calculator_23();

        // 2、获取字节码文件对象
        Class<? extends t_Calculator_23> cls = c.getClass();
        // 3、获取所有的方法
        Method[] methods = cls.getMethods();
        int number = 0; // 出现异常的次数
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
            // 4、判断方法上是否有check注解
            if (method.isAnnotationPresent(t_Check_24.class)) {
                // 5、有：执行方法
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    // 6、捕获异常，记录到文件中
                    number++;
                    bw.write(method.getName() + "方法出异常了");
                    bw.newLine();
                    bw.write("异常的名称：" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因：" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("-------------------------------");
                }
            }

        }

        bw.write("本次检查结束，" + "共出现了" + number + "次异常");
        bw.newLine();
        bw.flush();
        bw.close();

    }
}