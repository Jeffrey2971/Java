/*
数字和字符的对照关系表（编码表）
ASCII：American standard for information Interchange，美国信息交换标准代码
Unicode：万国码，也是数字和符号的对照关系，开头0-127部分ASCII完全一致，从128开始包含更多字符，甚至包括Emoji

48 - '0' 零
65 - 'A'
97 - 'a'
 */

public class t_ASCII_Unicode_08 {
    public static void main(String[] args) {
        char zi_fu_1 = '1';
        System.out.println(zi_fu_1 + 0);

        char zi_fu_2 = 'A'; // 底层保留数字65

        char zi_fu_3 = 'c'; // 底层保留数字65

        // 左侧是int类型右侧是char类型
        // char --> int
        int num = zi_fu_3;
        System.out.println(num);

        char zi_fu_4 = '中'; //
        System.out.println(zi_fu_4 + 0);


    }
}
