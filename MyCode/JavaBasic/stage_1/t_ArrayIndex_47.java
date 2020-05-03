/*
数组索引的编号从0开始，一直到数组的长度-1为止
如果访问数组的时候，索引编号并不存在，那么将会发生
数组索引越界异常
ArrayIndexOutOfBoundsException
原有：
    索引编号不存在
 */
public class t_ArrayIndex_47 {
    public static void main(String[] args) {
        int[] array = {10,20,30};
        System.out.println(array[0]); // 10
        System.out.println(array[1]); // 20
        System.out.println(array[2]); // 30
        // System.out.println(array[3]); 错误写法，并不存在三号元素，所以发生异常
    }
}
