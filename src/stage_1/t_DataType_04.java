package stage_1;
/*
变量：程序运行期间，内容可以发生改变的量。
创建一个变量并且使用的格式：
数据类型 变量名称; // 创建了一个变量
变量名称 = 数据值; // 赋值，将右边的数据值赋值教给左边的变量
一步到位的格式：
数据类型 变量名称 = 数据值; // 在创建一个变量的同时，立刻放入制定的数据值
 */

public class t_DataType_04 {
    public static void main(String[] args) {
        // 创建变量
        // 格式：数据类型 变量名称；
        int num_1;
        // 向变量中存入一个数据
        // 格式：变量名称 = 数据值;
        num_1 = 123;
        // 当打印输出变量名称的时候，显示出来的是变量的内容
        System.out.println(num_1);
        // 改变变量当中本来的数据，变成新的数字
        num_1 = 321;
        System.out.println(num_1);

        // 一步到位的格式来定义变量
        // 格式，数据类型 变量名称 = 数据值;
        int num_2 = 123321;
        System.out.println(num_2);
        num_2 = 333222111;
        System.out.println(num_2);
        System.out.println("============================");

        byte num_3 = 30; // 右侧的数值范围不能超过左侧的数据类型的取值范围
        System.out.println(num_3);
//        byte num_4 = 300; 超出了左侧的byte数据范围
//        System.out.println(num_4);
        short num_5 = 50;
        System.out.println(num_5);

        long num_6 = 50000000000L;
        System.out.println(num_6);

        float num_7 = 2.5F;
        System.out.println(num_7);

        double num_8 = 1.2;
        System.out.println(num_8); // 1.2

        char zi_fu_1 = 'A';
        System.out.println(zi_fu_1);

        zi_fu_1 = '我';
        System.out.println(zi_fu_1);

        boolean var_1 = true;
        System.out.println(var_1);

        var_1 = false;
        System.out.println(var_1);

        boolean var2 = var_1;
        System.out.println(var2);

    }


}
