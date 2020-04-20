package stage_1.Type.String;

/*
java.lang.String代表字符串
API当中说：Java程序中的所有字符串字面值（如“abc”）都作为此类的实例实现
也就是：程序当中所有的双引号字符串，都是String类的对象，就算没有new也照样是

字符串的特点：
1、字符串的内容永不可变
2、正是因为字符串不可改变，所以字符串是可以共享使用的
3、字符串效果上相当于是char[]字符数组，底层原理是byte[]字节数组

创建字符串常见的3+1种方式
三种构造方法：
public String()：创建一个空白字符串，不含有任何内容
public String(char[] array)：根据字符数组的内容，来创建对应的字符串
public String(byte[] array)：根据字节数组的内容，来创建对应的字符串
一种直接创建：
String str = "Hello"; 右边直接用双引号

注意：直接写上双引号就是字符串对象
 */

public class t_String_94 {
    public static void main(String[] args) {
        // 使用空参创建
        String str_1 = new String(); // 小括号留空，说明字符串什么内容都没有
        System.out.println("第一个字符串：" + str_1);

        // 根据字符数组创建字符串
        char[] charArray = {'A', 'B', 'C'};
        String str_2 = new String(charArray);
        System.out.println("第二个字符串：" + str_2);

        // 根据字节数组来创建字符串
        byte[] byteArray = {97, 98, 99};
        String str_3 = new String(byteArray);
        System.out.println("第三个字符串：" + str_3);

        // 直接创建
        String str_4 = "Hello";
        System.out.println("第四个字符串：" + str_4);
    }

}
