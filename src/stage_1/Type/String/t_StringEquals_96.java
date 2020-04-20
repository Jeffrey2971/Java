package stage_1.Type.String;

/*
==是进行对象的地址比较，如果确实需要字符串的内容比较，可以使用两个方法：
public boolean equals(Object obj)：参数可以使任何对象，只有参数是一个字符串且内容相同才会给true否则false
注意事项：
1、任何对象都能使用Object进行接收
2、equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样
3、如果比较双方一个常量一个变量，推荐把常量字符串写在前面
推荐："abc".equals(str)    不推荐：str.equals("abc");

public boolean equalsIgnoreCase(String str)：忽略大小写，进行内容比较

 */
public class t_StringEquals_96 {
    public static void main(String[] args) {
        String str_1 = "Hello";
        String str_2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str_3 = new String(charArray);

        System.out.println(str_1.equals(str_2)); // true
        System.out.println(str_2.equals(str_3)); // true
        System.out.println(str_3.equals("Hello")); // true
        System.out.println("Hello".equals(str_1)); // true

        String str_4 = "hello";
        System.out.println(str_1.equals(str_4)); // false

        String str_5 = null;
        System.out.println("abc".equals(str_5)); // 推荐
//        System.out.println(str_5.equals("abc")); // 不推荐：报错，空指针NullPointerException
        System.out.println("========================");
        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB)); // false 严格区分大小写
        System.out.println(strA.equalsIgnoreCase(strB)); // true，忽略大小写

        System.out.println("abc一123".equalsIgnoreCase("abc壹123")); // false，不想解释



    }


}
