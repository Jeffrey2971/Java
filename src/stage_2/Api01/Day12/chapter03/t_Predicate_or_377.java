package Api01.Day12.chapter03;

/*
    需求：判断一个字符串，有两个判断条件
        1、字符串的长度是否大于5
        2、判断字符串内是否包含字符A
    两个条件满足一个即可，可使用||运算符连接两个条件

    Predicate接口中有一个方法or，表示或者关系，也可用于连接两个判断条件

    default Predicate<T> or(Predicate<? super T> other) {
    Objects.requireNonNull(other);
    return (t) ‐> test(t) || other.test(t);
}
    方法内部的两个判断条件，也是使用或运算符连接起来的
*/

import java.util.function.Predicate;

public class t_Predicate_or_377 {
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2){

        // return pre1.test(s) || pre2.test(s);
        return pre1.or(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "jeffrey";
        boolean b = checkString(s, (str) -> {
            return s.length() > 5;
        }, (str) -> {
            return s.contains("m");
        });
        System.out.println(b);
    }
}
