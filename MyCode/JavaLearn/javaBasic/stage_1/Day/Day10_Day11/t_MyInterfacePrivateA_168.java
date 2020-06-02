package Day.Day10_Day11;

/*
问题描述：
我们需要抽取一个公有方法，用来解决两个默认方法之间重复代码的问题。
但是这个公有方法不应该让实现类使用，应该是私有化的。

解决方案：
从Java9开始，接口当中允许定义私有方法。
1、普通私有方法，解决多个默认方法之间重复代码的问题
格式：
private 返回值类型 方法名称（参数列表）{
    方法体
}
2、静态私有方法，解决多个静态方法之间的重复代码问题
格式：
private static 返回值类型 方法名称(参数列表){
    方法体
}
 */

public interface t_MyInterfacePrivateA_168 {

    public default void methodDefault() {
        System.out.println("这是一个默认方法1");
        methodCCommon();

    }


    public default void methodDefault2() {
        System.out.println("这是一个默认方法2");
        methodCCommon();
    }

    private void methodCCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
