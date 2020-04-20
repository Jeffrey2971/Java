package stage_2.Api01.Day02.chapter01;

/*
    java.util.Collection接口：
        所有单列集合最顶层的接口，里面定义了所有单列集合共性的方法
        任意的单列结合都可以使用Collection接口中的方法

    共性的方法：
        1、public boolean add(E e)：把给定的对象添加到当前集合当中
        2、public void clear()：清空集合中的所有元素
        3、public boolean remove(E e)：把给定的对象在当前的集合中删除
        4、public boolean contains(E e)：判断当前集合中是否包含给定对象
        5、public boolean isEmpty()：判断当前集合是否为空
        6、public int size()：返回集合中元素的个数
        7、public Object[] toArray()：把集合中的元素，存储到数组当中
 */

import java.util.ArrayList;
import java.util.Collection;

public class t_Collection_245 {
    public static void main(String[] args) {
        // 创建集合对象，可使用多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll); // 重写了toString方法[]

        /*
            public boolean add(E e)：把给定的对象添加到当前集合当中
            返回值是一个布尔值，一般返回true，所以可以不用接收
         */
        boolean b1 = coll.add("玮海琼");
        System.out.println("b1：" + b1);
        System.out.println(coll); // b1：true
        coll.add("张雯蔚");
        coll.add("陈禧");
        coll.add("雯雯");
        System.out.println(coll); // [玮海琼, 张雯蔚, 陈禧, 雯雯]
        System.out.println("-----------------------------");

        /*
            public boolean remove(E e)：把给定的对象在当前的集合中删除
            返回值是一个布尔值，集合中存在元素，会删除元素并返回true，如不存在则删除失败并返回false
         */
        boolean b2 = coll.remove("雯雯");
        boolean b3 = coll.remove("蔡婧怡");
        System.out.println("b2：" + b2); // true
        System.out.println("b3：" + b3); // false
        System.out.println(coll); // [玮海琼, 张雯蔚, 陈禧]
        System.out.println("-------------------------");

        /*
            public boolean contains(E e)：判断当前集合中是否包含给定对象，如果存在则返回true，否则返回false
         */
        boolean b4 = coll.contains("雯雯");
        boolean b5 = coll.contains("玮海琼");
        System.out.println("b4：" + b4);
        System.out.println("b5：" + b5);
        System.out.println("---------------------------");

        /*
            public boolean isEmpty()：判断当前集合是否为空，为空则返回true，否则返回false
         */
        boolean b6 = coll.isEmpty();
        System.out.println("b6：" + b6);
        System.out.println("------------------------");

        /*
            public int size()：返回集合中元素的个数
         */
        int size = coll.size();
        System.out.println("size：" + size);
        System.out.println("---------------------");

        /*
            public Object[] toArray()：把集合中的元素，存储到数组当中
         */
        Object[] array = coll.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        System.out.println("---------------------");

        /*
            public void clear()：清空集合中的所有元素，但是并不删除集合，只删除集合内的所有元素
         */
        coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty()); // true

    }
}
