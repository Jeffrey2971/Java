package stage_1.test;

/*
题目要求：定义一个方法，用于打印指定次数的 HelloWorld
 */
public class t_method_35 {
    public static void main(String[] args) {
        printCount(20);
    }

    public static void printCount(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println("Hello,World！" + i);
        }

    }


}
