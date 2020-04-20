package stage_1;

/*
比较运算符
>：大于
<：等于
>=：大于等于
<=：小于等于
==：对等
!=：不等于

注意事项：
    1、比较运算符的结果一定是个布尔类型，true或false
    2、如果进行多次判断，不能连着一起写，例如：1 < x < 3，程序中不允许这样的写法

 */
public class t_operator_13 {
    public static void main(String[] args) {
        System.out.println(10 < 5); // false
        int num_1 = 10;
        int num_2 = 12;
        System.out.println(num_1 < num_2); // true
        System.out.println(num_2 >= 100); // false
        System.out.println(num_2 <= 100); // true
        System.out.println(num_2 <= 12); // true
        System.out.println("========================"); // true
        System.out.println(10 == 10); // true
        System.out.println(20 != 25); // true
        System.out.println(25 != 25); // false
        System.out.println("========================"); // true
        int x = 2;
        // System.out.println(1 < x < 3); 错误写法


    }
}
