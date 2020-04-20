package stage_2.Api01.Day05.chapter05;

// 1、创建一个Runnable接口的实现类

public class t_RunnableImpl_293 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("HelloWorld" + i);

        }
    }
}
