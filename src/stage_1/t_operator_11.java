package stage_1;

/*
自增运算法：++
自减运算符：--
基本含义：让一个变量涨一个数字1，或让一个变量降一个数字1
使用格式：写在变量名称之前，或写在变量名称之后，例如：++num或num++
使用方式：
    1、单独使用：不和其他任何操作混合，自己独立成为一个步骤
    2、混合使用个：和其他操作混合，例如与赋值混合，或者与打印操作混合，等。
使用区别：
    1、在单独使用的时候，前++和后++没有任何区别
    2、在混合的时候，有重大区别
        A：如果是前++，那么这个变量立刻马上+1,然后拿着结果进行使用，【先加后用】
        B：如果是后++，那么首先使用变量本来的数值，然后再让变量+1，【先用后加】
注意事项：
    只有变量才能使用自增，自减运算符，常量不可以发生改变，所以不能使用
 */
public class t_operator_11 {
    public static void main(String[] args) {
        int num_1 = 10;
        System.out.println(num_1); // 10
        ++num_1; // 单独使用，前++
        System.out.println(num_1); // 11
        num_1++; // 单独使用，后++
        System.out.println(num_1); // 12

        System.out.println("=============================");

        // 于打印操作混合的时候
        int num_2 = 20;
        System.out.println(++num_2); // 混合使用，先++,立刻马上变成21，然后打印21
        System.out.println(num_2);
        System.out.println("=============================");

        // 混合使用，后++，首先使用变量本来的30，然后再让变量+1，得到31
        int num_3 = 30;
        System.out.println(num_3++);
        System.out.println(num_3);

        System.out.println("=============================");

        int num_4 = 40;
        // 和赋值操作混合
        int result_1 = --num_4; // 混合使用，前--,变量立刻马上-1，变成39，然后将变量39交给result_1变量
        System.out.println(result_1); //39
        System.out.println(num_4); //39

        System.out.println("=============================");
        // 混合使用，后--，首先把本来的数字50交给result_2,然后自己再-1变成49
        int num_5 = 50;
        int result_2 = num_5--;
        System.out.println(result_2);
        System.out.println(num_5);

        System.out.println("=============================");

        int x = 10;
        int y = 20;
        int result_3 = ++x + y--;
        System.out.println(result_3);
        System.out.println(x);
        System.out.println(y);


    }
}
