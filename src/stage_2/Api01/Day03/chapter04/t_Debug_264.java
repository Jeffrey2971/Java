package stage_2.Api01.Day03.chapter04;

/*
Debug调试程序：可以让代码逐行执行，查看代码执行过程，调试程序中出现的问题
使用方式：
    1、在行号的右边，鼠标左键单击，添加断电（每个方法的第一行，哪里有bug添加到哪里）
    2、右键选择Debug执行程序，程序将会停留在添加的第一个断点处
执行程序：
    F8：逐行执行程序
    F7：进入到方法中
    shift+F8：跳出方法
    F9：跳到下一个断点，如果没有下一个断点，那么将终止程序
    ctrl+F2：退出Debug模式，终止程序
    Console：切换到控制台

 */

public class t_Debug_264 {
    public static void main(String[] args) {
        /*int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);*/

        /*for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }*/

        print();
    }

    private static void print() {
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
    }
}
