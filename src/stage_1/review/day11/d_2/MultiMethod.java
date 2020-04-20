package stage_1.review.day11.d_2;

/*
在多态的代码当中，成员方法的访问规则是：
    看new的是谁，则优先用谁，没有则向上找。

注意：编译看左边，运行看右边

对比：
成员变量：编译看左边，运行还看左边
成员方法：编译看左边，运行看右边
 */

public class MultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi(); // 多态
        obj.method(); // 父子都有，优先用子
        obj.methodFu(); // 子类没有，父类有，则向上找

//        obj.methodZi(); // 错误，编译看左边，Fu没有，报错！
    }
}
