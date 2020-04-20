package stage_2.Api01.Day03.chapter03;

/*
JDK9的新特性：
    List接口，Set接口，Map接口：里面增加了静态的方法Of，可以给集合一次性添加多个元素
    static<E> List<E> of (E... elements)
    使用前提：
        1、当集合中存储的元素的个数已经确定了，不再改变时使用
        2、Of方法只适用于List接口，Set接口，Map接口，不适用于接口的实现类
        3、Of方法的返回值是一个不能改变的集合，集合不能再使用add，put等方法添加元素，否则抛异常
        4、Set接口和Map接口在调用Of方法的时候，不能有重复的元素，否则抛异常
 */

import java.util.List;
import java.util.Map;
import java.util.Set;

public class t_JDK9_263 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "a", "c", "d");
        System.out.println(list); // [a, b, a, c, d]

        System.out.println("----------------------");
//        list.add("w"); 错误写法，使用了Of方法后就不能使用add,put等方法 UnsupportedOperationException

//        Set<String> set = Set.of("a", "b", "a", "c", "d");  错误写法，Set接口不能放重复的元素 IllegalArgumentException

        Set<String> set = Set.of("a", "b", "c", "d");
//        set.add("w");  错误写法，同样不能使用add，put等方法
        System.out.println(set);
        System.out.println("----------------------");

        Map<String, Integer> map = Map.of("张雯蔚", 20, "玮海琼", 21, "陈禧", 19);
//        Map<String, Integer> map1 = Map.of("张雯蔚", 20, "玮海琼", 21, "陈禧", 19, "玮海琼", 21);  错误写法，只要使用了Of都不能额外添加元素
        System.out.println(map);
    }
}
