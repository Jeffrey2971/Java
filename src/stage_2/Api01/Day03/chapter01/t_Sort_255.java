package Api01.Day03.chapter01;

/*
java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
    1、public static <T> void sort(List<T> list)`:将集合中元素按照默认规则排序。

Collections接口的排序规则：
    1、自己（this） - 参数：升序

注意事项：
    1、sort(List<T> list)使用前提：被排序的集合里面存储的元素，必须实现Comparable重写接口中的方法compareTo定义排序的规则

 */

import java.util.ArrayList;
import java.util.Collections;

public class t_Sort_255 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(2);
        System.out.println(list1); // [1, 3, 2]

        // public static <T> void sort(List<T> list)`:将集合中元素按照默认规则排序。
        Collections.sort(list1);  // 默认是升序（从小到大）
        System.out.println(list1);

        System.out.println("----------------------");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("c");
        list2.add("b");
        list2.add("e");
        list2.add("d");
        System.out.println(list2);
        Collections.sort(list2); // 默认也是按照升序 a-z
        System.out.println(list2);
        System.out.println("-------------------------");

        ArrayList<stage_2.Api01.Day03.chapter01.t_Person_256> list3 = new ArrayList<>();
        list3.add(new stage_2.Api01.Day03.chapter01.t_Person_256("玮海琼", 20));
        list3.add(new stage_2.Api01.Day03.chapter01.t_Person_256("张雯蔚", 18));
        list3.add(new stage_2.Api01.Day03.chapter01.t_Person_256("陈禧", 25));
        System.out.println(list3); // [t_Person_256{name='玮海琼', age=20}, t_Person_256{name='张雯蔚', age=18}, t_Person_256{name='陈禧', age=25}]
        Collections.sort(list3);
        System.out.println(list3);
    }

}
