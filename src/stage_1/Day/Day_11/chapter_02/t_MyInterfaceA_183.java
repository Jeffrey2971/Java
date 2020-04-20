package stage_1.Day.Day_11.chapter_02;

public interface t_MyInterfaceA_183 {
    public abstract void methodA();
    public abstract void methodCommon();

    public default void methodDefault(){
        System.out.println("AAA");
    }

}
