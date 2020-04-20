package stage_1.Extends.Extends_01;

/*
在继承的关系中，子类就是一个父类，也就是说，子类可以被当做父类看待
例如父类是员工，子类是讲师，那么讲师就是一个员工，关系：is-a

定义父类格式：（一个普通的类定义）
public class 父类名称{
    // ...
}

定义子类的格式：
public class 子类名称 extends 父类名称{
    // ...
}
 */

public class t_Extends_114 {
    public static void main(String[] args) {

        // 创建了一个子类对象
        t_Teacher_116  teacher = new t_Teacher_116();

        // Teacher类当中虽然什么都没写，但是会继承来自父类method方法
        teacher.method();

        // 创建另一个子类：助教的对象
        t_Assistant_117 assistant = new t_Assistant_117();
        assistant.method();
    }

}
