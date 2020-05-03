package Api01.Day09.chapter01;

/*
lambda表达式的标准标准格式，由三部分组成：
    1、一些参数
    2、一个箭头
    3、一段代码
格式：
    (参数列表) -> {重写方法的代码};
格式说明：
    ()：接口中抽象方法的参数列表，没有参数就空着，有参数就写出参数，多个参数用都好进行分割
    ->：传递的意思，把参数传递给方法体{}
    {}：重写接口的抽象方法的方法体
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

        // 优化省略Lambda
        new Thread(() -> System.out.println(Thread.currentThread().getName() + "使用lambda创建了新的线程")).start();
    }
}
