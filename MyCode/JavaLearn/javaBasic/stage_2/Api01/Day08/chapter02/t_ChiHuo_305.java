package Api01.Day08.chapter02;

/*
消费者（吃货）类：是一个线程类，继承自Thread
设置线程任务（重写run方法）：吃包子
对包子的状态进行判断
false：没有包子，吃货调用wait方法进入等待状态
true：有包子
    吃货吃包子
    吃货吃完包子，修改包子的状态为false没有
    吃货唤醒包子铺线程，生产包子
 */

public class t_ChiHuo_305 extends Thread {
    // 1、需要在成员类中创建一个包子变量
    private t_BaoZi_303 bz;

    // 2、使用带参数构造方法，为这个包子变量赋值
    public t_ChiHuo_305(t_BaoZi_303 bz) {
        this.bz = bz;
    }

    // 设置线程任务（重写run方法）：吃包子
    @Override
    public void run() {
        // 使用死循环，让吃货一直吃包子
        while (true) {
            // 必须使用同步技术保证两个线程只能有一个在执行
            synchronized (bz) {
                // 对包子的状态进行判断
                if (bz.flag == false) {
                    // false：没有包子，吃货调用wait方法进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 被唤醒之后执行的代码，吃包子
                System.out.println("吃货正在吃" + bz.pi + bz.xian + "的包子");
                // 吃货吃完包子后修改包子的状态为false
                bz.flag = false;
                // 吃货唤醒包子铺线程，生产包子
                bz.notify();
                System.out.println("吃货吃完了" + bz.pi + bz.xian + "的包子");
                System.out.println("--------------------------------------");
            }
        }
    }
}
