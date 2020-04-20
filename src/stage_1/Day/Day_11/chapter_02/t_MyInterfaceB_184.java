package stage_1.Day.Day_11.chapter_02;

public interface t_MyInterfaceB_184 {
    public abstract void methodB();
    public abstract void methodCommon();

    public default void methodDefault(){
        System.out.println("BBB");
    }
}
