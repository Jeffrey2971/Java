package stage_1.oriented.Three;

/*
一个标准的标准的类通常需要满足以下四个组成部分：
1、所有的成员变量都要使用private关键字进行修饰
2、为每一个成员变量编写一对Getter/Setter方法
3、编写一个无参数的构造方法
4、编写一个全参数的构造方法

这样的标准类也叫作 Java Bean

 */

public class t_Student_76 {
    private String name;
    private int age;

    public t_Student_76() {
    }

    public t_Student_76(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
