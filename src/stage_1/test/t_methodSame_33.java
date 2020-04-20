package stage_1.test;

/*
题目要求：
定义一个方法，用来判断两个数字是否相同
 */
public class t_methodSame_33 {
    public static void main(String[] args) {
        boolean result = isSame_t1(6, 6);
        System.out.println("======================");
        System.out.println("方法一：" + result);
        System.out.println("======================");
        System.out.println("方法二：" + isSame_t2(12, 13));
        System.out.println("======================");
        System.out.println("方法三：" + isSame_t3(122, 13));
        System.out.println("======================");
        System.out.println("方法四：" + isSame_t4(122, 123));
        System.out.println("======================");
        System.out.println("方法五：" + isSame_t4(122, 123));
        System.out.println("======================");
        System.out.println("方法六：" + isSame_t5(520, 520));




    }

    /*
    创建方法前应该明确三要素：
        1、返回值类型：布尔类型
        2、方法名称：名称应明确作用
        3、参数列表：参数
     */
    public static boolean isSame_t1(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSame_t2(int a, int b) {
        boolean same;
        same = a == b ? true : false;
        return same;
    }

    public static boolean isSame_t3(int a, int b) {
        boolean same;
        if (a == b) {
            same = true;

        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSame_t4(int a, int b) {
        boolean same = a == b;
        return same;

    }

    public static boolean isSame_t5(int a, int b) {
        return a == b;
    }

}
