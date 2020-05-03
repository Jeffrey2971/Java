package Api01.Day13.chapter02;

/*
    Stream流中的方法filter：用于对Stream流中的数据进行过滤
    Stream<T> filter(Predicate<? super T> predicate)
    filter方法的参数Predicate是一个函数式接口，所以可以传递lambda表达式对数据进行过滤
    Predicate中的抽象方法：boolean test(T t)
 */

import java.util.stream.Stream;

public class t_StreamFilter_388 {
    public static void main(String[] args) {
        // 创建一个Stream流
        Stream<String> stream = Stream.of("张雯蔚", "玮海琼", "陈禧", "洪泽飞", "张冰冰");
        // 对Stream中的元素进行过滤，只要性张的人
        Stream<String> stream2 = stream.filter(name -> name.startsWith("张"));
        // 遍历
        stream2.forEach(name-> System.out.println(name));

        /*
            Stream流属于管道流，只能被消费（使用）一次
            第一个stream流调用完毕方法，数据就会流转到下一个Stream上
            而这时第一个Stream流已经使用完毕且关闭了，所以第一个Stream不能再被使用
         */
        // 测试遍历第一个Stream流
        stream.forEach(name-> System.out.println(name));
        // IllegalStateException: stream has already been operated upon or closed
    }
}
