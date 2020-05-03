/*
直接打印数组名称，得到的是数组对应的：内存地址哈希值。
二进制：0 1
十进制：0 1 2 3 4 5 6 7 8 9
16进制：0 1 2 3 4 5 6 7 8 9 a b c d e f

访问数组元素的格式：数组名称[索引值]
索引值：就是一个int数字，代表数组当中元素的编号
注意：索引值从0开始，一直到数组的长度-1为止
 */

public class t_ArrayUse_42 {
    public static void main(String[] args) {
        // 静态初始化的省略格式
        int[] array = {10, 20, 30};
        System.out.println(array); //[I@74a14482
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        int num = array[1];
        System.out.println(num);
    }
}
