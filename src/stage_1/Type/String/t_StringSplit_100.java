package stage_1.Type.String;

/*
分割字符串的方法：
public String[] split(String regex):按照参数的规则，将字符串切分为若干个部分

注意事项：
split()方法的参数其实是一个正则表达式
如果需要按照英文句点 . 进行划分，则需要使用 \\. （两个反斜杠加一个.）
 */

public class t_StringSplit_100 {
    public static void main(String[] args) {
        String str_1 = "aaa,bbb,ccc";
        String[] array_1 = str_1.split(",");
        System.out.println(array_1); // [Ljava.lang.String;@74a14482
        for (int i = 0; i < array_1.length; i++) {
            System.out.println(array_1[i]);

        }
        System.out.println("======================");
        String str_2 = "aaa bbb ccc";
        String[] array_2 = str_2.split(" ");

        for (int j = 0; j < array_2.length; j++) {
            System.out.println(array_2[j]);

        }

        System.out.println("======================");
        String str_3 = "XXX.YYY.ZZZ";
        String[] array_3 = str_3.split("\\.");
        System.out.println(array_3);
        System.out.println(array_3.length);
        for (int k = 0; k < array_3.length; k++) {
            System.out.println(array_3[k]);

        }
    }

}
