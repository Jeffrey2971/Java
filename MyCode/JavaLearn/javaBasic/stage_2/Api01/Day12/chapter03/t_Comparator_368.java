package Api01.Day12.chapter03;

/*
    如果一个方法的返回值类型是一个函数式接口,那么就可以直接返回一个Lambda表达式。当需要通过一
    个方法来获取一个 java.util.Comparator 接口类型的对象作为排序器时,就可以调该方法获取。
 */

import java.util.Arrays;
import java.util.Comparator;

public class t_Comparator_368 {
    // 定义一个方法，方法的返回值类型使用函数式接口Comparator
    public static Comparator<String> getComparator() {
        // 方法的返回值类型是一个接口，可以返回这个接口的匿名内部类

        /*return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 按照字符串的降序进行排序
                return o2.length() - o1.length();
            }
        };*/

        // 方法的返回值类型是一个接口，而接口是一个函数式接口，所以可以返回lambda表达式
        /*return (String o1, String o2)->{
            return o2.length() - o1.length();
        };*/

        // 继续优化lambda表达式
        return (o1, o2) -> o2.length() - o1.length();
    }

    public static void main(String[] args) {
        // 创建字符串数组
        String[] array = {"MABLE", "TOM", "JACK", "JEFFREY"};

        // 输出排序前的字符串
        System.out.println(Arrays.toString(array));

        // 调用Arrays中的sort方法，对字符串数组进行排序
        Arrays.sort(array, getComparator());

        // 输出排序后的字符串
        System.out.println(Arrays.toString(array));

    }
}
