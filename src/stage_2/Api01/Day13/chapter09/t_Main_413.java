package Api01.Day13.chapter09;

/*
    数组的构造器引用
 */

import java.util.Arrays;

public class t_Main_413 {
    /*
        定义一个方法
        方法的参数传递创建数组的长度和ArrayBuilder接口
        方法内部根据传递的长度使用ArrayBuilder中的方法创建数组并返回
     */
    public static int[] createArray(int length, t_ArrayBuilder_412 ab){
        return ab.BuilderArray(length);
    }

    public static void main(String[] args) {
        // 调用createArray方法，传递数组的长度和lambda表达式
        int[] array1 = createArray(10, (len) -> {
            // 根据数组的长度创建数组并返回
            return new int[len];
        });
        System.out.println(array1.length);

        /*
            使用方法引用优化lambda表达式
            已知创建的就是int[]类型的数组
            已知数组的长度
            所以可以使用方法引用
            int[] 引用 new，根据参数粗换地的长度来创建数组
         */
        int[] array2 = createArray(20,int[]::new);
        System.out.println(Arrays.toString(array2));
        System.out.println(array2.length);

    }

}
