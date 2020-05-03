package Api01.Day12.chapter03.test;

import java.util.function.Predicate;

public class t_Predicate_376 {
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.and(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "jeffrey";
        boolean b = checkString(s, (str) ->s.length() > 5, (str) ->s.contains("y"));
        System.out.println(b);
    }


}
