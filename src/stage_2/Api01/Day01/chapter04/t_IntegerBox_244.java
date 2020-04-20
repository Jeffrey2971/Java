package stage_2.Api01.Day01.chapter04;

/*
    基本类型于字符串类型之间的转换
    基本类型-->字符串（String）
        1、基本类型的值 + "" 最简单的方法（工作中常用）
        2、包装类的静态方法toString(参数)，不是Object类中的toString()重载
            toOctalString(int i)以八进制（基数 8）无符号整数形式返回一个整数参数的字符串表示形式。
        3、String类的静态方法valueOf（参数）
            static String valueOf(int i)返回int参数的字符串表示形式
        字符串（String）-->基本类型
            使用包装类的静态方法parseXXX("字符串");
                Integer类：static int parseInt(String s)
                Double类：static double parsedouble(String s)
                ... ...
 */

public class t_IntegerBox_244 {
    public static void main(String[] args) {
        // 基本类型-->字符串（String）
        int i1 = 100;
        String s1 = i1 + ""; // 字符串
        System.out.println(s1 + 200); // 100200

        String s2 = Integer.toString(100);
        System.out.println(s2 + 200);

        String s3 = String.valueOf(100);
        System.out.println(s3 + 200);

        // 字符串（String）-->基本类型
        int i = Integer.parseInt(s1);
        System.out.println(i - 10);

        int a = Integer.parseInt("a");
        System.out.println(a); // NumberFormatException
    }
}
