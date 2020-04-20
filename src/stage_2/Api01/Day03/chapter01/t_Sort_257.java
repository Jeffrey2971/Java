package stage_2.Api01.Day03.chapter01;

/*
java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
    1、public static <T> void sort(List<T> list，Comparator<? super T> )`:将集合中元素按照指定规则排序。
Comparator和Comparable的区别：
    1、Comparable：自己（this）和别人比较（参数）作比较，自己需要实现Comparable接口，重写比较的的规则
    2、Comparator：也是一个接口，相当于找一个第三方的裁判，来比较两个人
    Comparator排序规则：


 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class t_Sort_257 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(2);
        System.out.println(list1); // [1, 3, 2]

        Collections.sort(list1, new Comparator<Integer>() {

            // 重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {

                // return o1 - o2; 升序排序
                return o2 - o1; // 将序排序
            }
        });
        System.out.println(list1);

        System.out.println("--------------------");

        ArrayList<t_Student_258> list2 = new ArrayList<>();
        list2.add(new t_Student_258("b玮海琼", 20));
        list2.add(new t_Student_258("张雯蔚", 25));
        list2.add(new t_Student_258("a陈禧", 20));
        list2.add(new t_Student_258("雯雯", 21));
        System.out.println(list2);

        Collections.sort(list2, new Comparator<t_Student_258>() {
/*            @Override
            public int compare(t_Student_258 o1, t_Student_258 o2) {
                // 按照年龄生序排序
                return o1.getAge() - o2.getAge();
            }
        });*/

            // 扩展

            @Override
            public int compare(t_Student_258 o1, t_Student_258 o2) {
                System.out.println("-----------------------");
                // 按照年龄生序排序
                int result = o1.getAge() - o2.getAge();


                // 如果两个人年龄相同，再使用姓名的第一个字比较
                if (result == 0) {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }

        });

        System.out.println(list2);

    }
}
