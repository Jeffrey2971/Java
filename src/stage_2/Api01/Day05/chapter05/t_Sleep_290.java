package stage_2.Api01.Day05.chapter05;

/*
    static void	sleep(long millis)在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），此操作受到系统计时器和调度程序精度和准确性的影响。
    毫秒数结束之后，线程继续执行
 */

public class t_Sleep_290 {
    public static void main(String[] args) throws InterruptedException {
        // 模拟秒表
        for (int i = 0; i < 60; i++) {
            System.out.println(i);
            // 使用Thread类的sleep方法让程序睡眠一秒
            Thread.sleep(1000);
        }

    }
}
