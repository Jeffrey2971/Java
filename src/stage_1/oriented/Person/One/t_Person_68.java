package stage_1.oriented.Person.One;

/*
问题描述：定义Person的年龄是，无法阻止不合理的住址被设置进来。
解决方案：用private关键字将需要被保护的成员变量进行修饰

一旦使用private 进行修饰，那么本类当中仍然可以随意访问，但是，超出了本类范围之外就不能直接进行访问

间接访问private成员变量，就是定义一对儿Getter/Setter

必须叫setXxx或者是getXxx命名规则
对于getter来说，不能有参数，返回值类型和成员变量对应
对于Setter来说，不能有返回值，参数类型和成员变量对应
 */
public class t_Person_68 {
    String name;
    private int age;

    public void show() {
        System.out.println("我叫：" + name + "，今年：" + age);
    }

    // 这个成员方法，专门用于age设置数据
    public void setAge(int num) {
        if (num < 100 && num >= 0) { // 如果是合理情况
            age = num;
        } else {
            System.out.println("数据不合理！");
        }

    }

    // 这个成员方法专门获取age的数据
    public int getAge() {
        return age;
    }
}
