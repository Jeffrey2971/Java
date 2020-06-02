package stage_3.Day01.chapter02.reflect02;

import stage_3.Day01.chapter02.reflect02.domain.t_Person_5;

import java.lang.reflect.Constructor;

public class t_Reflect_8 {
    /*
    ## Class对象功能：
        - 获取构造方法们
            - Constructor<?>[] getConstructors()
            - Constructor<T>	getConstructor(Class<?>... parameterTypes)

            - Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
            - Constructor<?>[] getDeclaredConstructors()
     */
    public static void main(String[] args) throws Exception {
        // 0、获取Person的class对象
        Class<t_Person_5> personClass = t_Person_5.class;

        /*
            - 获取构造方法们
            - Constructor<?>[] getConstructors()
            - Constructor<T>	getConstructor(Class<?>... parameterTypes)

            - Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
            - Constructor<?>[] getDeclaredConstructors()
         */

        // Constructor<T> getConstructor(Class<?>... parameterTypes)
        Constructor<t_Person_5> constructor1 = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor1);
        // 创建对象
        t_Person_5 person1 = constructor1.newInstance("张雯蔚", 23);
        System.out.println(person1);

        System.out.println("-------------------------");
        Constructor<t_Person_5> constructor2 = personClass.getConstructor();
        System.out.println(constructor2);
        // 创建对象
        t_Person_5 person2 = constructor2.newInstance();
        System.out.println(person2);

        t_Person_5 obj = personClass.getDeclaredConstructor().newInstance();
        System.out.println(obj);

        constructor2.setAccessible(true);
        System.out.println(person2);


    }
}
