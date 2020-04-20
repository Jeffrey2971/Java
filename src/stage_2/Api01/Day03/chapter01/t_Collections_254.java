package stage_2.Api01.Day03.chapter01;

/*
java.utils.Collections`是集合工具类，用来对集合进行操作。部分方法如下：
    1、public static <T> boolean addAll(Collection<T> c, T... elements)  `:往集合中添加一些元素。
    2、public static void shuffle(List<?> list) 打乱顺序`:打乱集合顺序。
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class t_Collections_254 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        /*
        往集合中添加多个元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        */

        System.out.println("--------------------");

        // public static <T> boolean addAll(Collection<T> c, T... elements)  `:往集合中添加一些元素。
        Collections.addAll(list, "a","b","d","d","e");
        System.out.println(list);

        System.out.println("---------------------");

        // public static void shuffle(List<?> list) 打乱顺序`:打乱集合顺序。
        Collections.shuffle(list);
        System.out.println(list);
    }
}
