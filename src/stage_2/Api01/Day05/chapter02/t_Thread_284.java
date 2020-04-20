package stage_2.Api01.Day05.chapter02;

/*
创建多线程程序的第一种方式：创建Thread类的子类
java.lang.Thread类：是描述线程的类，如想要实现多线程程序就必须继承自Thread类

实现步骤：
    1、创建一个Thread类的子类
    2、在Thread类的子类中重写Thread类中的run方法，设置线程任务（开启线程要做什么）
    3、创建Thread类的子类对象
    4、调用Thread类中的start方法，开启新的线程，执行线程的任务run方法
        void  start()使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
        结果是两个线程并发地运行；当前线程（main线程）和另一个线程（创建的新线程执行其 run 方法）。
注意事项：
    1、多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
    2、Java程序属于抢占式调度，哪个线程的优先级高，哪个线程则优先执行，如同一个优先级则随机选择一个执行
 */

public class t_Thread_284 {
    public static void main(String[] args) {
        // 3、创建Thread类的子类对象
        t_MyThread_285 mt = new t_MyThread_285();
        // 4、调用Thread类中的start方法，开启新的线程，执行线程的任务run方法
        mt.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main" + i);
        }

    }
}
