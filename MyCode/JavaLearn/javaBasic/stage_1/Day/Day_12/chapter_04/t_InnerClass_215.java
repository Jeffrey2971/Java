package Day.Day_12.chapter_04;

/*
如果一个事物的内部包含另一个事物，那么这就是一个类内部包含另一个类。
例如：身体和心脏的关系，又例如汽车和发动机的关系。

分类：
1、成员内部类
2、局部内部类（包含匿名内部类）

成员内部类的定义格式：
修饰符 class 外部类名称 {
    修饰符 class 内部类名称 {
        // ...
    }
    // ...
}

注意：内用外，随意访问；外用内，需要内部类对象。

--------------------------------------------------
使用成员内部类有两种方式：
1、间接方法：在外部类的方法当中，使用内部类；然后main只是调用外部类的方法
2、直接方式，公式：
类名称 对象名 = new 类名称();
【外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称】

 */

public class t_InnerClass_215 {
    public static void main(String[] args) {
        t_Body_216 body = new t_Body_216(); // 外部类的对象
        body.methodBody();  // 通过外部类的对象，调用内部类的方法，里面间接的使用内部类Heart
        System.out.println("-------------------------------------");
        // 按照公式
        t_Body_216.Heart heart = new t_Body_216().new Heart();
        heart.beat();
    }
}
