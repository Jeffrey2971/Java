package stage_1.Extends.Extends_03;

public class t_Zi_123 extends t_Fu_122 {

    int num = 20;
    public void method(){
        int num = 30;
        System.out.println(num); // 30，局部变量
        System.out.println(this.num); // 20，本类的成员变量
        System.out.println(super.num); // 10，父类的成员变量
    }
}
