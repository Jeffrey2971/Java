package Extends.Extends_11;

/*
抽象方法：加上abstract方法，然后去掉大括号，直接分号结束
抽象类：抽象方法所在的类，必须是抽象类才行，在class之前写上abstract即可

如何使用抽象类和抽象方法：
1、不能直接new抽象对象。
2、必须用一个子类来继承抽象父类
3、子类必须覆盖重写抽象父类当中的所有抽象方法
    覆盖重写（实现）：去掉抽象方法的abstract关键字，然后不上方法体大括号
4、创建子类对象进行使用

注意事项：
一个抽象类不一定含有抽象方法，
只要保证抽象方法所在的类是抽象类即可。

这样没有抽象方法的抽象类，也不能直接创建对象，在一些特殊场景下有用途。
 */

public abstract class

t_Animal_143{

    // 这是一个抽象方法，代表吃东西，但是具体吃什么（大括号的内容）不确定
    public abstract void eat();

    // 普通成员方法
    public void normalMethod(){

    }
}