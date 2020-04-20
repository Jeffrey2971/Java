package stage_1.test;

/*
题目：请使用Arrays相关的API，讲一个随机数组中的所有字符升序排列，并倒序打印
 */

import java.util.Arrays;
import java.util.Scanner;

public class t_ArraysPractise_111 {
    public static void main(String[] args) {
        System.out.println("请输入：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        for (int x = 0; x < chars.length; x++) {
            System.out.print(chars[x]);

        }

    }
}
