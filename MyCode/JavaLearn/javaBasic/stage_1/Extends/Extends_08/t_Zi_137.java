package Extends.Extends_08;

/*
super关键字的用法有三种：
1、在子类的成员方法中，访问父类的成员变量。
2、在子类的成员方法中，访问父类的成员方法。
3、在子类的构造方法中，访问父类的构造方法。
 */

public class t_Zi_137 extends t_Fu_136 {
    int num = 20;

    public t_Zi_137() {
        super();
    }

    public void methodZi() {
        System.out.println(super.num); // 父类中的num
    }

    public void method() {
        super.method(); // 访问父类中的method
        System.out.println("子类方法");
    }

}
