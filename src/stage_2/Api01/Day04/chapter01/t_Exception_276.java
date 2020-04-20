package stage_2.Api01.Day04.chapter01;

/*
    如果finally有return语句则永远返回finally中的结果，避免该情况
 */

public class t_Exception_276 {
    public static void main(String[] args) {
        int a = getA();
        System.out.println(a);
    }

    // 定义一个方法，返回变量a的值
    public static int getA() {
        int a = 10;
        try {
            return a;
        } catch (Exception e) {
            System.out.println(e);

        } finally {
            // 一定会被执行的代码
            a = 20;
            return a;
        }
    }
}
