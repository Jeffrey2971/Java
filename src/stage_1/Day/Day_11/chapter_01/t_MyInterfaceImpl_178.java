package stage_1.Day.Day_11.chapter_01;

public class t_MyInterfaceImpl_178 /*extends Object*/ implements t_MyInterfaceA_176, t_MyInterfaceB_177 {
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }


    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法");

    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了AB接口当中都有的抽象方法");
    }

    @Override
    public void methodDefault() {

    }
}
