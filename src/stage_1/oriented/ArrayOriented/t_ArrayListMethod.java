package stage_1.oriented.ArrayOriented;

/*
ArrayList当中的常用方法有：
public boolean add(E e):向集合当中添加元素，参数的类型和泛型一致，返回值代表添加是否成功
备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用不可用
但是对于其他合集（今后了解）来说，add动作不一定成功

public E get(int index)：从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素

public E remove(int index)：从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素

public int size()：获取集合的尺寸长度，返回值是集合中包含的元素个数

 */

import java.util.ArrayList;

public class t_ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []

        // 像集合中添加元素：add
        boolean success = list.add("柳岩");
        System.out.println(list);
        System.out.println("添加的动作是否成功：" + success); // true

        list.add("高圆圆");
        list.add("张雯雯");
        list.add("洪泽飞");
        list.add("李小璐");

        System.out.println(list);

        // 从集合中获取元素：get，索引值0开始
        String name = list.get(3);
        System.out.println("索引值三对应的是：" + name);

        // 从集合中删除元素：remove，索引值0开始
        String whoRemove = list.remove(4);
        System.out.println("被删除的是：" + whoRemove);
        System.out.println(list);

        // 获取集合的长度尺寸，也就是元素的个数
        int size = list.size();
        System.out.println("集合的长度是：" + size);
    }
}
