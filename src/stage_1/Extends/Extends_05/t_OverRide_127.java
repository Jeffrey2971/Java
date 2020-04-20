package stage_1.Extends.Extends_05;

/*
重写（Override）
概念：在继承关系当中，方法的名称一样，参数列表也一样 重写！=重载

重写（override）：方法的名称一样，参数列表 也一样
重载（overload）：方法的名称一样，参数列表 不一样

方法的覆盖重写特点：创建的是子类对象，则优先用子类方法。

方法覆盖重写的注意事项：

1、必须保证父子类之间方法的名称相同，参数列表也相同
@Override：写在方法前面，用来检测是不是有效的正确覆盖从写
这个注解就算不写，只要满足要求，也是正确的方法覆盖从写

2、子类方法的返回值必须小于等于父类的方法返回值范围。
Java.land.Object类是所有类的公共最高父类（祖宗类），java.land.String就是object的子类

3、子类方法的权限必须大于等于父类方法的权限修饰符
public > protected > (default) > private
备注：（default）不是关键字default，而是什么都不写，留空
 */

public class t_OverRide_127 {
    private int num;
}
