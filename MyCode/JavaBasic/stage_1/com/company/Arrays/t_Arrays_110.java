package com.company.Arrays;

/*
java,util.Arrays是一个与数组相关的工具类，里面提供了大量的静态方法，用来实现数组的常规操作

public static String toString(数组)：将参数数组变成字符串（按照默认格式：[元素1，元素2，元素3...]）
public static void sort(数组)：按照默认升序（从小到大）对数组的元素进行排序。

备注：
1、如果是数值，sort默认按照升序从小到大
2、如果是字符串，sort默认按照字母升序
3、如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparable接口的支持。
 */

import java.util.Arrays;

public class t_Arrays_110 {
    public static void main(String[] args) {
        int[] intArray = {10, 21, 22, 30};
        // 将int[]数组按照默认格式变成字符串
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        int[] array_1 = {2, 1, 2, 54, 1, 2, 1};
        Arrays.sort(array_1);
        System.out.println(Arrays.toString(array_1));

        String[] array_2 = {"sss", "aaa", "bbb", "ccc"};
        Arrays.sort(array_2);
        System.out.println(Arrays.toString(array_2));
    }

}
