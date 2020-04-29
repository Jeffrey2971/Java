package Api01.Day12.chapter03;

/*
    练习：求数组最大元素
        使用 Supplier 接口作为方法参数类型,通过Lambda表达式求出int数组中的最大值。提示:接口的泛型请使用
        java.lang.Integer 类。
 */

import java.util.function.Supplier;

public class t_SupplierTest_370 {
    // 定义一个方法用于获取int类型数组中元素的最大值，方法的参数传递Supplier接口，泛型使用Integer
    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        // 定义一个int类型的数组
        int[] array = {100, 2, 5, 12, 55, -20, 34, 65};

        // 调用getMax方法，方法的参数Supplier是一个函数式接口所以可以传递lambda表达式
        int maxValue = getMax(() -> {
            // 获取数组的最大值并返回
            // 定义一个变量，把数组中的第一个元素赋值给该变量，记录数组中元素的最大值
            int max = array[0];
            // 遍历数组，获取数组中的其他元素
            for (int i : array) {
                // 使用其他元素和max对比
                if (i > max) { // 如果i(数组中的元素大于max则这个元素取代max)
                    max = i;

                }
            }

            // 返回最大值
            return max;

        });
        System.out.println("数组内最大元素" + maxValue);
    }
}
