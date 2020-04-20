package stage_1.Day.Day10_Day11;

/*
1、接口的默认方法，可以通过接口实现类对象，直接调用。
2、接口的默认方法，也可以被接口实现类进行覆盖重写。
 */

public class t_Interface_163 {
    public static void main(String[] args) {
        // 创建了实现类对象
        t_MyInterfaceDefaultA_170 a = new t_MyInterfaceDefaultA_170();
        a.methodAbs(); // 调用抽象方法，实际运行的是右侧的实现类
        a.methodDefault(); // 这是新添加的默认方法
        System.out.println("=======================");
        t_MyInterfaceDefaultB_171 b = new t_MyInterfaceDefaultB_171();
        b.methodAbs();
        b.methodDefault();
    }
}
