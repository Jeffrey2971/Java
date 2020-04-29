package Api01.Day12.chapter03;

/*
    例如 java.lang.Runnable 接口就是一个函数式接口,假设有一个 startThread 方法使用该接口作为参数,那么就
    可以使用Lambda进行传参。这种情况其实和 Thread 类的构造方法参数为 Runnable 没有本质区别。
 */

public class t_Runnable_367 {
    // 定义一个方法startThread，方法的参数使用个函数式接口Runnable
    public static void startThread(Runnable run){
        // 开启多线程
        new Thread(run).start();
    }

    public static void main(String[] args) {
        // 调用startThread方法，方法的参数是一个接口，那么可以传递这个接口的匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "启动了");
            }
        });

        // 调用startThread方法，方法的参数是一个函数式接口，所以可以传递lambda表达式进行优化
        startThread(()->{
            System.out.println(Thread.currentThread().getName() + "启动了");
        });

        // 再次优化lambda表达式
        startThread(()-> System.out.println(Thread.currentThread().getName()));
    }
}
