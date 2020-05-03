/*
与（并且）   &&  全都是True才是True   Python中是and
或（或者）   ||  至少一个是true，才是true    Python中是or
非（取反）   ！  本来是true,变成false，本来是false，变成true

于&&.或||，具有短路效果：如果根据左边已经可以判断得到最终成果，那么右边的代码将不再执行，从而节省一定的性能

注意事项：
    1、逻辑运算符只能用于boolean值
    2、与，或需要左右各自有一个boolean值，但是取反只要有Boolean一个值即可
    3、与，或两种运算符，如有多个条件，可以连续写
    两个条件：条件A && 条件B
    多个条件：条件A && 条件B && 条件C ...
tips:
    对于 1 < x < 3 的情况，应该拆成两个部分，然后使用运算符连接起来
    int x = 2;
    1 < x && x < 3
 */

public class t_operator_14 {
    public static void main(String[] args) {
        // true && true -- > true
        System.out.println(true && false); // false
        System.out.println(true && true); // true
        System.out.println(3 > 2 && 5 < 6); // true
        System.out.println("======================"); // true
        System.out.println(true || false); // true
        System.out.println(true || true); // true
        System.out.println(false || false); // false
        System.out.println("======================"); // true
        System.out.println(true); // true
        System.out.println(!true); // true
        System.out.println("======================"); // true

        int a = 10;
        // false && ...
        System.out.println(3 > 4 && ++a < 100); // false
        System.out.println(a); // 10
        System.out.println("======================"); // true
        int b = 20;
        // true || ...
        System.out.println(3 < 4 || ++b < 100); // true
        System.out.println(b);
    }

}
