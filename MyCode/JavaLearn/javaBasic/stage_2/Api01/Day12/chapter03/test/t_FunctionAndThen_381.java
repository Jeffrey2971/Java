package Api01.Day12.chapter03.test;

/*
    Function接口中的默认方法AndThen：用于进行组合操作

    需求：
        把String类型的"123"，转换为Integer类型，把转换后的结果加上10
        把增加之后的Integer类型数据转换为String类型
 */

import java.util.function.Function;

public class t_FunctionAndThen_381 {
    public static void change(String s, Function<String, Integer> fun1, Function<Integer, String> fun2){
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }

    public static void main(String[] args) {
        String s = "123";
        change(s, (str)->Integer.parseInt(str) + 10, (in)->in + "");
    }
}
