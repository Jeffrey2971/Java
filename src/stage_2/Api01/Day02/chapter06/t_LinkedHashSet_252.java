package stage_2.Api01.Day02.chapter06;

/*
    java.util.LinkedHashSet集合 extends HashSet集合
    linkedHashSet集合特点：
        底层是一个哈希表（数组+编标/红黑树结构）+链表：多了一条链表（用于记录元素的存储顺序），保证元素有序
 */

import java.util.HashSet;
import java.util.LinkedHashSet;

public class t_LinkedHashSet_252 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("baidu");
        System.out.println(set); // [abc, www, baidu]无序的，并且不允许重复

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("baidu");
        System.out.println(linked); // [www, abc, baidu]有序的，并且不允许重复
    }
}
