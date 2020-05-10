package Api01.Day08.chapter03;

/*
    2、创建一个类，实现Runnable接口，重写run方法，设置线程任务
 */
public class t_RunnableImpl_308 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "创建了一个新的线程执行");
    }
}
