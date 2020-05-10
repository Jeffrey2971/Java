package Api01.Day13.chapter02;

/*
    Stream流中的方法limit：用于截取流中的元素
    limit方可以流进行截取，只取用前n个。方法签名：
        Stream<T> limit(long maxSize);
            参数是一个long型，如果集合当前长度大于参数则进行截取，否则不进行操作

    limit方法是一个延迟方法，只是对流中的元素进行截取，返回的是一个新的流，所以可以继续调用Stream流中的其他方法
 */

import java.util.stream.Stream;

public class t_StreamLimit_391 {
    public static void main(String[] args) {
        // 获取一个Stream流
        String[] array = {"张雯蔚","玮海琼", "陈禧","洪泽飞","张冰冰"};
        Stream<String> stream = Stream.of(array);

        // 使用limit对Stream流中的的元素进行截取前三个元素
        Stream<String> stream2 = stream.limit(3);
        stream2.forEach(name-> System.out.println(name));
    }
}
