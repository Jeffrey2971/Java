package Api01.Day13.chapter02;

/*
    Stream流的常用方法count：用于统计Stream流中元素的个数
    long count();
    count方法是一个终结方法，返回值是一个long类型的整数，所以不能再继续调用stream流中的其他方法
 */

import java.util.ArrayList;
import java.util.stream.Stream;

public class t_StreamCount_390 {
    public static void main(String[] args) {
        // 获取一个Stream流
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(15);
        list.add(12);
        list.add(13);
        Stream<Integer> stream = list.stream();
        long count = stream.count();
        System.out.println(count);
    }
}
