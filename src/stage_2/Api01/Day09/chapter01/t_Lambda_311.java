package Api01.Day09.chapter01;

/*

 */

public class t_Lambda_311 {
    public static void main(String[] args) {
        // 继续简化代码，使用匿名内部类的方式，实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新的线程创建了");
            }
        }).start();
        // 使用Lambda表达式实现多线程
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "使用lambda创建了新的线程");
        }
        ).start();
    }
}
