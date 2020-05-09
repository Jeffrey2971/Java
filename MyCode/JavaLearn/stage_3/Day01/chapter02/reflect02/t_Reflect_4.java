package stage_3.Day01.chapter02.reflect02;

import stage_3.Day01.chapter02.reflect02.domain.t_Person_5;
import stage_3.Day01.chapter02.reflect02.domain.t_Student_6;

public class t_Reflect_4 {
    /*
        - 获取Class对象的方式：
            - Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
            - 类名.class：通过类名的属性class获取
            - 对象.getClass()：getClass()在Object中定义着
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // 1、Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
        Class<?> cls1 = Class.forName("stage_3.Day01.chapter02.reflect02.domain.t_Person_5");
        System.out.println(cls1);

        // 2、类名.class：通过类名的属性class获取
        Class<t_Person_5> cls2 = t_Person_5.class;
        System.out.println(cls2);

        // 对象.getClass()：getClass()在Object中定义着
        t_Person_5 p = new t_Person_5();
        Class<? extends t_Person_5> cls3 = p.getClass();
        System.out.println(cls3);

        // == 比较三个对象
        System.out.println(cls1 == cls2); // == 比较内存地址
        System.out.println(cls1 == cls3);

        Class<t_Student_6> c = t_Student_6.class;
        System.out.println(c == cls1); // false
    }
}
