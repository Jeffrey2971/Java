/*
面向对象三大特征：封装、继承、多态

封装性在Java中的体现：
1、方法就是一种封装
2、关键字private也是一种封装

封装就是将一些细节信息隐藏起来，对于外界不可见。
 */

public class t_Method_67 {
    public static void main(String[] args) {
        int[] array = {5, 15, 25, 20, 200};
        int max = getMax(array);
        System.out.println("最大值" + max);

    }

    // 传进来一个数组返回最大值
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
