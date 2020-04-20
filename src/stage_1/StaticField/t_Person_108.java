package stage_1.StaticField;

/*
静态代码块的格式：

public class 类名称{
    static {
        // 静态代码块的内容
    }
}

特点：当第一次用到本类时：静态代码块执行唯一的一次。

 */

public class t_Person_108 {
    static {
        System.out.println("静态代码块执行！");
    }
    public t_Person_108(){
        System.out.println("构造方法执行");
    }
}
