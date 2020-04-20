package stage_1.Type.String;

/*
String当中与转换相关的常用方法有：
public char[] toChatArray()：将当前字符串拆分成为数组作为返回值
public byte[] getBytes()：获得当前字符串底层的字节数组
public String replace(CharSequence oldString, CharSequence newString)：
将所有出现的老字符串特环成为新的字符串，返回替换之后的结果新字符串
备注：CharSequence意思就是说可以接受字符串类型

 */

public class t_StringConvert_99 {
    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("===================");

        // 转换成为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("==============");
        String str_1 = "HelloWorld";
        String str_2 = str_1.replace("l", "*");
        System.out.println(str_1);
        System.out.println(str_2);
        System.out.println("==============");

        String lang_1 = "你个傻逼东西！傻逼傻逼傻逼";
        String lang_2 = lang_1.replace("傻逼", "**");
        System.out.println(lang_1);
        System.out.println(lang_2);

    }
}
