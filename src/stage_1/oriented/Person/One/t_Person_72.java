package stage_1.oriented.Person.One;

/*
当方法的局部变量和类的成员变量重名的时候，根据"就近原则"，会使用局部变量
如果需要访问本类当中的成员变量，需要使用格式：
this.成员变量名

通过谁调用的方法，谁就是this
 */

public class t_Person_72 {
    String name; // 名字

    // 参数name是对方的名字
    // 成员变量里面的name是自己的名字
    public void sayHello(String name) {
        System.out.println(name + "你好，我是" + this.name);
        System.out.println(this);
    }
}
