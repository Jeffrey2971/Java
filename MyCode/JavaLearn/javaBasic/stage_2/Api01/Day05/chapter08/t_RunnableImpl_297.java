package Api01.Day05.chapter08;

/*
买票案例出现了线程安全问题，卖出了不存在的票和重复的票
解决线程安全问题的第二种方案：同步方法
使用步骤：
    1、把访问了共享数据的代码抽取出来放到一个方法中
    2、在方法上添加一个synchronized修饰符

格式：定义方法的格式
    修饰符 synchronized 返回值类型 方法名称(参数列表){
        // 可能会出现线程安全的代码（访问了共享数据的代码）
    }


注意事项：
    1、同步代码块中的锁对象，可以使任意的对象
    2、但是必须保证多个线程使用的锁对象是同一个
    3、锁对象作用：
        把同步代码块锁住，只让一个线程在同步代码块中执行
 */

public class t_RunnableImpl_297 implements Runnable {
    // 设置线程任务：卖票
    // 定义一个多个线程的共享票源
    // private int ticket = 1000;
    static int ticket = 1000;

    @Override
    public void run() {
        System.out.println("this：" + this);
        // 使用死循环，让卖票操作重复执行
        while (true) {
            if (ticket == 0) {
                System.out.println("票已卖完");
                break;
            }
//            SellTicket();
            SellTicketStatic();
        }
    }


    /*
    静态的同步方法
    锁对象不能再是this，this是创建对象之后产生的，静态方法优先于对象
    静态方法的锁对象是本类的class属性-->class文件对象（反射）
     */
    public static /*synchronized*/ void SellTicketStatic() {
        synchronized (t_RunnableImpl_297.class) {
            /*synchronized (obj) {*/
            // 先判断票是否存在
            if (ticket > 0) {
                // 提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 票存在，卖票，ticket --
                System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                ticket--;

            }
        }
    }

    /*
    定义一个同步方法
    同步方法也会把方法内部的代码给锁住
    只让一个线程执行
    同步方法的锁定对象是实现类对象 new RunnableImpl()
    也就是this
     */

    public /*synchronized*/ void SellTicket() {
        // 同步代码块
        synchronized (this) {
            /*synchronized (obj) {*/
            // 先判断票是否存在
            if (ticket > 0) {
                // 提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 票存在，卖票，ticket --
                System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                ticket--;

            }
        }
    }
}

