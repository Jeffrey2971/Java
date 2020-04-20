package stage_2.Api01.Day02.chapter04;

/*
java.util.Set接口 extends Collection接口
Set接口的特点：
    1、不允许存储重复元素
    2、没有索引，没有带索引的方法，也不能使用普通的for循环遍历
java.util.HashSet集合 implements Set接口
HashSet特点：
    1、不允许存储重复元素
    2、没有索引，没有带索引的方法，也不能使用普通的for循环遍历
    3、自身是一个无需的集合，存储元素和取出的元素的顺序有可能不一致
    4、底层是一个哈希表结构（查询的速度非常的快）
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class t_Set_248 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // 使用后add方法往集合中添加元素
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(6);
        set.add(5);

        // 因为没有索引所以不能使用普通的for循环，需使用迭代器
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer n = it.next();
            System.out.println(n);
        }

        // 使用增强for遍历set集合
        System.out.println("----------------------");
        for (Integer i :
                set) {
            System.out.println(i);

        }


    }
}
