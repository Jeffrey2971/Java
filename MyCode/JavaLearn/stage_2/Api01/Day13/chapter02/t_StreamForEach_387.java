package Api01.Day13.chapter02;

/*
    Stream流中的常用方法foreach
    void forEach(Consumer<? super T> action);
    该方法接收一个Consumer接口函数，会将每一个流元素交给该函数进行处理
    Consumer接口是一个消费型的函数式接口所以可以传递lambda表达式消费数据

    forEach方法就是用来遍历流中的数据，是一个终结的方法，使用之后就不能继续调用Stream流中的其他方法

 */

import java.util.stream.Stream;

public class t_StreamForEach_387 {
    public static void main(String[] args) {
        // 获取Stream流
        Stream<String> stream = Stream.of("张雯蔚", "玮海琼", "洪泽飞");
        // 使用Stream流中的方法foreach对Stream流中的数据进行遍历
//        stream.forEach((String name)->{
//            System.out.println(name);
//        });
        stream.forEach (System.out::println);
    }
}
