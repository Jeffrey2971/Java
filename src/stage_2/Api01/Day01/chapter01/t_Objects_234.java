package stage_2.Api01.Day01.chapter01;

import java.util.Objects;

public class t_Objects_234 {
    public static void main(String[] args) {
        String s1 = "abc";
//        String s1 = null;
        String s2 = "abc";
        // boolean b1 = s1.equals(s2); // NullPointerException null是不能调用方法的，否则发生空指针异常
//        System.out.println(b1);
        /*
        Objects类的equals方法：两个对象进行比较，可防止空指针异常
        public static boolean equals(Object a, Object b) {
                return (a == b) || (a != null && a.equals(b));
    }
         */
        boolean b2 = Objects.equals(s1, s2);
        System.out.println(b2);
    }
}
