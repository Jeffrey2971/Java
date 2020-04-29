package Api01.Day12.chapter03;


import java.util.function.Predicate;

public class t_Predicate_376 {
    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        String s = "jeffrey";
        boolean b = checkString(s, (str)->{
            return str.length() > 5;
        });
        System.out.println(b);
    }
}
