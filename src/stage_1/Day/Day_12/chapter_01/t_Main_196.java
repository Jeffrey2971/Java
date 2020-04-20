package stage_1.Day.Day_12.chapter_01;

/*
向上转型一定是安全的，没有问题的，正确的，但也有一个避短按：
一旦向上转型为父类，那么就无法调用子类原本特有的内容

解决方案：用对象的向下转型还原
 */

public class t_Main_196 {
    public static void main(String[] args) {
        // 对象的向上转型，就是：父类引用指向子类对象
        t_Animal_194 animal = new t_Cat_195();  // 本来创建的时候是一只猫
        animal.eat(); // 猫吃鱼
//        animal.catchMouse(); 错误写法
        // 向下转型，进行 还原动作
        t_Cat_195 cat = (t_Cat_195) animal;
        cat.catchMouse(); // 猫抓老鼠

        // 下面的是错误的向下转型
        // 本来new的时候是一只猫，现在非要当做狗
        // java.lang.ClassCastException 类转换异常
//        t_Dog_197 dog = (t_Dog_197) animal; // 错误写法！编译不会报错，但是运行会出现异常

    }
}
