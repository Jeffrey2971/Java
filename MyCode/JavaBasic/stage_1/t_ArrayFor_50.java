/*
遍历数组，说的就是对数组当中的每一个元素逐一进行处理，默认的处理方式就是打印输出
 */

public class t_ArrayFor_50 {
    public static void main(String[] args) {
        int[] array = {23,45,12,45,11,25,332,1};

        //原始方式
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println(array[6]);
        System.out.println(array[7]);
        System.out.println("======================");

        // 使用循环，次数就是数组的长度
        for (int i = 0;i < array.length;i++){
            System.out.println(array[i]);
        }
    }
}
