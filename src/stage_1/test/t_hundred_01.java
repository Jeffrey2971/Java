package stage_1.test;

/*
题目：求出1-100之间的基偶数,并算出他们的和。
思路：
    1、既然范围已经确定了是1-100之间，那么只需检查每个数
    2、共有100个数字，并非所有数字都是都能用，需要判断(if)：num % 2 == 0
    3、
 */

public class t_hundred_01 {
    public static void main(String[] args) {
        idea_one();
//        idea_two();
    }

    // 方法一
    public static void idea_one() {
        int base = 0;
        int even = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "是一个偶数");
                even += i;
            } else {
                System.out.println(i + "是一个基数");
                base += i;
            }

        }
        System.out.println("偶数的和是：" + base + "\n基数的和是：" + even);
    }

    // 方法二
    public static void idea_two() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("结果是：" + sum);
    }

}
