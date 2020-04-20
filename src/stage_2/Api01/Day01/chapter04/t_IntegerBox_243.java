package stage_2.Api01.Day01.chapter04;

/*
    自动装箱于自动拆箱：基本类型的数据和包装类之间可以自动相互转换
    JDK1.5之后出现的新特性
 */

import java.util.ArrayList;

public class t_IntegerBox_243 {
    public static void main(String[] args) {
        /*
        自动装箱：直接把int类型的整数赋值给包装类
        Integer in = 1; 相当于Integer in = new Integer(1);
         */
        Integer in = 1;
        /*
        自动拆箱：in是包装类，无法直接参与运算，可以自动的转换为基本数据类型，再进行计算
        in + 2;相当于in.intValue() + 2
        in = in.intValue() + 2 = 3 又是一个叫自动装箱
         */
        in = in + 2;

        ArrayList<Integer> list = new ArrayList<>();
        /*
            ArrayList集合无法直接存储整数，可以存储Integer包装类
         */
        list.add(1); // --> 自动装箱 list.add(new Integer(1));
        int a = list.get(0); // --> 自动拆箱 list.get(0).intValue();
    }
}
