package stage_2.Api01.Day05.chapter04;

/*
设置线程名称（了解）：
    1、使用Thread类中的方法setName(name)
        void setName(String name)改变线程名称，使之与参数 name 相同。
    2、创建一个带参数的构造方法，传输传递线程的名称，调用父类的参数构造方法，把线程名称传递给父类，让父类（Thread）给子线程能够起名
        Thread(String name)分配新的 Thread 对象。
 */

public class t_MyThread_288 extends Thread{
    public t_MyThread_288(){}
    public t_MyThread_288(String name){
        super(name);
    }
    @Override
    public void run() {
        // 获取线程的名称
        System.out.println(Thread.currentThread().getName());
    }
}
