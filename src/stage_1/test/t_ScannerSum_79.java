package stage_1.test;

/*
要求：
1、键盘输入两个int数字，并且求出和值
2、键盘输入三个int数字，并求出当中的最大值
 */


import java.util.Scanner;

public class t_ScannerSum_79 {
    public static void main(String[] args) {
        System.out.println("结果为：" + Sum());
        System.out.println("最大值是：" + Max());

    }

    public static int Sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int num_1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int num_2 = sc.nextInt();

        int result = num_1 + num_2;

        return result;
    }

    public static int Max() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = sc.nextInt();
        System.out.println("请输入第二个数");
        int b = sc.nextInt();
        System.out.println("请输入第三个数");
        int c = sc.nextInt();

        // 首先得到前两个数字当中的最大值
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;

        return max;
    }


}
