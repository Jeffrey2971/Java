package stage_1.test;

/*
题目要求：
比较两个数据是否相等
参数类型分别是两个byte类型，两个short类型，两个int类型，两个long类型
并在main中进行测试

 */
public class t_methodOverload_37 {
    public static void main(String[] args) {
        short a = 30;
        short b = 20;
        System.out.println(isSame(a, b));
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("t1执行了");
        return a == b;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("t2执行了");

        return a == b;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("t3执行了");

        return a == b;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("t4执行了");

        return a == b;
    }


}
