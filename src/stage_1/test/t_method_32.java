package stage_1.test;

/*
题目要求：定义一个方法，返回出两个数之和
题目变形：定义一个方法，用来打印两数之和

注意事项：
    对于有返回值的方法，可以使用单独调用，打印调用或赋值调用
    但是对于无返回的方法，只能使用单独调用，不能使用打印调用或复制调用

 */
public class t_method_32 {
    public static void main(String[] args) {
        int sum_num = sum(223, 123);
        System.out.println("返回值是：" + sum_num);
        printSum(1,2);


    }

    // 负责两数相加
    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void printSum(int a, int b) {
        System.out.println("结果是" + (a + b));
    }
}
