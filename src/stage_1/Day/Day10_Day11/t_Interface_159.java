package stage_1.Day.Day10_Day11;
/*
代码当中接口就是多个类的公共规范
接口是一种引用数据类型，最重要的内容就是其中的：抽象方法。
如何定义一个接口的格式：
public interface 接口名称 {
    // 接口的内容
}

备注：换成了interface之后，编译生成的字节码文件仍然是：.java -- > .class

如果是java 7 ，那么接口中包含的内容有：
1、常量：不能发生改变的量
2、抽象方法

如果是Java8，还可以额外包含有：
3、默认方法
4、静态方法

如果是Java9，还可以额外包含有：
5、私有方法

接口使用步骤：
1、接口不能直接使用，必须有一个实现类来实现该接口。
格式：
public class 实现类名称 implements 接口名称{
    // ...
}
2、接口的实现类必须覆盖重写（实现）接口中的抽象方法
去掉abstract关键字，加上方法体大括号。
3、创建实现类的对象，进行使用。

注意事项：
1、如果实现类并没有覆盖重写接口中的所有抽象方法，那么这个实现类自己必须就是抽象类
 */
public class t_Interface_159 {
    public static void main(String[] args) {
        t_MyInterfaceAbstract_160 impl = new t_MyInterfaceAbstractImpl_161();
        impl.methodAbs2();
        impl.methodAbs2();
    }
}
