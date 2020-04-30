package Api01.Day12.chapter03.test;

/*
    数组当中有多条“姓名+性别”的信息如下,请通过 Predicate 接口的拼装将符合要求的字符串筛选到集合
    ArrayList 中,需要同时满足两个条件:
        1. 必须为女生;
        2. 姓名为4个字。
 */

import java.util.ArrayList;
import java.util.function.Predicate;

public class t_Test_379 {
    /*
     */
    public static ArrayList<String> filter(String[] array, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : array) {
            boolean b = pre1.and(pre2).test(s);
            if (b) {
                list.add(s);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女"};
        ArrayList<String> list = filter(array, (String str) -> {
            return str.split(",")[1].equals("女");
        }, (String str) -> {
            return str.split(",")[0].length() == 4;
        });
        for (String s : list) {
            System.out.println(s);
        }
    }
}
