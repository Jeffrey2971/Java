package stage_1.Day.Day_11.chapter_01;

public interface t_MyInterfaceA_176 {
//    static{}  错误写法！接口不能有静态代码块
//    public t_MyInterface_176(){} 错误写法！接口不能有构造方法
    public abstract void methodA();
    public abstract void methodAbs();
    public default void methodDefault(){
        System.out.println("默认方法AAA");
    }
}
