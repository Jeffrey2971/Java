package Api01.Day08.chapter04;

/*
创建Runnable接口的实现类，重写run方法，设置线程任务
 */

public class t_RunnableImpl_310 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "新的线程创建了");
    }
}
