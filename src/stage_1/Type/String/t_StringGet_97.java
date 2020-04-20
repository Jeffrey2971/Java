package stage_1.Type.String;


/*
String当中与获取相关的常见方法有：
public int length()：获取字符串当中含有的字符个数，拿到字符串长度
public String concat(String str)：将当前字符串和参数字符串拼接成为返回值的新的字符串
public char charArray(int index)：获取指定索引位置的单个字符。（从0开始）
public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有则返回-1值
 */

public class t_StringGet_97 {
    public static void main(String[] args) {
        // 获取字符串长度
        int length = "12312312dfvdfjgiodfjgkdfjv`1!~".length();
        System.out.println("字符串长度是："+ length);

        // 拼接字符串
        String str_1 = "Hello";
        String str_2 = "World";
        String str_3 = str_1.concat(str_2);
        System.out.println(str_1); // Hello
        System.out.println(str_2); // World
        System.out.println(str_3); // HelloWorld，新的字符串
        System.out.println("======== // true=============");

        // 获取制定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println(ch);
        System.out.println("=====================");

        // 查找参数字符串在原本的字符串当中出现的第一次索引位置
        // 如果根本没有 返回值是 -1
        String original_1 = "HelloWorldHelloWorldHelloWorld";
        int index_1 = original_1.indexOf("llo");
        System.out.println(index_1);
        int index_2 = original_1.indexOf("abc");
        System.out.println(index_2);
        System.out.println("=====================");




    }
}
