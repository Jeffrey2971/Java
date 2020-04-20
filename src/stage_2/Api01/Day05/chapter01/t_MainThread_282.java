package stage_2.Api01.Day05.chapter01;

/*
主线程：执行主方法（main）的线程
单线程程序：Java程序中之后一个线程

JVM执行main方法，main方法会进入到栈内存
JVM会找到操作系统开辟一条main方法通向CPU的执行路径
CPU就可以通过这个路径来执行main方法
而这个路径有一个名字叫做main(主方法)线程
 */

public class t_MainThread_282 {
    public static void main(String[] args) {
        t_Person_283 p1 = new t_Person_283("张雯蔚");
        p1.run();
        System.out.println(0 / 0);

        t_Person_283 p2 = new t_Person_283("玮海琼");
        p2.run();
    }
}
