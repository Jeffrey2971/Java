package Api01.Day13.chapter02;

/*
    Stream流中的常用方法concat：用于把流组合到一起
    如果有两个流，希望合并为一个流，那么可以使用Stream接口中的静态方法concat
    static <T> Stream <T> concat<? extends T> a, Stream<? extends T> b)
 */

import java.util.stream.Stream;

public class t_StreamConcat_393 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张雯蔚", "玮海琼", "陈禧", "洪泽飞", "张冰冰");
        Stream<String> stream2 = Stream.of("1", "2", "3", "4");

        // 把以上两个流组合为一个流
        Stream<String> concat = Stream.concat(stream1, stream2);

        // 遍历concat结果
        concat.forEach(name -> System.out.println(name));
    }
}
