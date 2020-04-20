package stage_1.Day.Day_11.chapter_04;

/*
在多态的代码当中，成员方法的访问规则是：
    看new的是谁，就优先用谁，没有则向上找

口诀：编译看左边，运行看右边。

对比：
成员变量：编译看左边，运行还看左边。
成员方法：编译看左边，运行看右边。

 */

public class t_MultiMethod_193 {
    public static void main(String[] args) {
        t_Fu_190 obj = new t_Zi_191();
        obj.method(); // 父子都有，new的是子，所以优先用子
        obj.methodFu(); // 子类没有，父类有，向上找到父类进行使用
        // 编译看左，左边是Fu，Fu当中没有methodZi方法，所以编译报错。
//        obj.methodZi(); // 错误写法！
    }
}
