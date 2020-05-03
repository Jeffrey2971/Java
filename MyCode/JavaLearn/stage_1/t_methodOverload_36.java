/*
对于功能类似的方法来说，因为参数列表不一样，却需要记住多种方法名称，太麻烦

方法的重载（Overload）：多个方法的名称一样，但是参数列表不一样。

好处：只需要记住唯一一个方法的名称，就可以实现类似的功能

方法重载与下列因素相关：
1、参数个数不同
2、参数类型不同

方法重载与下列情况无关：
1、与参数的名称无关
2、与方法的返回值类型无关
 */


public class t_methodOverload_36 {
    public static void main(String[] args) {
//        System.out.println(sumTwo(2, 3));
//        System.out.println(sumThree(2, 3, 4));
//        System.out.println(sumFour(2, 3, 4, 5));
        System.out.println(sum(10, 20));
        System.out.println("==========================");
        System.out.println(sum(10, 20, 30));
        System.out.println("==========================");
        System.out.println(sum(10, 20, 30, 40));
        System.out.println("==========================");
//        System.out.println(sum(10, 20,30,40,50));  找不到任何方法所以报错
        System.out.println("==========================");
        System.out.println(t1(3.1, 6.2));
        System.out.println(t2(5, 6.2));
        System.out.println(t3(3.1, 6));


    }

    public static int sum(int a, int b) {
        System.out.println("有两个参数的方法执行了");
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        System.out.println("有三个参数的方法执行了");

        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        System.out.println("有四个参数的方法执行了");

        return a + b + c + d;
    }

    public static int t1(double a, double b) {
        return (int) (a + b);
    }

    public static int t2(int a, double b) {
        return (int) (a + b);
    }

    public static int t3(double a, int b) {
        return (int) (a + b);
    }

}
