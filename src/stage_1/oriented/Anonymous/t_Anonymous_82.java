package stage_1.oriented.Anonymous;

import java.util.Scanner;

public class t_Anonymous_82 {
    public static void main(String[] args) {

        // 普通使用
//        Scanner sc = new Scanner(System.in);
//        int num_1 = sc.nextInt();

        // 匿名对象方式
//        int num_2 = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" + num_2);
        // 使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);


        // 使用匿名对象传参
//        methodParam(new Scanner(System.in));
        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是" + num);
    }


    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);

    }

    public static Scanner methodReturn() {
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }
}
