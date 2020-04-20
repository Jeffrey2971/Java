package stage_1.Extends.Extends_02;

/*
在父子类的关系继承当中，如果成员变量重名，则创建对象时，访问有两种方式：

直接：直接通过子类对象访问成员变量：
    等号左边是谁就优先用谁，没有则向上找
间接：间接通过成员方法访问成员变量：
    该方法属于谁，就优先用谁，没有则向上找


 */

public class t_ExtendsField_120 {
    public static void main(String[] args) {

        // 创建父类对象
        t_Fu_118 fu = new t_Fu_118();

        // 只能使用父类的东西，没有子类的任何内容
        System.out.println(fu.numFu);
        System.out.println("========================");

        // 子类继承了父类
        t_Zi_119 zi = new t_Zi_119();
        System.out.println(zi.numFu); // 10
        System.out.println(zi.numZi); // 20
        System.out.println("========================");

        // 等号左边是谁就优先用谁，没有则向上找
        System.out.println(zi.num); // 优先子类：200
//        System.out.println(zi.abc); // 到处都没有，编译报错！
        System.out.println("========================");

        // 这个方法是子类的，优先用子类的，如果没有再向上找
        zi.methodZi();

        // 这个方法是在父类当中定义的
        zi.methodFu(); // 100


    }
}
