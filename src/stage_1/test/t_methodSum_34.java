package stage_1.test;

/*
题目要求：定义一个方法，用来求出1-100之间所有数字的和
 */
public class t_methodSum_34 {
    public static void main(String[] args) {
        int num = sum();
        System.out.println("返回的结果是：" + num);
    }

    public static int sum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {

            sum += i;
        }

        return sum;

    }


}
