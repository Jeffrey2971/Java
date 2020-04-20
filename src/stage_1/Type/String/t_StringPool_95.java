package stage_1.Type.String;

/*
字符串常量池，程序当中直接写上山引号的字符串，就在字符串常量池当中

对于基本类型来说 == 是用于数值比较
对于引用类型来说 == 是用于进行地址值的比较
 */

public class t_StringPool_95 {
    public static void main(String[] args) {
        String str_1 = "abc";
        String str_2 = "abc";

        char[] charArray = {'a', 'b', 'c'};
        String str_3 = new String(charArray);

        System.out.println(str_1 == str_2);
        System.out.println(str_1 == str_3);
        System.out.println(str_2 == str_3);
    }
}
