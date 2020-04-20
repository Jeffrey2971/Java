package stage_1;

/*
对于byte/short/char三种类型来说，如果右侧复制的数值没有超过范围
那么javac编译器会自动隐含的补上(byte)(short)(char)

在给变量赋值的时候，如果右侧的表达式中全都是常量，没有任何变量
那么便一起javac将会直接将若干个常量表达式计算得到结果
short result = 5 + 8; // 等号右边全部都是常量，没有任何变量参与运算
编译之后，得到的.class字节码文件相当于【直接就是】：
short result = 13;
右侧的常量结果数值，没有超过左侧范围，所以正确、

这称为‘编译器的常量优化’
注意：一旦表达式中有变量参与，那么就不能进行这种优化了
 */
public class t_notice_17 {
    public static void main(String[] args){
        short num_1 = 10; // 正确写法，右侧没有超过左侧的范围

        short a = 5;
        short b = 8;
        // short + short --> int + int --> int
        // short result = a + b; // 错误的写法！左侧需要的是int类型
        // 右侧不用变量，而是采用常量，而且只有两个常量，没有其他
        short result = 5 + 9;
        System.out.println(result);


    }
}
