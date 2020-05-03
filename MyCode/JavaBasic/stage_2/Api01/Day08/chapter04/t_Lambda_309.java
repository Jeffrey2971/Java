package Api01.Day08.chapter04;

/*
使用Runnable接口的方式实现多线程程序
 */

public class t_Lambda_309 {
    public static void main(String[] args) {
        // 创建Runnable接口的实现类对象
        t_RunnableImpl_310 run1 = new t_RunnableImpl_310();
        // 创建Thread对象类对象，构造方法中传递Runnable接口的实现类
        Thread t = new Thread(run1);
        // 调用start开启新线程，执行run方法
        t.start();

        // 简化代码，使用匿名内部类，实现多线程程序
        Runnable run2 = new Runnable() {
            // 设置线程任务
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新的线程创建了");
            }
        };
        new Thread(run2).start();

        // 继续简化代码
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新的线程创建了");
            }
        }).start();
    }
}