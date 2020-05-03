package Day01.chapter01.test;

import Day01.chapter01.Junit.t_Calculator_1;
import org.junit.Test;

public class t_CalculatorTest_3 {
    /**
     * 测试add方法
     */
    @Test
    public void TestAdd(){
        // System.out.println("我被执行了");
        // 1、创建计算器对象
        t_Calculator_1 c = new t_Calculator_1();
        int add = c.add(1, 2);
        System.out.println(add);
        // 2、调用add方法

    }
}
