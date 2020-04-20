package stage_1;

/*
使用变量的时候注意事项：
    1、如果创建多个变量，那么变量之间的名称不可以重复
    2、对于float和long类型来说，字母后缀F和L不能丢掉
    3、如果使用byte和short类型的变量，那么右侧的数据值范围也不能超过左侧类型的范围
    4、没有进行复制的变量，不能直接使用
    5、变量使用不能超过作用域的范围
        【作用域】：从定义变量的一行开始，一直到所属的大括号结束为止。
    6、可以通过一个语句来创建多个变量，但是一般情况下不推荐这么写
 */

public class t_DataType_05 {
    public static void main(String[] args) {
        int num_1 = 10; // 创建了一个新的变量，名叫num_1
//        int num_1 = 20; // 创建了另一个新的变量，也叫num_1，这样会报错
        int num_2; // 定义了一个变量，但是没有进行赋值会报错
//        System.out.println(num_2); 不能直接打印输出


//        System.out.println(num_3);
//        int num_3 = 500; 先创建后使用

//        {
//            int num_4 = 40;
//        }
//        System.out.println(num_4); 超出了 num_4的作用域，所以报错
//        int a = 10;
//        int b = 20;
//        int c = 30;
        int a, b, c; // 同时创建三个int变量
        a = 10;
        b = 20;
        c = 30;
        System.out.println(a); // 10
        System.out.println(b); // 20
        System.out.println(c); // 30
        // 同时创建三个int变量，并且同时各自赋值
        int x = 100, y = 200, z = 300;
        System.out.println(x); //100
        System.out.println(y); //200
        System.out.println(z); //300
    }
}
