package stage_3.Day01.chapter02.reflect02;

import stage_3.Day01.chapter02.reflect02.domain.t_Person_5;

import java.lang.reflect.Field;

public class t_Reflect_7 {
    /*
    ## Class对象功能：
    - 获取的功能：
        - 获取成员变量们
            - Field[] getFields()
            - Field	getField(String name)

            - Field[] getDeclaredFields()
            - Field	getDeclaredField(String name)
        - 获取构造方法们
            - Constructor<?>[] getConstructors()
            - Constructor<T>	getConstructor(Class<?>... parameterTypes)

            - Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
            - Constructor<?>[] getDeclaredConstructors()
        - 获取成员方法们
            - Method[] getMethods()
            - Method getMethod(String name, Class<?>... parameterTypes)

            - Method[] getDeclaredMethods()
            - Method getDeclaredMethod(String name, Class<?>... parameterTypes)

        - 获取类名
            - String getName()
     */
    public static void main(String[] args) throws Exception {
        // 0、获取Person的class对象
        Class<t_Person_5> personClass = t_Person_5.class;

        /*
            - 获取成员变量们
            - Field[] getFields()
            - Field	getField(String name)

            - Field[] getDeclaredFields()
            - Field	getDeclaredField(String name)
         */

        // Field[] getFields()：获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("-------------------------");

        // Field getField(String name)
        Field a = personClass.getField("a");
            // 获取成员变量a的值
        t_Person_5 p = new t_Person_5();
        Object value1 = a.get(p);
        System.out.println(value1);
            // 设置成员变量a的值
        a.set(p, "张雯蔚");
        System.out.println(p);
        System.out.println("-------------------------");

        // Field[] getDeclaredFields()：获取所有的成员变量，不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        // Field getDeclaredField(String name)
        Field d = personClass.getDeclaredField("d");
            // 忽略访问权限修饰符的安全检查
        d.setAccessible(true); // 暴力反射
        Object value2 = d.get(p);
        System.out.println(value2);


    }
}
