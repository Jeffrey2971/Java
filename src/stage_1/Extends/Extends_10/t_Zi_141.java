package stage_1.Extends.Extends_10;

public class t_Zi_141 extends t_Fu_140 {
    int num = 20;

    @Override
    public void method() {
        super.method(); // 调用了父类方法
        System.out.println("子类方法");
    }

    public void show() {
        int num = 30;
        System.out.println(num); // 30
        System.out.println(this.num); //20
        System.out.println(super.num); //10
    }
}
