package Api01.Day07.chapter01;

/*
买票案例出现了线程安全问题
卖出了不存在或重复的票

解决线程安全问题的第三种方案：使用Lock锁
java.util.concurrent.Locks.Lock接口
ReentrantLock 将由最近成功获得锁，并且还没有释放该锁的线程所拥有
Lock中接口的方法：
    void lock ()获取锁。
    void unlock()释放锁。
java.util.concurrent.Locks.ReentrantLock implements Lock接口

使用步骤：
    1、在成员位置创建一个ReentrantLock对象
    2、在可能会出现线程安全问题的代码前调用Lock接口中的方法lock(获取锁)
    3、在可能会出现线程安全问题的代码后调用Lock接口中的方法unlock(释放锁)
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class t_RunnableImpl_299 implements Runnable {
    // 定义一个多线程的共享票源
    private int ticket = 100;

    // 1、在成员位置创建一个ReentrantLock对象
    Lock l = new ReentrantLock();

    // 设置线程任务：卖票
    @Override
    public void run() {
        // 2、在可能会出现线程安全问题的代码前调用Lock接口中的方法lock(获取锁)
        while (true) {
            l.lock();
            // 判断票是否存在

            if (ticket > 0) {
                // 提高安全为题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                    // 票存在则卖票 ticket--
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally { // 无论程序异常，都会把锁释放

                    // 3、在可能会出现线程安全问题的代码后调用Lock接口中的方法unlock(释放锁)
                    l.unlock();
                }
            }
        }
    }
    /*// 设置线程任务：卖票
    @Override
    public void run() {
        // 2、在可能会出现线程安全问题的代码前调用Lock接口中的方法lock(获取锁)
        while (true) {
            l.lock();
            // 判断票是否存在

            if (ticket > 0) {
                // 提高安全为题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // 票存在则卖票 ticket--
                System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                ticket--;
            }
            // 3、在可能会出现线程安全问题的代码前调用Lock接口中的方法unlock(释放锁)
            l.unlock();
        }
    }*/
}