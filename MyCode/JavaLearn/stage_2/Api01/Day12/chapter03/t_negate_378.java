package Api01.Day12.chapter03;

/*
    需求：判断一个字符串长度是否大于5，如果字符串长度大于5，那么返回false，如果字符串的长度不大于5返回true
    可使用取反符号！，对结果进行取反
    Predicate中有一个方法negate，也表达式取反

    default Predicate<T> negate() {
    return (t) ‐> !test(t);
    }


*/

import java.util.function.Predicate;

public class t_negate_378 {
    public static boolean checkString(String s, Predicate<String> pre){
        // return !pre.test(s);
        return pre.negate().test(s);
    }

    public static void main(String[] args) {
        String s = "jeffrey";
        boolean b = checkString(s, (str) ->s.length() > 5);
        System.out.println(b);
    }


}
