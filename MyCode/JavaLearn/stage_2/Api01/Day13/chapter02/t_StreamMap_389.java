package Api01.Day13.chapter02;

/*
    如果需要将就中的元素映射到另一个流中，可以使用map方法
    <R> Stream <R> map(Function<? super T, ? extends R> mapper);
    该接口需要一个Function函数式接口参数，可以上当前流中的T类型数据转换为另一种R类型数据的流
    Function中的抽象方法：
        R apply (T t)
 */

import java.util.stream.Stream;

public class t_StreamMap_389 {
    public static void main(String[] args) {
        // 获取一个String类型的Stream流
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        // 使用map方法，把字符串类型的整数转换为（映射）为Integer类型的整数
        Stream<Integer> stream2 = stream.map((String s) -> {
            return Integer.parseInt(s);
        });
        // 遍历stream2
        stream2.forEach(i-> System.out.println(i));
    }
}
