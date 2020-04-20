package stage_2.Api01.Day02.chapter03;

/*
    增强for循环：递增使用的也是迭代器，使用for循环的格式，简化了迭代器的书写
    是JDK1.5之后出现的新特性
    Collection<E>extends Iterable<E>：所有的单列集合都可以使用增强for循环
    public interface Iterable<T> 实现这个接口允许对象成为 "foreach" 语句的目标。

    增强for循环：用来遍历集合和数组
    格式：
        for(集合/数组的数据类型 变量名:集合名/数组名){
            sout(变量名);
        }
注意：新for循环必须有被遍历的目标。目标只能是Collection或者是数组。新式for仅仅作为遍历操作出现。
#
 */

import java.util.ArrayList;

public class t_Foreach_247 {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {

        // 使用增强for循环遍历集合
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for(String s:list){
            System.out.println(s);
        }

        System.out.println("--------------------");

        // 不适用for循环增强
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");
        list1.add("ddd");

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }


    private static void demo01() {

        // 使用增强for循环遍历数组
        int[] array = {1, 2, 3, 4, 5};
        for (int i : array) {
            System.out.println(i);
        }

        System.out.println("--------------------");

        // 不使用增强for循环遍历数组
        int[] array1 = {1, 2, 3, 4, 5};
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);

        }
        System.out.println("--------------------");
    }
}
