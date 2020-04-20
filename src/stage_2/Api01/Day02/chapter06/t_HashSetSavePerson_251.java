package stage_2.Api01.Day02.chapter06;

/*
使用HashSet存储自定义元素
set集合保证元素唯一
    存储的元素（String, Integer, ...Student,Person）,必须重写hashCode和equals方法

    要求：
        同名和同年龄的人，视为同一个人，只能存储一次

 */

import java.util.HashSet;

public class t_HashSetSavePerson_251 {
    public static void main(String[] args) {
        // 创建一个HashSet集合存储Person
        HashSet<t_Person_252> set = new HashSet<>();
        t_Person_252 p1 = new t_Person_252("玮海琼",20);
        t_Person_252 p2 = new t_Person_252("玮海琼",20);
        t_Person_252 p3 = new t_Person_252("玮海琼",21);
        System.out.println(p1.hashCode()); // 1712536284
        System.out.println(p2.hashCode()); // 2080166188
        System.out.println(p1 == p2); // false
        System.out.println(p1.equals(p2)); // false
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
