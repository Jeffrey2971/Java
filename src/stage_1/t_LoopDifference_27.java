package stage_1;

/*
三种循环的区别：
    1、如果条件判断从来没有满足过（false），那么for循环和while循环将会执行0次，但是do-while循环至少会执行一次
    2、for循环的变量在小括号中定义，只有循环内部才可以使用到，while循环和do-while循环初始化语句本来就在外边，所以循环出来之后还可以使用
 */
public class t_LoopDifference_27 {
    public static void main(String[] args) {
        t1();
        t2();
        t3();
    }

    public static void t1() {
        for (int i = 1; i < 0; i++) {
            System.out.println("t1循环成功");
        }
        System.out.println("t1循环失败");
        // System.out.println(i); 错误写法，变量在for里面所以外部调用不到

    }

    public static void t2() {
        int i = 1;
        while (i < 0) {
            System.out.println("t2循环成功");
        }
        System.out.println("t2循环失败");
    }

    public static void t3() {
        int i = 1;
        do {
            System.out.println("t3循环成功");
        } while (i < 0);

    }

}
