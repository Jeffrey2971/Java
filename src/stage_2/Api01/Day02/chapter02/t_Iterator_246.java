package stage_2.Api01.Day02.chapter02;

/*
    java.util.Iterator接口：迭代器（对集合进行遍历）
    有两个常用的方法：
         1、boolean hasNext()如果仍有元素可以迭代，则返回 true。
            判断集合中还有没有下一个元素，有则返回true，没有则返回false
        2、E next()返回迭代的下一个元素。
            取出集合中的下一个元素

    Iterator迭代器是一个接口，无法直接使用，需要Iterator接口的实现类对象，获取实现类的方式比较特殊
    Collection接口中有一个方法，叫Iterator，这个方法返回的就是迭代器的实现类对象
            Iterator<E>	iterator()返回在此 collection 的元素上进行迭代的迭代器。

    迭代器使用步骤（重点）：
        1、使用集合中的方法iterator()获取迭代器的实现类对象，使用iterator接口来接收（多态）
        2、使用Iterator接口中的方法hasNext判断还有没有下一个元素
        3、使用Iterator接口中的方法next取出集合中的下一个元素



 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class t_Iterator_246 {
    public static void main(String[] args) {
        // 创建一个集合对象
        Collection<String> coll = new ArrayList<>();

        // 往集合中添加元素
        coll.add("玮海琼");
        coll.add("张雯蔚");
        coll.add("陈禧");
        coll.add("洪泽飞");

        /*
            使用集合中的方法iterator()获取迭代器的实现类对象，使用iterator接口来接收（多态）
            注意：
                Iterator<E>接口也是有泛型，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型
         */
        // 多态    接口         实现类对象
        Iterator<String> it = coll.iterator();
        System.out.println("-------------------------");
        while(it.hasNext()){
            String e = it.next();
            System.out.println(e);

        }
        System.out.println("----------------------");
        for(Iterator<String> it2 = coll.iterator();it2.hasNext();){
            String e = it2.next();
            System.out.println(e);
        }
        System.out.println("取完了");

    }

}
