package stage_2.Api01.Day05.chapter03;

/*
线程的名称：
    主线程：main线程
    新线程：Thread-0;
 */

public class t_GetThreadName_287 {
    public static void main(String[] args) {
        // 创建Thread类的子类对象
        t_MyThread_286 mt = new t_MyThread_286();
        // 调用start方法，开启新的线程，执行run方法
        mt.start();
        new t_MyThread_286().start();
        new t_MyThread_286().start();
        new t_MyThread_286().start();

        System.out.println(Thread.currentThread().getName());

    }
}
