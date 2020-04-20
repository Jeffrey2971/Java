package stage_1.Extends.Extends_07;

public class t_Zi_135 extends t_Fu_134 {
    public t_Zi_135(){
//        super(); // 在调用父类无参构造方法，如不写编译器将默认填上
        super(30); // 在调用父类重载的构造方法
        System.out.println("子类构造方法！");
    }

    public void method(){
//        super(); 错误写法！只有子类构造方法才能够调用父类构造方法
    }
}
