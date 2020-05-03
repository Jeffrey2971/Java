package Api01.Day08.chapter01;

/*
卖包子
等待唤醒案例：线程之间的通信
    创建一个顾客线程（消费者）：告知老板要包子的种类和数量，调用wait方法，放弃CPU的执行，进入到waiting状态（无线等待状态）
    创建一个老板线程（生产者）：花了5秒做包子，做好包子之后，调用notify方法，唤醒顾客吃包子

注意事项：
    顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个在执行
    同步使用的锁对象必须保证是唯一的
    只有锁对象才能调用wait和notify方法，非锁对象不能调用

Object类名的方法
    void wait()在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待。
    void notify()唤醒在此对象监视器上等待的单个线程，继续执行wait方法之后的代码
 */

public class t_WaitAndNotify_301 {
    public static void main(String[] args) {
        // 创建锁对象，保证唯一
        Object obj = new Object();

        // 创建一个顾客线程（消费者）
        new Thread() {
            @Override
            public void run() {
                // 保证等待和唤醒只能有一个在执行，需要使用同步技术
                while (true) { // 一直等着买包子
                    synchronized (obj) {
                        // 告知老板需要的参数
                        System.out.println("告知老板需要的包子的种类和数量");
                        // 调用wait方法进入无线等待状态
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        // wait唤醒之后执行的代码
                        System.out.println("开吃");
                        System.out.println("------------------");
                    }
                }
            }
        }.start();

        // 创建老板线程
        new Thread() {
            @Override
            public void run() {
                while (true) { // 一直做包子
                    try {
                        Thread.sleep(5000); // 老板花五秒做包子
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // 保证等待线程和唤醒线程只能有一个在执行，需使用同步技术
                    synchronized (obj) {
                        // 老板做好包子后，调用notify方法，唤醒顾客吃包子
                        System.out.println("老板5秒钟之后做好了包子，告知顾客，可以吃包子了");
                        obj.notify();

                    }
                }

            }
        }.start();
    }
}
