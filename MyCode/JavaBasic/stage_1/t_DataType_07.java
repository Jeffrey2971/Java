/*
强制类型转换
    1、特点：代码需要进行特殊的格式处理，不能自动完成
    2、格式：范围小的类型 范围小的变量名 = (范围小的类型) 原本范围大的数据;

注意事项：
    1、强制类型转换一般不推荐使用，因为有可能发生精度损失，数据溢出
    2、byte/short/char 这三种类型都可以发生数学运算，例如加法 “+”
    3、byte/short/char 这三种类型在运算的时候，都会被首先提升为int类型，然后再进行计算
    4、Java的boolean类型不能发生数据类型转换
 */

public class t_DataType_07 {
    public static void main(String[] args) {
        // 左边是int类型，右边是long类型，双方不一样
        // long --> int,违反了从小到大，所有不能发生自动类型转换
        // 格式：范围小的类型 范围小的变量名 = (范围小的类型) 原本范围大的数据;
        int num_1 = (int) 100L;
        System.out.println(num_1);

        // long强制转换为int类型
        int num_2 = (int) 6000000000L; // 1705032704
        System.out.println(num_2);

        // double --> int,强制类型转换
        int num_3 = (int) 3.99; // 精度丢失，不会四舍五入
        System.out.println(num_3); // 3

        // 计算机的底层会使用一个数字（二进制形式）来代表字符A，一旦char类型进行了数学运算，那么字符就会按照一定的规则翻译一个数字
        char zi_fu_1 = 'A'; // 这是一个字符型，大写A，就是65
        System.out.println(zi_fu_1 + 1); // 66，也就是大写字母A被当成65处理了

        byte num_4 = 40; // 右侧的数值大小不能超过左侧的类型范围
        byte num_5 = 50;
        // byte + byte --> int + int --> int
        int result_1 = num_4 + num_5;
        System.out.println(result_1);

        short num_6 = 60;
        // byte + short --> int + int --> int
        // int 强制转换为short：注意必须保证逻辑上真实大小本来就没有超过short范围大小，否则会造成数据溢出
        short result_2 = (short) (num_4 + num_6);
        System.out.println(result_2);
    }
}
