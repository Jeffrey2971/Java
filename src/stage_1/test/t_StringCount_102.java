package stage_1.test;

/*
题目：
键盘输入一个字符串，并且统计其各种字符出现的次数并求出总个数
种类有：大写字母，小写字母，数字，其他
 */

import java.util.Scanner;

public class t_StringCount_102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String str = sc.next();
        char[] array = str.toCharArray();
        int b = 0, s = 0, n = 0, o = 0, a = 0;

        for (int i = 0; i < array.length; i++) {
            char ch = array[i];
            a++;
            if (Character.isUpperCase(ch)) {
                b++;
            } else if (Character.isLowerCase(ch)) {
                s++;
            } else if (Character.isDigit(ch)) {
                n++;
            } else {
                o++;
            }


        }
        System.out.println("大写字母有：" + b + "个，小写字母有：" + s + "个，数字有：" + n + "个，其他字符有：" + o + "个，总共有" + a + "个。");
    }


}
