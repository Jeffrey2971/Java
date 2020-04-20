package stage_2.Api01.Day02.chapter07;

/*
    可变参数：JDK1.5之后出现的新特性
    使用前提：
        当方法的参数列表数据类型已经确定，但是参数的个数不确定，就可以使用可变参数
    使用格式：
        定义方法时使用
        修饰符 返回值类型 方法名(数据类型...变量名){}
    可变参数原理：
        可变参数底层就是一个数组，根据传递参数个数不同，会创建不同长度的数组来存储这些参数
        传递的参数个数，可以是0个（不传递）也可也是1,2,3,4...等多个

    可变参数的特殊（终极）写法：


    注意事项：
        1、一个方法的参数列表只能有一个可变参数
        2、如果方法的参数有多个，那么可变参数必须写在参数列表的末尾

 */

public class t_VarArgs_253 {
    public static void main(String[] args) {
        // int i = add();
        int i = add(10, 20);
        System.out.println(i);
        System.out.println("--------------");
        method("a", 3.14, 520, 1, 2, 3, 4, 5);
    }

    // public static void method(int...a, String...b){}  错误写法，一个方法的参数只能有一个可变参数

    // public static void method(int...a, String b, double c, int d){}  错误写法，如果方法参数有多个，需写在参数列表末尾

    // 正确写法
    public static void method(String b, double c, int d, int... a) {}

    // 可变参数的特殊（终极）写法
    public static void method1(Object...obj){}

    /*
        定义计算（0-n）整数和方法
        已知：计算整数的和，数据类型已经确定int
        但是参数的个数不确定，不知道要计算几个整数的和，就可以使用可变参数
        add();就会创建长度为0的数组，new int[0]
        add(10, 20);就会创建长度为2的数组，存储传递过来的参数 new int[]{10, 20}
     */

    public static int add(int... array) {
        System.out.println(array); // [I@5479e3f 底层是一个数组
        System.out.println(array.length);
        // 定义一个初始化的变量，记录累加求和
        int sum = 0;

        // 遍历数组，获取数组中的每一个元素
        for (int i : array) {
            // 累加求和
            sum += i;
        }
        // 把求和结果返回
        return sum;
    }

//    // 定义一个方法，计算三个int类型整数的和
//    public static int add(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    // 定义一个方法，计算两个int类型整数的和
//    public static int add(int a, int b) {
//        return a + b;
//    }
}
