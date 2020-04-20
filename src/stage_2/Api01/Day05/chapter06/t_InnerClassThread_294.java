package stage_2.Api01.Day05.chapter06;

/*
匿名内部类方式实现线程创建
匿名：没有名字
内部类：写在其他类内部的类

匿名内部类：简化代码，把子类继承父类，重写父类的方法，创建子类对象合成一步完成，或把实现类接口，重写接口中的方法，创建实现类对象合成一步完成
匿名内部类最终产物：子类/实现类对象，而这个类没有名字

格式：new 父类/或接口(){
    // 重写父类/接口中的方法
};
 */

public class t_InnerClassThread_294 {
    public static void main(String[] args) {
        // 线程的父类是Thread
        // new MyThread().start();
        new Thread() {
            // 重写run方法，设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + "黑马" + i);
                }
            }
        }.start();

        // 线程的接口Runnable
        // RunnableImpl r = new RunnableImpl(); 多态
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "白马" + i);
                }
            }
        };

        new Thread(r).start();

        // 简化接口的方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "黑白马" + i);
                }
            }
        }).start();
    }
}

