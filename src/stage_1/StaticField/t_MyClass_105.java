package stage_1.StaticField;

public class t_MyClass_105 {
    int num; // 成员变量
    static int numStatic; // 静态变量

    // 成员方法
    public void method(){
        System.out.println("这是一个成员方法。");
        System.out.println(num); // 说明成员方法可以访问成员变量
        System.out.println(numStatic); // 说明成员方法可以访问静态变量
    }

    // 静态方法
    public static void methodStatic(){
        System.out.println("这是一个静态方法。");
        System.out.println(numStatic); // 静态方法可以访问静态变量
        System.out.println(/*num*/); // 静态不能直接访问非静态，错误写法
        System.out.println(/*this*/); // 静态方法中不能使用this关键子
    }
}
