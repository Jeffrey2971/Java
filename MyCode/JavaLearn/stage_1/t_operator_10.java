/*
四则运算单重的+有常见的三种用法：
    1、对于数值来说，那就是加法
    2、对于字符char类型来说，在计算之前，char会被提升为int,然后再计算
    char类型字符，和int类型数字，之间的对照关系表：ASCII，UNICODE
    3、字符串：对于字符串String(首字母大写，并不是关键字)来说，加好代表字符串连接操作
    任何数据类型和字符串进行连接时，结果都会变成字符串
 */
public class t_operator_10 {
    public static void main(String[] args) {
        // 字符串类型变量基本使用
        // 数据类型 变量名称 = 数据值;
        String str_1 = "Hello";
        System.out.println(str_1 + "你好");

        // String + int --> String
        String str_2 = "Java";
        System.out.println(str_2 + 20);

        // 优先级问题
        // String + int + int
        // String       + int
        // String       + int
        System.out.println(str_2 + (20 + 30));
        System.out.println(str_2 + 20 + 30);
    }
}
