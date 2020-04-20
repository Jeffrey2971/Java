package stage_2.Api01.Day01.chapter04;

/*
    装箱：把基本类型的数据，包装到包装类中（基本类型的数据-->包装类）
        构造方法：
            Integer(int value)构造一个新分配的 Integer 对象，它表示指定的 int 值。
            Integer(String s)构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。
                传递的字符串，必须是基本类型的字符串，否则会抛出异常 "100"正确 "a"异常
        静态方法：
            static Integer	valueOf(int i)返回一个表示指定的 int 值的 Integer 实例。
            static Integer	valueOf(String s) 返回保存指定的 String 的值的 Integer 对象。

     拆箱：在包装类中取出基本类型数据（包装类-->基本类型的数据）
        成员方法：
            intValue()以 int 类型返回该 Integer 的值。
 */

public class t_IntegerBox_242 {
    public static void main(String[] args) {
        // 把基本类型的数据，包装到包装类中（基本类型的数据-->包装类）
        // 构造方法
        Integer in1 = new Integer(1); // 方法有横线：说明方法已过时
        System.out.println(in1); // 1 重写了toString方法

        Integer in2 = new Integer("2");
        System.out.println(in2);

        // 静态方法
        Integer in3 = Integer.valueOf(3);
        System.out.println(in3);

        Integer in4 = Integer.valueOf("3");
        System.out.println(in4);

//        Integer in5 = Integer.valueOf("a");  错误写法，NumberFormatException，数字格式化异常
//        System.out.println(in5);

        // 拆箱：在包装类中取出基本类型数据（包装类-->基本类型的数据）
        int i = in1.intValue();
        System.out.println(i);
    }
}
