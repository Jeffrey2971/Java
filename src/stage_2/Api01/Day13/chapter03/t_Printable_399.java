package Api01.Day13.chapter03;

/*

 */

public class t_Printable_399 {
    // 定义一个方法，参数传递printable接口，对字符串进行打印
    public static void printString(t_Printable_398 p) {
        p.print("HelloWorld");

    }

    public static void main(String[] args) {
        // 调用PrintString方法，方法的参数printable是一个函数式接口所以可以传递lambda表达式
        printString((s) -> {
            System.out.println(s);
        });

        /*
            方法引用分析：
                lambda表达式的目的，打印传递参数的字符串
                把参数s传递给System.out对象，调用out对象中的方法println对字符串进行了输出
                注意：
                    1、system.out这个对象是已经存在的
                    2、println方法也是存在的
                所以可以使用方法引用来优化lambda表达式
                可以使用system.out方法直接引用（调用）println方法
         */
        printString(System.out::println);
    }
}
