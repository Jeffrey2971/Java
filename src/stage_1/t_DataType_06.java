package stage_1;

/*
当数据类型不一致时，将会发生数据类型转换
自动类型转换（隐式）
    1、特点：代码不需要进行特殊处理，自动完成转换
    2、规则：数据范围从小到大,与字节数不一定相关
强制类型转换（显示）
 */
public class t_DataType_06 {
    public static void main(String[] args) {
        System.out.println(1024);  // 整数，默认就是int类型
        System.out.println(10.24);  // 浮点数，默认double类型

        // 左边是long类型，右边是默认的int类型，左右并不一样
        // 一个等号代表赋值，将右侧int常量，交给左侧的long变量进行存储
        // int --> long，符合数据范围从小到大要
        long num_1 = 100; // 这行代码发生了数据类型转换
        System.out.println(num_1); // 100


        // 左边是double类型，右边是float类型，左右不一样
        // float --> double，符合从小到大，也发生了自动类型转换
        double num_2 = 2.5F;
        System.out.println(num_2);

        // 左边是float类型，右边是long类型，左右不一样
        // long --> float,范围是float更大一些，符合从小到大规则
        float num_3 = 30L;
        System.out.println(num_3);

    }
}
