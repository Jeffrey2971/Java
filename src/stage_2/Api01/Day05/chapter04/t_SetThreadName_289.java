package stage_2.Api01.Day05.chapter04;

public class t_SetThreadName_289 {
    public static void main(String[] args) {
        // 开启多线程
        t_MyThread_288 mt = new t_MyThread_288();
        mt.setName("张雯蔚");
        mt.start();

        // 开启多线程
        new t_MyThread_288("玮海琼").start();
    }
}
