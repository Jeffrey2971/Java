package stage_1.Day.Day_11.chapter_04;

/*
访问成员变量的两种方式：
1、直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找。
2、间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找。
 */

public class t_MultiField_192 {
    public static void main(String[] args) {
        // 多态的写法，父类引用指向子类对象
        t_Fu_190 obj = new t_Zi_191();
        System.out.println(obj.num);
//        System.out.println(obj.age); 错误写法！
        System.out.println("====================");
//        obj.showNum();
        // 子类没有覆盖重写，就是父:13
        // 子类如果覆盖重写，就是子：20

    }
}
