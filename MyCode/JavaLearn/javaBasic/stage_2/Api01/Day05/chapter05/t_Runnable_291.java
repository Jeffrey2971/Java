package Api01.Day05.chapter05;

/*
创建多线程程序的第二种方式：实现runnable接口
java.lang.Runnable
Runnable 接口应该由那些打算通过某一线程执行其实例的类来实现。类必须定义一个称为 run 的无参数方法。

java.lang.Thread类的构造方法
static class Thread.State线程状态。
static interface Thread.UncaughtExceptionHandler当 Thread 因未捕获的异常而突然终止时，调用处理程序的接口。

实现步骤：
    1、创建一个Runnable接口的实现类
    2、在实现类中重写Runnable接口的run方法，设置线程任务
    3、创建一个Runnable接口的实现类对象
    4、创建Thread类对象，构造方法中传递Runnable接口类实现对象
    5、调用Thread类中的start方法，开启新的线程执行run方法

实现Runnable接口创建多线程程序的好处：
    1、避免了单继承的局限性
        一个类只能继承一个类（一个人只能有一个亲爹），类继承了Thread类就不能继承其它的类
        实现了Runnable接口，还可以继承其它的类，实现其他的接口
    2、增强了程序的扩展性，降低了程序的耦合性（解耦）
        实现Runnable接口的方式，把设置线程任务和开启新的线程进行了分离（解耦）
        实现类中，重写了run方法：用来设置线程任务
        创建Thread类对象，调用start方法：用来开启新的线程
 */

public class t_Runnable_291 {
    public static void main(String[] args) {

        // 3、创建一个Runnable接口的实现类对象
        // t_RunnableImpl_292 run = new t_RunnableImpl_292();

        // 4、创建Thread类对象，构造方法中传递Runnable接口类实现对象
        // Thread t = new Thread(run); // 打印线程名称
        Thread t = new Thread(new t_RunnableImpl_293()); // 打印HelloWorld
        // 5、调用Thread类中的start方法，开 启新的线程执行run方法
        t.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);

        }
    }
}
