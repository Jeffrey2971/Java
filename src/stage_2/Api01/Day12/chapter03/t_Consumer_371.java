package Api01.Day12.chapter03;

/*
    java.util.function.Consumer<T> 接口则正好与Supplier接口相反,它不是生产一个数据,而是消费一个数据,
    其数据类型由泛型决定。

    Consumer接口是一个消费性接口，泛型指定什么类型就可以使用accept方法消费什么类型的数据
    至于具体怎么消费（使用），需要自定义（输出，计算...）
 */

import java.util.function.Consumer;

public class t_Consumer_371 {
    /*
        定义一个方法，方法的参数传递一个字符串的姓名
        方法的参数传递Consumer接口，泛型使用String
        可以使用Consumer接口消费字符串的姓名
     */
    public static void method(String name, Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
        // 调用method方法，传递字符串姓名，方法的另一个参数是一个Consumer接口是一个函数式接口，可以传递lambda表达式
        method("玮海琼", (name)->{
            // 对传递的字符串进行消费
            // 消费方式：直接输出字符串
            /*System.out.println(name);*/

            // 消费方式：把字符串进行反转输出
            String reName = new StringBuffer(name).reverse().toString();
            System.out.println(reName);

        });
    }
}
