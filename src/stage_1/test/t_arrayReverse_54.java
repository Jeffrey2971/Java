package stage_1.test;


/*
要求：将一个数组反转，提前不能使用新数组，只能使用原来定义好的数组
题目：
1、打印出数组内的所有值： int arrayReverse = {22,33,44,55,66,7}
2、将数组内的值反转，且不能使用新的数组


 */

public class t_arrayReverse_54 {
    public static void main(String[] args) {
        int[] arrayReverse = {22, 33, 44, 55, 66, 7,2};
        for (int i = 0; i < arrayReverse.length; i++) {
            System.out.println(arrayReverse[i]);
        }
        System.out.println("==============================");
        for (int min = 0, max = arrayReverse.length - 1; min < max; min++, max--) {
            int temp = arrayReverse[min];
            arrayReverse[min] = arrayReverse[max];
            arrayReverse[max] = temp;
        }
        for (int i = 0; i < arrayReverse.length; i++) {
            System.out.println(arrayReverse[i]);
        }


    }
}
