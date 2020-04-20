package stage_2.Api01.test;

/*
题目：根据输入的字符串，计算每个字符串的个数
 */

import java.util.HashMap;
import java.util.Scanner;

public class t_MapTest_262 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()
        ) {
            if(map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c, value);
            }else{
                map.put(c, 1);
            }

        }


    }
}
