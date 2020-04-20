package stage_1;

/*
while循环有一个标准格式，还有一个扩展格式。
标准格式：
while (条件判断) {
    循环体
}
扩展格式：
初始化语句;
while (条件判断) {
    循环体;
    步进语句;
}
 */
public class t_while_25 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("你错了" + i);

        }
        System.out.println("=====================");

        int i = 1; //初始化语句
        while (i <= 10) { // 条件判断
            System.out.println("你错了" + i); // 循环体
            i++; // 步进


        }

    }
}
