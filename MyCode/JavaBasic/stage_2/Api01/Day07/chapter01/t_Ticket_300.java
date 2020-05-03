package Api01.Day07.chapter01;
/*
模拟卖票案例
创建3个线程，同时开启，对共享的票进行出售
 */

public class t_Ticket_300 {
    public static void main(String[] args) {
        // 创建Runnable接口的实现类对象
        t_RunnableImpl_299 run = new t_RunnableImpl_299();
        System.out.println("run：" + run);
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
