package Api01.Day13.chapter02;

/*
    java.util.stream.Stream<T> 是Java 8新加入的最常用的流接口。(这并不是一个函数式接口。)
    获取一个流非常简单,有以下几种常用的方式:
        所有的 Collection 集合都可以通过 stream 默认方法获取流;
            default Stream<E> stream()
        Stream 接口的静态方法 of 可以获取数组对应的流。
            static <T> Stream<T> of (T... values)
            参数是一个可变参数，所以可以传递一个数组
 */

import java.util.stream.Stream;

public class t_GetStream_386 {
    public static void main(String[] args) {
        // 把集合转换为Stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<String>();
        Stream<String> stream2 = set.stream();

        HashMap<String, String> map = new HashMap<>();
        // 获取键，存储到一个set集合
        Set<String> keyset = map.keySet();
        Stream<String> stream3 = keyset.stream();

        // 获取值，存储到Collection集合中
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

        // 获取键值对（键与值的映射关系 entrySet）
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();

        // 把数组转换为stream流
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);
        // 可变参数可以传递数组
        Integer[] array = {1, 2, 3, 4, 5};
        Stream<Integer> stream7 = Stream.of(array);

        String[] array2 = {"a", "b", "c"};
        Stream<String> stream8 = Stream.of(array2);


    }
}
