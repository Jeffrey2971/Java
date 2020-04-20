package stage_1.Day.Day_11.chapter_02;

/*
这个子接口当中有四个接口
methodA 来源于接口A
methodB 来源于接口B
methodCommon 同事来源于接口A和B
method 来源于自己
 */

public interface t_MyInterface_185 extends t_MyInterfaceA_183, t_MyInterfaceB_184 {
    public abstract void method();

    @Override
    public default void methodDefault() {

    }
}
