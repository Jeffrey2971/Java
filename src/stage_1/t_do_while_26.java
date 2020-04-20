package stage_1;

/*
do-while循环的标准格式
do {
    循环体
} while (条件判断);

扩展格式：
初始化语句
do {
    循环体
    步进语句
}while(条件判断);
 */
public class t_do_while_26 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("你好" + i);

        }
        System.out.println("========================");
        int i = 1; // 初始化语句
        do {
            System.out.println("你好" + i);
            i++;
        }while(i < 10); //条件判断

    }
}
