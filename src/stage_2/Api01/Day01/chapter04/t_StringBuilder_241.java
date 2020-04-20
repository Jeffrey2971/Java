package stage_2.Api01.Day01.chapter04;

/*
    StringBuilder和String可以互相转换：
        String --> StringBuilder：可以使用StringBuilder的构造方法
              StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
        StringBuilder --> String：可以使用StringBuilder中的toString方法


 */

public class t_StringBuilder_241 {
    public static void main(String[] args) {
        // String --> StringBuilder
        String str = "hello";
        System.out.println("str：" + str);
        StringBuilder bu1 = new StringBuilder(str);
        System.out.println(bu1);
        // 往String当中添加一些数据
        bu1.append("world");
        System.out.println("bu1：" + str);
        System.out.println(bu1);

        // StringBuilder --> String
        String s = bu1.toString();
        System.out.println("s" + s);
    }
}
