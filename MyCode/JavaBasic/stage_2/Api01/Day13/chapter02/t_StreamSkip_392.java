package Api01.Day13.chapter02;

/*
    Stream流中的常用方法skip：用于跳过元素
    如果希望跳过前面几个元素，可以使用skip方法获取一个截取之后的新流：
    Stream<T> skip (long n);
        如果流当前的长度大于n,则跳过前n个，否则将会得到一个长度为零的空流
 */

import java.util.stream.Stream;

public class t_StreamSkip_392 {
    public static void main(String[] args) {
        // 获取一个Stream流
        String[] array = {"张雯蔚", "玮海琼", "陈禧", "洪泽飞", "张冰冰"};
        Stream<String> stream = Stream.of(array);
        // 使用skip方法跳过前三个元素
        Stream<String> stream2 = stream.skip(3);
        // 遍历stream2
        stream2.forEach(name -> System.out.println(name));
    }
}
