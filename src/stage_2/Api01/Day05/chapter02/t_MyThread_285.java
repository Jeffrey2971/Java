package stage_2.Api01.Day05.chapter02;

// 1、创建一个Thread类的子类

public class t_MyThread_285 extends Thread {
    // 2、在Thread类的子类中重写Thread类中的run方法，设置线程任务（开启线程要做什么）

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run" + i);

        }
    }
}
