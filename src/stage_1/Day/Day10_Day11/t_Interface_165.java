package stage_1.Day.Day10_Day11;
/*
注意：不能通过接口实现类的对象来调用接口当中的静态方法。

正确用法：通过接口名称，直接调用其中的静态方法。
格式：接口名称.静态方法名（参数）;
 */


public class t_Interface_165 {
    public static void main(String[] args) {
        // 创建了实现类对象
        t_MyInterfaceStaticImpl_166 impl = new t_MyInterfaceStaticImpl_166();
        // 错误写法！
//        impl.methodStati();

        // 直接通过接口名称调用静态方法
        t_MyInterfaceStatic_164.methodStatic();

    }
}
