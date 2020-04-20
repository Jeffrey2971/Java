package stage_2.Api01.Day05.chapter07;

/*
买票案例出现了线程安全问题，卖出了不存在的票和重复的票
解决线程安全问题的第一种方案：使用同步代码块
格式：
    synchronize(锁对象){
        // 可能会出现线程安全的代码（访问了共享数据的代码）
    }

注意事项：
    1、同步代码块中的锁对象，可以使任意的对象
    2、但是必须保证多个线程使用的锁对象是同一个
    3、锁对象作用：
        把同步代码块锁住，只让一个线程在同步代码块中执行
 */

public class t_RunnableImpl_296 implements Runnable {
    // 设置线程任务：卖票
    // 定义一个多个线程的共享票源
    private int ticket = 1000;

    // 创建一个锁对象
    Object obj = new Object();

    @Override
    public void run() {
        System.out.println("this：" + this);
        // 使用死循环，让卖票操作重复执行
        while (true) {
            // 同步代码块
            synchronized (obj) {
                // 先判断票是否存在
                if (ticket > 0) {
                    // 提高安全问题出现的概率，让程序睡眠
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // 票存在，卖票，ticket --
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                    ticket--;
                }
            }

        }
    }
}
