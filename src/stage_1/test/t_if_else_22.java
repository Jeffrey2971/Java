package stage_1.test;

/*
题目：使用三元运算符和标准的if-else语句分别实现：取两个数字当中最大值
 */

public class t_if_else_22 {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        // 首先使用三元运算符
        int max_1 = a > b ? a:b;
        System.out.println("最大值是" + max_1);

        // 使用if语句实现
        int max_2;
        if (a > b){
            max_2 = a;
        } else{
            max_2 = b;
        }
        System.out.println(max_2);
    }
}
