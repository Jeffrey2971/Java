/*
所有的引用类型变量，都可以赋值null值，代表什么都没有，空
数组必须进行new初始化才能使用其中的元素
如果只是赋值了一个null，没有new创建
那么将会发生：
空指针异常 NullPointerException
原因：缺少new
 */
public class t_ArrayNull_48 {
    public static void main(String[] args) {
        int[] array = null;
        array = new int [3];
        System.out.println(array[0]);
    }
}
