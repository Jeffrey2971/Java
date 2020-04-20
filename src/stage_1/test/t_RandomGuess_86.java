package stage_1.test;

/*
题目：
用代码模拟猜数字小游戏，结果大了打印大了，小了打印小了，猜对则提示结果正确，三次机会
 */


import java.util.Random;
import java.util.Scanner;

public class t_RandomGuess_86 {
    public static void main(String[] args) {
        Random r = new Random();

        int c = 3;
        int ran = r.nextInt(10) + 1;
        while (1 <= c) {

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入1~10之间的数字，三次机会，当前还有" + c + "次机会！");
            int input = sc.nextInt();
            System.out.println(ran);
            if (input > ran) {
                System.out.println("大了！");
                c--;
            } else if (input < ran) {
                System.out.println("小了！");
                c--;
            } else {
                System.out.println("恭喜，猜对了");
                break;
            }


        }

    }
}
