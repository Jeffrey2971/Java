package stage_2.Api01.Day01.chapter04;

/*
    StringBuilder的常用方法：
        public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。
 */

public class t_StringBuilder_240 {
    public static void main(String[] args) {
        // 创建StringBuilder对象
        StringBuilder bu1 = new StringBuilder();

        // 使用append方法往StringBuilder中添加数据
        // append 方法返回的值this，调用方法的对象bu1, this == bu1
//        StringBuilder bu2 = bu1.append("abc"); // 把bu1的地址值赋值给了bu2
//        System.out.println(bu1);
//        System.out.println(bu2);
//        System.out.println(bu1==bu2); // 比较的是地址值

        // 使用append方法无需接收返回值
//        bu1.append("abcd");
//        bu1.append(123);
//        bu1.append(true);
//        bu1.append(3.14);
//        bu1.append('中');
//        System.out.println(bu1);

        /*
            链式编程：方法返回值是一个对象，可以继续调用方法
         */
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase());
        bu1.append("abc").append(123).append(true).append(3.14).append('中'); // 链式编程
        System.out.println(bu1);
    }
}
