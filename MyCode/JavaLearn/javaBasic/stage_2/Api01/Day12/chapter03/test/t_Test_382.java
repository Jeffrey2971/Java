package Api01.Day12.chapter03.test;

/*
    要求：
        请使用 Function 进行函数模型的拼接,按照顺序需要执行的多个函数操作为:
            String str = "赵丽颖,20";

            1. 将字符串截取数字年龄部分,得到字符串;
            2. 将上一步的字符串转换成为int类型的数字;
            3. 将上一步的int数字累加100,得到结果int数字。
 */

import java.util.function.Function;

public class t_Test_382 {
    public static int change(String s, Function<String, String> fun1, Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
        return fun1.andThen(fun2).andThen(fun3).apply(s);

    }

    public static void main(String[] args) {
        String s = "陈禧,20";
        int num = change(s, (str) -> str.split(",")[1], (str) -> Integer.parseInt(str), (i) -> i + 100);
        System.out.println(num);
    }

}
