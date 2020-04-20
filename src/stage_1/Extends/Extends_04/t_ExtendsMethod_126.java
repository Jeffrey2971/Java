package stage_1.Extends.Extends_04;

/*
在父子类的继承关系当中，创建子类对象，访问成员方法的规则：
    创建的对象是谁，就优先用谁，如果没有则向上找

主题是想：
不论是成员方法还是成员变量，如果没有都是向上找，绝对不会向下找。

重写（Override）
概念：在继承关系当中，方法的名称一样，参数列表也一样 重写！=重载

重写（override）：方法的名称一样，参数列表 也一样
重载（overload）：方法的名称一样，参数列表 不一样

方法的覆盖重写特点：创建的是子类对象，则优先用子类方法。
 */

public class t_ExtendsMethod_126 {
    public static void main(String[] args) {
        t_Zi_125 zi = new t_Zi_125();
        zi.methodFu();
        zi.methodZi();
        // 创建的是new了子类的对象，所有优先用子类方法 【覆盖，复写】
        zi.method();
    }
}
