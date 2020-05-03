package Api01.Day08.chapter01;

/*
进入到TimeWaiting(计时等待)有两种方式
    1、使用sleep(long m)方法，毫秒值结束之后，线程睡醒进入到Runnable/Blocked状态
    2、使用wait(long m)方法，wait方法如果在毫秒值结束之后，还没有被notify唤醒，就会自动醒来（自动调用notify）

唤醒的方法：
    1、void notify()唤醒在此对象监视器上等待的单个线程。
    2、void notifyAll()唤醒在此对象监视器上等待的所有线程。
 */

public class t_WaitAndNotify_302 {
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
                        System.out.println("顾客1，告知老板需要的包子的种类和数量");
                        // 调用wait方法进入无线等待状态
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        // wait唤醒之后执行的代码
//                        System.out.println("开吃");
//                        System.out.println("------------------");
                    }
                }
            }
        }.start();

        // 创建锁对象，保证唯一

        // 创建一个顾客线程（消费者）
        new Thread() {
            @Override
            public void run() {
                // 保证等待和唤醒只能有一个在执行，需要使用同步技术
                while (true) { // 一直等着买包子
                    synchronized (obj) {
                        // 告知老板需要的参数
                        System.out.println("顾客2，告知老板需要的包子的种类和数量");
                        // 调用wait方法进入无线等待状态
                        try {
                            obj.wait(5000);
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
                        obj.notifyAll(); // 于notify不同的是，notify如果有多个线程只会随机唤醒一个而notifyAll则会唤醒所有等待的线程

                    }
                }

            }
        }.start();
    }
}
