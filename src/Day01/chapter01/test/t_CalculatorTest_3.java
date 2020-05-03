package Day01.chapter01.test;

import Day01.chapter01.Junit.t_Calculator_1;
import org.junit.Assert;
import org.junit.Test;

public class t_CalculatorTest_3 {
    /**
     * 测试add方法
     */
    @Test
    public void TestAdd() {
        // System.out.println("我被执行了");
        // 1、创建计算器对象
        t_Calculator_1 c = new t_Calculator_1();
        // 2、调用add方法
        int result = c.add(1, 2);
        // System.out.println(add);

        // 3、断言     我断言这个结果是三
        Assert.assertEquals(3, result);

    }

    @Test
    public void testSub(){
        t_Calculator_1 c = new t_Calculator_1();
        int result = c.sub(1, 2);
        Assert.assertEquals(-1, result);
    }
}
