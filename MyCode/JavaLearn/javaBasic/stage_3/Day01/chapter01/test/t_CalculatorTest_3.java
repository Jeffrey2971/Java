package stage_3.Day01.chapter01.test;

import stage_3.Day01.chapter01.Junit.t_Calculator_1;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class t_CalculatorTest_3 {
    /**
     * 初始化方法
     *  用于资源的申请，所有测试方法在执行之前都会先执行该方法
     *  用法：@Before
     */
    @Before
    public void init(){
        System.out.println("init... ...");
    }

    /**
     * 释放资源的方法：
     *  在所有测试方法执行完毕之后都会自动执行该方法
     *  用法：@After
     */
    @After
    public void close(){
        System.out.println("close... ...");

    }


    /**
     * 测试add方法
     */
    @Test
    public void TestAdd() {
        // System.out.println("我被执行了");
        System.out.println("testAdd... ...");
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
        System.out.println("testSub");
        Assert.assertEquals(-1, result);
    }
}