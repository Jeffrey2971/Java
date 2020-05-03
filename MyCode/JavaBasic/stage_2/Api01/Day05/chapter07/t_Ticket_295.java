package Api01.Day05.chapter07;

/*
模拟卖票案例
创建3个线程，同时开启，对共享的票进行出售
 */


import Api01.Day05.chapter08.t_RunnableImpl_297;

public class t_Ticket_295 {
    public static void main(String[] args) {
        // 创建Runnable接口的实现类对象
        t_RunnableImpl_297 run = new t_RunnableImpl_297();
        // 创建Thread类的对象，构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        // 调用start方法，开启多线程
        t0.start();
        t1.start();
        t2.start();

    }
}
